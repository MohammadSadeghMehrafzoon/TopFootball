package ir.misterdeveloper.topfootball.ui.topPlayer

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.facebook.shimmer.ShimmerFrameLayout
import com.squareup.picasso.Picasso
import io.reactivex.SingleObserver
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import ir.misterdeveloper.topfootball.R
import ir.misterdeveloper.topfootball.adapter.MatchAdapter
import ir.misterdeveloper.topfootball.databinding.FragmentPlayerInformationBinding
import ir.misterdeveloper.topfootball.model.Repository.FootballRepository
import ir.misterdeveloper.topfootball.model.Response.PersonResponse
import ir.misterdeveloper.topfootball.ui.home.HomeViewModel
import ir.misterdeveloper.topfootball.ui.home.HomeViewModelFactory
import ir.misterdeveloper.topfootball.util.ApiServiceSingleton
import ir.misterdeveloper.topfootball.util.NetworkChecker


class PlayerInformationFragment : Fragment() {

    lateinit var binding: FragmentPlayerInformationBinding
    private lateinit var homeViewModel: HomeViewModel
    val compositeDisposable = CompositeDisposable()
    private val shimmerFrameLayout: ShimmerFrameLayout? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentPlayerInformationBinding.inflate(layoutInflater)

        homeViewModel = ViewModelProvider(
            this,
            HomeViewModelFactory(FootballRepository(ApiServiceSingleton.apiService!!))
        )[HomeViewModel::class.java]




        val networkChecker = NetworkChecker(requireContext())
        val network: Boolean = networkChecker.isInternetConnected

        if (!network) {

            Toast.makeText(activity, getString(R.string.message_check_internet), Toast.LENGTH_LONG).show()

        } else {


            getInformationPlayer()

        }

        binding.swipeRefresh.setOnRefreshListener {


            val networkChecker = NetworkChecker(requireContext())
            val network: Boolean = networkChecker.isInternetConnected

            if (!network) {

                Toast.makeText(activity, getString(R.string.message_check_internet), Toast.LENGTH_LONG).show()
                binding.swipeRefresh.isRefreshing = false

            } else {


                getInformationPlayer()
                binding.swipeRefresh.isRefreshing = false


            }


        }




        return binding.root
    }


   private fun getInformationPlayer(){

        when (PlayerInformationFragmentArgs.fromBundle(requireArguments()).playerName) {

            "Messi" -> {


                Picasso.get().load(R.drawable.messi_top)
                    .into(binding.imageView3)

                homeViewModel.getInformationMessi()
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(object : SingleObserver<PersonResponse> {
                        override fun onSubscribe(d: Disposable) {
                            compositeDisposable.add(d)
                        }

                        override fun onSuccess(matchResponse: PersonResponse) {

                            binding.Name.text = matchResponse.person.name
                            binding.dateOfBirth.text = matchResponse.person.dateOfBirth
                            binding.nationality.text = matchResponse.person.nationality
                            binding.position.text = matchResponse.person.position

                            binding.playerMatcheRecycler.adapter =
                                MatchAdapter(
                                    requireContext().applicationContext,
                                    matchResponse = matchResponse.matches,
                                    requireActivity()
                                )
                            binding.playerMatcheRecycler.layoutManager = LinearLayoutManager(
                                requireContext().applicationContext,
                                RecyclerView.VERTICAL,
                                false
                            )

                            // Gone Shimmer Effect
                            shimmerFrameLayout?.stopShimmer()
                            binding.shimmerViewMatches.visibility = View.GONE

                        }

                        override fun onError(e: Throwable) {

                            Log.v("dd", "ddd")

                        }

                    })
            }
            "Ronaldo" -> {

                Picasso.get().load(R.drawable.ronaldo_top)
                    .into(binding.imageView3)

                homeViewModel.getInformationRonaldo()
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(object : SingleObserver<PersonResponse> {
                        override fun onSubscribe(d: Disposable) {
                            compositeDisposable.add(d)
                        }

                        override fun onSuccess(matchResponse: PersonResponse) {

                            binding.Name.text = matchResponse.person.name
                            binding.dateOfBirth.text = matchResponse.person.dateOfBirth
                            binding.nationality.text = matchResponse.person.nationality
                            binding.position.text = matchResponse.person.position

                            binding.playerMatcheRecycler.adapter =
                                MatchAdapter(
                                    requireContext().applicationContext,
                                    matchResponse = matchResponse.matches,
                                    requireActivity()
                                )
                            binding.playerMatcheRecycler.layoutManager = LinearLayoutManager(
                                requireContext().applicationContext,
                                RecyclerView.VERTICAL,
                                false
                            )

                            // Gone Shimmer Effect
                            shimmerFrameLayout?.stopShimmer()
                            binding.shimmerViewMatches.visibility = View.GONE

                        }

                        override fun onError(e: Throwable) {

                            Log.v("dd", "ddd")

                        }

                    })
            }
            "Neymar" -> {


                Picasso.get().load(R.drawable.neymar_top)
                    .into(binding.imageView3)

                homeViewModel.getInformationNeymar()
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(object : SingleObserver<PersonResponse> {
                        override fun onSubscribe(d: Disposable) {
                            compositeDisposable.add(d)
                        }

                        override fun onSuccess(matchResponse: PersonResponse) {

                            binding.Name.text = matchResponse.person.name
                            binding.dateOfBirth.text = matchResponse.person.dateOfBirth
                            binding.nationality.text = matchResponse.person.nationality
                            binding.position.text = matchResponse.person.position

                            binding.playerMatcheRecycler.adapter =
                                MatchAdapter(
                                    requireContext().applicationContext,
                                    matchResponse = matchResponse.matches,
                                    requireActivity()
                                )
                            binding.playerMatcheRecycler.layoutManager = LinearLayoutManager(
                                requireContext().applicationContext,
                                RecyclerView.VERTICAL,
                                false
                            )

                            // Gone Shimmer Effect
                            shimmerFrameLayout?.stopShimmer()
                            binding.shimmerViewMatches.visibility = View.GONE

                        }

                        override fun onError(e: Throwable) {

                            Log.v("dd", "ddd")

                        }

                    })
            }

            "Lewandowski" -> {


                Picasso.get().load(R.drawable.lawadoski_top)
                    .into(binding.imageView3)

                homeViewModel.getInformationLewandowski()
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(object : SingleObserver<PersonResponse> {
                        override fun onSubscribe(d: Disposable) {
                            compositeDisposable.add(d)
                        }

                        override fun onSuccess(matchResponse: PersonResponse) {

                            binding.Name.text = matchResponse.person.name
                            binding.dateOfBirth.text = matchResponse.person.dateOfBirth
                            binding.nationality.text = matchResponse.person.nationality
                            binding.position.text = matchResponse.person.position

                            binding.playerMatcheRecycler.adapter =
                                MatchAdapter(
                                    requireContext().applicationContext,
                                    matchResponse = matchResponse.matches,
                                    requireActivity()
                                )
                            binding.playerMatcheRecycler.layoutManager = LinearLayoutManager(
                                requireContext().applicationContext,
                                RecyclerView.VERTICAL,
                                false
                            )

                            // Gone Shimmer Effect
                            shimmerFrameLayout?.stopShimmer()
                            binding.shimmerViewMatches.visibility = View.GONE

                        }

                        override fun onError(e: Throwable) {

                            Log.v("dd", "ddd")

                        }

                    })
            }

            "Benzema" -> {

                Picasso.get().load(R.drawable.benzmba_top)
                    .into(binding.imageView3)

                homeViewModel.getInformationBenzema()
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(object : SingleObserver<PersonResponse> {
                        override fun onSubscribe(d: Disposable) {
                            compositeDisposable.add(d)
                        }

                        override fun onSuccess(matchResponse: PersonResponse) {

                            binding.Name.text = matchResponse.person.name
                            binding.dateOfBirth.text = matchResponse.person.dateOfBirth
                            binding.nationality.text = matchResponse.person.nationality
                            binding.position.text = matchResponse.person.position

                            binding.playerMatcheRecycler.adapter =
                                MatchAdapter(
                                    requireContext().applicationContext,
                                    matchResponse = matchResponse.matches,
                                    requireActivity()
                                )
                            binding.playerMatcheRecycler.layoutManager = LinearLayoutManager(
                                requireContext().applicationContext,
                                RecyclerView.VERTICAL,
                                false
                            )

                            // Gone Shimmer Effect
                            shimmerFrameLayout?.stopShimmer()
                            binding.shimmerViewMatches.visibility = View.GONE

                        }

                        override fun onError(e: Throwable) {

                            Log.v("dd", "ddd")

                        }

                    })
            }

        }

    }




}