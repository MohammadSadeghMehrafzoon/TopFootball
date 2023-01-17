package ir.misterdeveloper.topfootball.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import ir.misterdeveloper.topfootball.model.Repository.FootballRepository

class HomeViewModelFactory(private val footballRepository: FootballRepository) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return HomeViewModel(footballRepository) as T
    }
}
