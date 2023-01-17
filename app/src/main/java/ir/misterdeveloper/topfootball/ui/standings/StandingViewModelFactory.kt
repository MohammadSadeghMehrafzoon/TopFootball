package ir.misterdeveloper.topfootball.ui.standings

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import ir.misterdeveloper.topfootball.model.Repository.FootballRepository

class StandingViewModelFactory(private val footballRepository: FootballRepository): ViewModelProvider.Factory  {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return StandingsViewModel(footballRepository) as T
    }
}