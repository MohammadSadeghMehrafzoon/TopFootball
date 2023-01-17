package ir.misterdeveloper.topfootball.ui.home

import android.opengl.Visibility
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import io.reactivex.disposables.CompositeDisposable
import ir.misterdeveloper.topfootball.databinding.FragmentHomeBinding
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import io.reactivex.SingleObserver
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import ir.misterdeveloper.topfootball.adapter.LiveMatchesAdapter
import ir.misterdeveloper.topfootball.adapter.MatchAdapter
import ir.misterdeveloper.topfootball.model.Repository.FootballRepository
import ir.misterdeveloper.topfootball.model.Response.Match
import ir.misterdeveloper.topfootball.model.Response.MatchResponse
import ir.misterdeveloper.topfootball.util.ApiServiceSingleton
import com.facebook.shimmer.ShimmerFrameLayout
import ir.misterdeveloper.topfootball.R
import ir.misterdeveloper.topfootball.model.Response.MatchInformationResponse
import ir.misterdeveloper.topfootball.model.Response.PersonResponse
import ir.misterdeveloper.topfootball.util.NetworkChecker
import java.util.concurrent.TimeUnit


class HomeFragment : Fragment() {
    lateinit var binding: FragmentHomeBinding
    private lateinit var homeViewModel: HomeViewModel
    val compositeDisposable = CompositeDisposable()
    private val shimmerFrameLayout: ShimmerFrameLayout? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater)

        homeViewModel = ViewModelProvider(
            this,
            HomeViewModelFactory(FootballRepository(ApiServiceSingleton.apiService!!))
        )[HomeViewModel::class.java]


        val networkChecker = NetworkChecker(requireContext())
        val network: Boolean = networkChecker.isInternetConnected

        if (!network) {

            Toast.makeText(activity, getString(R.string.message_check_internet), Toast.LENGTH_LONG).show()

        } else {


           getMatches()


        }
        binding.swipeRefresh.setOnRefreshListener {


            val networkChecker = NetworkChecker(requireContext())
            val network: Boolean = networkChecker.isInternetConnected

            if (!network) {

                Toast.makeText(activity, getString(R.string.message_check_internet), Toast.LENGTH_LONG).show()
                binding.swipeRefresh.isRefreshing = false

            } else {


               getMatches()
                binding.swipeRefresh.isRefreshing = false


            }


        }






        binding.textViewSeeAll.setOnClickListener(View.OnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_matchesFragment)
        })

        return binding.root
    }

    private fun getMatches() {

        homeViewModel.getMatch()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : SingleObserver<MatchResponse> {
                override fun onSubscribe(d: Disposable) {
                    compositeDisposable.add(d)
                }

                override fun onSuccess(matchResponse: MatchResponse) {


                    binding.recyclerMatches.adapter =
                        MatchAdapter(
                            requireContext().applicationContext,
                            matchResponse = matchResponse.matches,
                            requireActivity())
                    binding.recyclerMatches.layoutManager = LinearLayoutManager(
                        requireContext().applicationContext,
                        RecyclerView.VERTICAL,
                        false
                    )


                    // Gone Shimmer Effect
                    shimmerFrameLayout?.stopShimmer()
                    binding.shimmerViewMatches.visibility = View.GONE


                }

                override fun onError(e: Throwable) {


                }

            })

        homeViewModel.getLiveMatches("LIVE")
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : SingleObserver<MatchResponse> {
                override fun onSubscribe(d: Disposable) {
                    compositeDisposable.add(d)
                }

                override fun onSuccess(matchResponse: MatchResponse) {


                    if (matchResponse.matches.isEmpty()) {

                        binding.notPlaying.visibility = View.VISIBLE
                        shimmerFrameLayout?.stopShimmer()
                        binding.shimmerViewLiveMatches.visibility = View.GONE

                    } else {

                        binding.recyclerLiveMatches.adapter =
                            LiveMatchesAdapter(
                                requireContext().applicationContext,
                                matchResponse,
                                requireActivity()
                            )
                        binding.recyclerLiveMatches.layoutManager = LinearLayoutManager(
                            requireContext().applicationContext,
                            RecyclerView.HORIZONTAL,
                            false
                        )

                        // Gone Shimmer Effect
                        shimmerFrameLayout?.stopShimmer()
                        binding.shimmerViewLiveMatches.visibility = View.GONE

                    }


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



