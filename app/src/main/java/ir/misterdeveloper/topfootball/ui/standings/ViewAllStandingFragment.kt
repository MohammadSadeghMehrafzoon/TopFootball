package ir.misterdeveloper.topfootball.ui.standings

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ahmadrosid.svgloader.SvgLoader
import com.facebook.shimmer.ShimmerFrameLayout
import com.squareup.picasso.Picasso
import io.reactivex.SingleObserver
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import ir.misterdeveloper.topfootball.R
import ir.misterdeveloper.topfootball.adapter.ViewAllStandingsAdapter
import ir.misterdeveloper.topfootball.databinding.FragmentViewAllStandingBinding
import ir.misterdeveloper.topfootball.model.Repository.FootballRepository
import ir.misterdeveloper.topfootball.model.Response.StandingsResponse
import ir.misterdeveloper.topfootball.util.ApiServiceSingleton
import ir.misterdeveloper.topfootball.util.NetworkChecker


class ViewAllStandingFragment : Fragment() {
    lateinit var binding: FragmentViewAllStandingBinding
    private lateinit var standingsViewModel: StandingsViewModel
    val compositeDisposable = CompositeDisposable()
    private val shimmerFrameLayout: ShimmerFrameLayout? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentViewAllStandingBinding.inflate(layoutInflater)

        standingsViewModel = ViewModelProvider(
            this,
            StandingViewModelFactory(FootballRepository(ApiServiceSingleton.apiService!!))
        )[StandingsViewModel::class.java]


        val networkChecker = NetworkChecker(requireContext())
        val network: Boolean = networkChecker.isInternetConnected

        if (!network) {

            Toast.makeText(activity, getString(R.string.message_check_internet), Toast.LENGTH_LONG).show()

        } else {


            getViewAllStanding()

        }

        binding.swipeRefresh.setOnRefreshListener {


            val networkChecker = NetworkChecker(requireContext())
            val network: Boolean = networkChecker.isInternetConnected

            if (!network) {

                Toast.makeText(activity, getString(R.string.message_check_internet), Toast.LENGTH_LONG).show()
                binding.swipeRefresh.isRefreshing = false

            } else {


                getViewAllStanding()
                binding.swipeRefresh.isRefreshing = false


            }


        }


        binding.imageViewBack.setOnClickListener {
            findNavController().navigate(R.id.action_viewAllStandingFragment_to_standigsFragment2)

        }


        return binding.root
    }


   private fun getViewAllStanding() {

        val codeNameLeague = ViewAllStandingFragmentArgs.fromBundle(requireArguments()).nameLeague
        standingsViewModel.getStanding(codeNameLeague)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : SingleObserver<StandingsResponse> {
                override fun onSubscribe(d: Disposable) {
                    compositeDisposable.add(d)

                }

                override fun onSuccess(standingsResponse: StandingsResponse) {


                    Picasso.get().load(standingsResponse.competition.emblem)
                        .placeholder(R.drawable.default_crest)
                        .into(binding.imageViewLeague)

                    binding.textViewNameLeague.text = standingsResponse.competition.name

                    binding.textViewNameLeague.visibility = View.VISIBLE
                    binding.imageViewLeague.visibility = View.VISIBLE

                    binding.recyclerStandings.adapter =
                        ViewAllStandingsAdapter(
                            requireContext().applicationContext,
                            standingsResponse,
                            requireActivity()
                        )
                    binding.recyclerStandings.layoutManager = LinearLayoutManager(
                        requireContext().applicationContext,
                        RecyclerView.VERTICAL,
                        false
                    )


                    // Gone Shimmer Effect
                    shimmerFrameLayout?.stopShimmer()
                    binding.shimmerViewStandings.visibility = View.GONE


                }


                override fun onError(e: Throwable) {



                }

            })
    }


    override fun onDestroy() {
        super.onDestroy()
        compositeDisposable.clear()
    }


}