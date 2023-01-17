package ir.misterdeveloper.topfootball.model.Repository

import io.reactivex.Single
import ir.misterdeveloper.topfootball.model.Response.MatchInformationResponse
import ir.misterdeveloper.topfootball.model.Response.MatchResponse
import ir.misterdeveloper.topfootball.model.Response.PersonResponse
import ir.misterdeveloper.topfootball.model.Response.StandingsResponse
import ir.misterdeveloper.topfootball.model.api.ApiService

class FootballRepository(private var apiService: ApiService) {


    fun getMatch(): Single<MatchResponse> {
        return apiService.getMatches()
    }


    fun getLiveMatches(status: String): Single<MatchResponse> {
        return apiService.getLiveMatches(status)
    }

    fun getStanding(id: String): Single<StandingsResponse> {
        return apiService.getStanding(id)
    }


    fun getMatchInformation(id: Int): Single<MatchInformationResponse> {
        return apiService.getMatchInformation(id)
    }

    fun getMatchPD(): Single<MatchResponse> {
        return apiService.getMatchPD()
    }

    fun getMatchPL(): Single<MatchResponse> {
        return apiService.getMatchPL()
    }

    fun getMatchSA(): Single<MatchResponse> {
        return apiService.getMatchSA()
    }

    fun getMatchFL1(): Single<MatchResponse> {
        return apiService.getMatchFL1()
    }

    fun getMatchBL1(): Single<MatchResponse> {
        return apiService.getMatchBL1()
    }

    fun getInformationMessi(): Single<PersonResponse> {
        return apiService.getInformationMessi()
    }

    fun getInformationNeymar(): Single<PersonResponse> {
        return apiService.getInformationNeymar()
    }

    fun getInformationBenzema(): Single<PersonResponse> {
        return apiService.getInformationBenzema()
    }

    fun getInformationLewandowski(): Single<PersonResponse> {
        return apiService.getInformationLewandowski()
    }

    fun getInformationRonaldo(): Single<PersonResponse> {
        return apiService.getInformationRonaldo()
    }




}