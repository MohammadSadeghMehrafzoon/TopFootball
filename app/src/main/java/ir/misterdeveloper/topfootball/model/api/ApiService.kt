package ir.misterdeveloper.topfootball.model.api

import io.reactivex.Single
import ir.misterdeveloper.topfootball.model.Response.MatchInformationResponse
import ir.misterdeveloper.topfootball.model.Response.MatchResponse
import ir.misterdeveloper.topfootball.model.Response.PersonResponse
import ir.misterdeveloper.topfootball.model.Response.StandingsResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {


    @GET("v4/matches")
    fun getMatches(): Single<MatchResponse>

    @GET("v4/matches")
    fun getLiveMatches(@Query("status") status: String): Single<MatchResponse>

    @GET("v4/competitions/{id}/standings")
    fun getStanding(
        @Path("id") id: String
    ): Single<StandingsResponse>

    @GET("v4/matches/{id}")
    fun getMatchInformation(
        @Path("id") id: Int
    ): Single<MatchInformationResponse>

    // Laliga league games
    @GET("v4/competitions/PD/matches")
    fun getMatchPD(): Single<MatchResponse>

    // Premier League league games
    @GET("v4/competitions/PL/matches")
    fun getMatchPL(): Single<MatchResponse>

    // Serie A  league games
    @GET("v4/competitions/SA/matches")
    fun getMatchSA(): Single<MatchResponse>

    // Ligue 1 (France)  league games
    @GET("v4/competitions/FL1/matches")
    fun getMatchFL1(): Single<MatchResponse>

    // Bundesliga league games
    @GET("v4/competitions/BL1/matches")
    fun getMatchBL1(): Single<MatchResponse>




    @GET("v4/persons/3218/matches")
    fun getInformationMessi(): Single<PersonResponse>

    @GET("v4/persons/8491/matches")
    fun getInformationNeymar(): Single<PersonResponse>

    @GET("v4/persons/371/matches")
    fun getInformationLewandowski(): Single<PersonResponse>

    @GET("v4/persons/49/matches")
    fun getInformationBenzema(): Single<PersonResponse>

    @GET("v4/persons/44/matches")
    fun getInformationRonaldo(): Single<PersonResponse>




}