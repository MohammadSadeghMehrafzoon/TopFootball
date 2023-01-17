package ir.misterdeveloper.topfootball.ui.matches


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView
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
import ir.misterdeveloper.topfootball.adapter.LeagueAdapter
import ir.misterdeveloper.topfootball.adapter.MatchAdapter
import ir.misterdeveloper.topfootball.adapter.SortMatchAdapter
import ir.misterdeveloper.topfootball.databinding.FragmentMatchesBinding
import ir.misterdeveloper.topfootball.model.Repository.FootballRepository
import ir.misterdeveloper.topfootball.model.Response.Match
import ir.misterdeveloper.topfootball.model.Response.MatchResponse
import ir.misterdeveloper.topfootball.model.dataClass.League
import ir.misterdeveloper.topfootball.ui.home.HomeViewModel
import ir.misterdeveloper.topfootball.ui.home.HomeViewModelFactory
import ir.misterdeveloper.topfootball.util.ApiServiceSingleton


class MatchesFragment : Fragment(), LeagueAdapter.ClickEvent {

    lateinit var binding: FragmentMatchesBinding
    private lateinit var homeViewModel: HomeViewModel
    val compositeDisposable = CompositeDisposable()
    private val shimmerFrameLayout: ShimmerFrameLayout? = null
    var lead: ArrayList<Match?> = ArrayList()


    private val listOfLeagues = listOf(

        League("All", 1),
        League("Laliga", 2),
        League("Premier League", 3),
        League("Ligue 1", 3),
        League("Serie A", 4),
        League("Bundesliga", 5)

    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMatchesBinding.inflate(layoutInflater)

        homeViewModel = ViewModelProvider(
            this,
            HomeViewModelFactory(FootballRepository(ApiServiceSingleton.apiService!!))
        )[HomeViewModel::class.java]


        showItemLeague()




        binding.imageViewBack.setOnClickListener {

            findNavController().navigate(R.id.action_matchesFragment_to_homeFragment)

        }

        return binding.root
    }

    override fun selectItem(position: Int) {

        when (position) {
            0 -> {

                visibleShimmer()
                binding.searchView.setIconified(true)
                homeViewModel.getMatch()
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(object : SingleObserver<MatchResponse> {
                        override fun onSubscribe(d: Disposable) {
                            compositeDisposable.add(d)
                        }

                        override fun onSuccess(matchResponse: MatchResponse) {


                            binding.recyclerMatches.visibility = View.VISIBLE
                            showAllMatch(matchResponse)
                            goneShimmer()
                            search(matchResponse.matches)


                        }

                        override fun onError(e: Throwable) {


                        }

                    })
            }
            1 -> {


                visibleShimmer()
                binding.searchView.setIconified(true)
                homeViewModel.getMatchPD()
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(object : SingleObserver<MatchResponse> {
                        override fun onSubscribe(d: Disposable) {
                            compositeDisposable.add(d)
                        }

                        override fun onSuccess(matchResponse: MatchResponse) {

                            binding.recyclerMatches.visibility = View.VISIBLE
                            showSortedData(matchResponse)
                            goneShimmer()
                            search(matchResponse.matches)


                        }

                        override fun onError(e: Throwable) {


                        }

                    })

            }
            2 -> {

                visibleShimmer()
                binding.searchView.setIconified(true)
                homeViewModel.getMatchPL()
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(object : SingleObserver<MatchResponse> {
                        override fun onSubscribe(d: Disposable) {
                            compositeDisposable.add(d)
                        }

                        override fun onSuccess(matchResponse: MatchResponse) {


                            binding.recyclerMatches.visibility = View.VISIBLE
                            showSortedData(matchResponse)
                            goneShimmer()
                            search(matchResponse.matches)


                        }

                        override fun onError(e: Throwable) {


                        }

                    })

            }
            3 -> {
                visibleShimmer()
                binding.searchView.setIconified(true)
                homeViewModel.getMatchFL1()
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(object : SingleObserver<MatchResponse> {
                        override fun onSubscribe(d: Disposable) {
                            compositeDisposable.add(d)
                        }

                        override fun onSuccess(matchResponse: MatchResponse) {

                            binding.recyclerMatches.visibility = View.VISIBLE
                            showSortedData(matchResponse)
                            goneShimmer()
                            search(matchResponse.matches)
                        }

                        override fun onError(e: Throwable) {


                        }

                    })
            }
            4 -> {

                visibleShimmer()
                binding.searchView.setIconified(true)
                homeViewModel.getMatchSA()
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(object : SingleObserver<MatchResponse> {
                        override fun onSubscribe(d: Disposable) {
                            compositeDisposable.add(d)
                        }

                        override fun onSuccess(matchResponse: MatchResponse) {

                            binding.recyclerMatches.visibility = View.VISIBLE
                            showSortedData(matchResponse)
                            goneShimmer()
                            search(matchResponse.matches)
                        }

                        override fun onError(e: Throwable) {


                        }

                    })
            }
            5 -> {

                visibleShimmer()
                binding.searchView.setIconified(true)
                homeViewModel.getMatchBL1()
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(object : SingleObserver<MatchResponse> {
                        override fun onSubscribe(d: Disposable) {
                            compositeDisposable.add(d)
                        }

                        override fun onSuccess(matchResponse: MatchResponse) {

                            binding.recyclerMatches.visibility = View.VISIBLE
                            showSortedData(matchResponse)
                            goneShimmer()
                            search(matchResponse.matches)
                        }

                        override fun onError(e: Throwable) {


                        }

                    })
            }
        }

    }

    private fun visibleShimmer() {

        shimmerFrameLayout?.stopShimmer()
        binding.shimmerViewMatches.visibility = View.VISIBLE

    }

    private fun goneShimmer() {

        shimmerFrameLayout?.stopShimmer()
        binding.shimmerViewMatches.visibility = View.GONE

    }

    private fun showSortedData(matchResponse: MatchResponse) {

        binding.recyclerMatches.adapter =
            SortMatchAdapter(
                requireContext().applicationContext,
                matchResponse = matchResponse.matches,
                requireActivity()
            )
        binding.recyclerMatches.layoutManager = LinearLayoutManager(
            requireContext().applicationContext,
            RecyclerView.VERTICAL,
            false
        )


    }

    private fun showAllMatch(matchResponse: MatchResponse) {

        binding.recyclerMatches.adapter =
            MatchAdapter(
                requireContext().applicationContext,
                matchResponse = matchResponse.matches,
                requireActivity()
            )
        binding.recyclerMatches.layoutManager = LinearLayoutManager(
            requireContext().applicationContext,
            RecyclerView.VERTICAL,
            false
        )


    }

    private fun showItemLeague() {
        binding.recyclerLeagueList.adapter =
            LeagueAdapter(
                requireContext().applicationContext,
                listOfLeagues, this
            )
        binding.recyclerLeagueList.layoutManager = LinearLayoutManager(
            requireContext().applicationContext,
            RecyclerView.HORIZONTAL,
            false
        )
    }

    private fun search(matchesList: ArrayList<Match?>) {

        binding.searchView.setQueryHint(activity!!.resources.getString(R.string.search))
        binding.searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(p0: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                searchResult(newText!!, matchesList)
                return true
            }

        })
    }

    private fun searchResult(query: String, matchesList: ArrayList<Match?>) {


        val q = query.toLowerCase()
        val searchList: ArrayList<Match?> = ArrayList()

        for (tasks in matchesList) {
            if (tasks!!.awayTeam.shortName.toLowerCase()
                    .contains(q) || tasks!!.homeTeam.shortName.toLowerCase().contains(q)
            ) {
                searchList.add(tasks)
            }
        }

        visibleShimmer()
        if (searchList.isEmpty()) {

            goneShimmer()
            binding.result.visibility = View.VISIBLE
            binding.recyclerMatches.visibility = View.GONE


        } else {

            goneShimmer()
            binding.recyclerMatches.visibility = View.VISIBLE
            binding.recyclerMatches.adapter =
                MatchAdapter(
                    requireContext().applicationContext,
                    searchList,
                    requireActivity()
                )
            binding.recyclerMatches.layoutManager = LinearLayoutManager(
                requireContext().applicationContext,
                RecyclerView.VERTICAL,
                false
            )
        }

    }

}




