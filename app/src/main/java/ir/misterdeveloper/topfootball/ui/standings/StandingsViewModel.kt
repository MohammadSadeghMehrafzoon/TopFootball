package ir.misterdeveloper.topfootball.ui.standings

import androidx.lifecycle.ViewModel
import io.reactivex.Single
import ir.misterdeveloper.topfootball.model.Repository.FootballRepository
import ir.misterdeveloper.topfootball.model.Response.StandingsResponse

class StandingsViewModel(private val footballRepository: FootballRepository) : ViewModel() {


    fun getStanding(id: String): Single<StandingsResponse> {
        return footballRepository.getStanding(id)
    }
}