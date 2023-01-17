package ir.misterdeveloper.topfootball.ui.home

import androidx.lifecycle.ViewModel
import io.reactivex.Single
import ir.misterdeveloper.topfootball.model.Repository.FootballRepository
import ir.misterdeveloper.topfootball.model.Response.MatchInformationResponse
import ir.misterdeveloper.topfootball.model.Response.MatchResponse
import ir.misterdeveloper.topfootball.model.Response.PersonResponse

class HomeViewModel(private val footballRepository: FootballRepository) : ViewModel() {


    fun getMatch(): Single<MatchResponse> {
        return footballRepository.getMatch()
    }

    fun getLiveMatches(status: String): Single<MatchResponse> {
        return footballRepository.getLiveMatches(status)
    }


    fun getMatchInformation(id: Int): Single<MatchInformationResponse> {
        return footballRepository.getMatchInformation(id)
    }



    fun getMatchPD(): Single<MatchResponse> {
        return footballRepository.getMatchPD()
    }

    fun getMatchPL(): Single<MatchResponse> {
        return footballRepository.getMatchPL()
    }


    fun getMatchSA(): Single<MatchResponse> {
        return footballRepository.getMatchSA()
    }

    fun getMatchBL1(): Single<MatchResponse> {
        return footballRepository.getMatchBL1()
    }

    fun getMatchFL1(): Single<MatchResponse> {
        return footballRepository.getMatchFL1()
    }


    fun getInformationNeymar(): Single<PersonResponse> {
        return footballRepository.getInformationNeymar()
    }

    fun getInformationMessi(): Single<PersonResponse> {
        return footballRepository.getInformationMessi()
    }

    fun getInformationBenzema(): Single<PersonResponse> {
        return footballRepository.getInformationBenzema()
    }

    fun getInformationLewandowski(): Single<PersonResponse> {
        return footballRepository.getInformationLewandowski()
    }


    fun getInformationRonaldo(): Single<PersonResponse> {
        return footballRepository.getInformationRonaldo()
    }


}