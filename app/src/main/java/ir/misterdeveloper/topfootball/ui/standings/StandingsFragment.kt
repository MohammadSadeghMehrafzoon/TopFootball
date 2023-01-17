package ir.misterdeveloper.topfootball.ui.standings

import android.graphics.Path
import android.os.Bundle
import android.os.Handler
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.facebook.shimmer.ShimmerFrameLayout
import io.reactivex.SingleObserver
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import ir.misterdeveloper.topfootball.R
import ir.misterdeveloper.topfootball.adapter.MatchAdapter
import ir.misterdeveloper.topfootball.adapter.StandingsAdapter
import ir.misterdeveloper.topfootball.databinding.FragmentStandigsBinding
import ir.misterdeveloper.topfootball.model.Repository.FootballRepository
import ir.misterdeveloper.topfootball.model.Response.StandingsResponse
import ir.misterdeveloper.topfootball.util.ApiServiceSingleton
import ir.misterdeveloper.topfootball.util.NetworkChecker
import java.util.*
import java.util.concurrent.TimeUnit
import android.os.CountDownTimer


class StandingsFragment : Fragment() {

    lateinit var binding: FragmentStandigsBinding
    private lateinit var standingsViewModel: StandingsViewModel
    val compositeDisposable = CompositeDisposable()
    private val shimmerFrameLayout: ShimmerFrameLayout? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentStandigsBinding.inflate(layoutInflater)

        standingsViewModel = ViewModelProvider(
            this,
            StandingViewModelFactory(FootballRepository(ApiServiceSingleton.apiService!!))
        )[StandingsViewModel::class.java]


        val networkChecker = NetworkChecker(requireContext())
        val network: Boolean = networkChecker.isInternetConnected

        if (!network) {

            Toast.makeText(activity, getString(R.string.message_check_internet), Toast.LENGTH_LONG).show()

        } else {


            getStanding()

        }


        binding.swipeRefresh.setOnRefreshListener {


            val networkChecker = NetworkChecker(requireContext())
            val network: Boolean = networkChecker.isInternetConnected

            if (!network) {

                Toast.makeText(activity, getString(R.string.message_check_internet), Toast.LENGTH_LONG).show()
                binding.swipeRefresh.isRefreshing = false

            } else {


                getStanding()
                binding.swipeRefresh.isRefreshing = false


            }


        }



        binding.textViewSeeAllLaliga.setOnClickListener {
            findNavController().navigate(
                StandingsFragmentDirections.actionStandigsFragmentToViewAllStandingFragment()
                    .setNameLeague("PD")
            )
        }


        binding.textViewSeeAllPremierLeague.setOnClickListener {
            findNavController().navigate(
                StandingsFragmentDirections.actionStandigsFragmentToViewAllStandingFragment()
                    .setNameLeague("PL")
            )
        }


        binding.textViewSeeAllSerieA.setOnClickListener {
            findNavController().navigate(
                StandingsFragmentDirections.actionStandigsFragmentToViewAllStandingFragment()
                    .setNameLeague("SA")
            )
        }


        binding.textViewSeeAllLigue1.setOnClickListener {
            findNavController().navigate(
                StandingsFragmentDirections.actionStandigsFragmentToViewAllStandingFragment()
                    .setNameLeague("FL1")
            )
        }

        binding.textViewSeeAllBundesliga.setOnClickListener {
            findNavController().navigate(
                StandingsFragmentDirections.actionStandigsFragmentToViewAllStandingFragment()
                    .setNameLeague("BL1")
            )
        }


        return binding.root
    }


    private fun getStanding() {


        //Spanish league Standing
        standingsViewModel.getStanding("PD")
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : SingleObserver<StandingsResponse> {
                override fun onSubscribe(d: Disposable) {
                    compositeDisposable.add(d)

                }

                override fun onSuccess(standingsResponse: StandingsResponse) {
                    binding.recyclerStandingsLaliga.adapter =
                        StandingsAdapter(
                            requireContext().applicationContext,
                            standingsResponse,
                            requireActivity()
                        )
                    binding.recyclerStandingsLaliga.layoutManager = LinearLayoutManager(
                        requireContext().applicationContext,
                        RecyclerView.VERTICAL,
                        false
                    )

                    // Gone Shimmer Effect
                    shimmerFrameLayout?.stopShimmer()
                    binding.shimmerViewLaLiga.visibility = View.GONE

                }


                override fun onError(e: Throwable) {



                }

            })

        //Premier league Standing
        standingsViewModel.getStanding("PL")
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : SingleObserver<StandingsResponse> {
                override fun onSubscribe(d: Disposable) {
                    compositeDisposable.add(d)

                }

                override fun onSuccess(standingsResponse: StandingsResponse) {
                    binding.recyclerStandingsPremierLeague.adapter =
                        StandingsAdapter(
                            requireContext().applicationContext,
                            standingsResponse,
                            requireActivity()
                        )
                    binding.recyclerStandingsPremierLeague.layoutManager =
                        LinearLayoutManager(
                            requireContext().applicationContext,
                            RecyclerView.VERTICAL,
                            false
                        )

                    // Gone Shimmer Effect
                    shimmerFrameLayout?.stopShimmer()
                    binding.shimmerViewPremierLeague.visibility = View.GONE
                }


                override fun onError(e: Throwable) {

                    //Toast.makeText(activity, "Testrrrrr", Toast.LENGTH_LONG).show()


                }

            })


        //French league  1 standings
        standingsViewModel.getStanding("FL1")
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : SingleObserver<StandingsResponse> {
                override fun onSubscribe(d: Disposable) {
                    compositeDisposable.add(d)

                }

                override fun onSuccess(standingsResponse: StandingsResponse) {
                    binding.recyclerStandingsLigue1.adapter =
                        StandingsAdapter(
                            requireContext().applicationContext,
                            standingsResponse,
                            requireActivity()
                        )
                    binding.recyclerStandingsLigue1.layoutManager = LinearLayoutManager(
                        requireContext().applicationContext,
                        RecyclerView.VERTICAL,
                        false
                    )

                    // Gone Shimmer Effect
                    shimmerFrameLayout?.stopShimmer()
                    binding.shimmerViewLigue1.visibility = View.GONE
                }


                override fun onError(e: Throwable) {

                    // Toast.makeText(activity, "Testrrrrr", Toast.LENGTH_LONG).show()


                }

            })

        //Serie A standings
        standingsViewModel.getStanding("SA")
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : SingleObserver<StandingsResponse> {
                override fun onSubscribe(d: Disposable) {
                    compositeDisposable.add(d)

                }

                override fun onSuccess(standingsResponse: StandingsResponse) {
                    binding.recyclerStandingsSerieA.adapter =
                        StandingsAdapter(
                            requireContext().applicationContext,
                            standingsResponse,
                            requireActivity()
                        )
                    binding.recyclerStandingsSerieA.layoutManager = LinearLayoutManager(
                        requireContext().applicationContext,
                        RecyclerView.VERTICAL,
                        false
                    )

                    // Gone Shimmer Effect
                    shimmerFrameLayout?.stopShimmer()
                    binding.shimmerViewSerieA.visibility = View.GONE
                }


                override fun onError(e: Throwable) {

                    //Toast.makeText(activity, "Testrrrrr", Toast.LENGTH_LONG).show()


                }

            })

        //Bundesliga standings
        standingsViewModel.getStanding("BL1")
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : SingleObserver<StandingsResponse> {
                override fun onSubscribe(d: Disposable) {
                    compositeDisposable.add(d)

                }

                override fun onSuccess(standingsResponse: StandingsResponse) {
                    binding.recyclerStandingsBundesliga.adapter =
                        StandingsAdapter(
                            requireContext().applicationContext,
                            standingsResponse,
                            requireActivity()
                        )
                    binding.recyclerStandingsBundesliga.layoutManager =
                        LinearLayoutManager(
                            requireContext().applicationContext,
                            RecyclerView.VERTICAL,
                            false
                        )

                    // Gone Shimmer Effect
                    shimmerFrameLayout?.stopShimmer()
                    binding.shimmerViewBundesliga.visibility = View.GONE
                }


                override fun onError(e: Throwable) {

                    //  Toast.makeText(activity, "Testrrrrr", Toast.LENGTH_LONG).show()


                }

            })

    }


    override fun onDestroy() {
        super.onDestroy()
        compositeDisposable.clear()
    }
}

