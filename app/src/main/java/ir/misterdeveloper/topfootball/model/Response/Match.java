
package ir.misterdeveloper.topfootball.model.Response;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.Date;

public class Match {


    @SerializedName("area")
    @Expose
    private Area area;
    @SerializedName("competition")
    @Expose
    private Competition competition;
    @SerializedName("season")
    @Expose
    private Season season;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("utcDate")
    @Expose
    private Date utcDate;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("matchday")
    @Expose
    private Integer matchday;
    @SerializedName("stage")
    @Expose
    private String stage;
    @SerializedName("group")
    @Expose
    private String group;
    @SerializedName("lastUpdated")
    @Expose
    private Date lastUpdated;
    @SerializedName("homeTeam")
    @Expose
    private HomeTeam homeTeam;
    @SerializedName("awayTeam")
    @Expose
    private AwayTeam awayTeam;
    @SerializedName("score")
    @Expose
    private Score score;
    @SerializedName("odds")
    @Expose
    private Odds odds;
    @SerializedName("referees")
    @Expose
    private ArrayList<Referee> referees = null;
    @SerializedName("awayTeams")
    @Expose
    private ArrayList<AwayTeam> awayTeams = null;
    @SerializedName("areas")
    @Expose
    private ArrayList<Area> areas = null;
    @SerializedName("competitions")
    @Expose
    private ArrayList<Competition> competitions = null;
    @SerializedName("fullTimes")
    @Expose
    private ArrayList<FullTime> fullTimes = null;
    @SerializedName("halfTimes")
    @Expose
    private ArrayList<HalfTime> halfTimes = null;
    @SerializedName("homeTeams")
    @Expose
    private ArrayList<HomeTeam> homeTeams = null;
    @SerializedName("oddsArrayList")
    @Expose
    private ArrayList<Odds> oddsArrayList = null;
    @SerializedName("roots")
    @Expose
    private ArrayList<Root> roots = null;
    @SerializedName("seasons")
    @Expose
    private ArrayList<Season> seasons = null;
    @SerializedName("scores")
    @Expose
    private ArrayList<Score> scores = null;

    @SerializedName("resultSets")
    @Expose
    private ArrayList<ResultSet> resultSets = null;

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public Competition getCompetition() {
        return competition;
    }

    public void setCompetition(Competition competition) {
        this.competition = competition;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getUtcDate() {
        return utcDate;
    }

    public void setUtcDate(Date utcDate) {
        this.utcDate = utcDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getMatchday() {
        return matchday;
    }

    public void setMatchday(int matchday) {
        this.matchday = matchday;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public HomeTeam getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(HomeTeam homeTeam) {
        this.homeTeam = homeTeam;
    }

    public AwayTeam getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(AwayTeam awayTeam) {
        this.awayTeam = awayTeam;
    }

    public Score getScore() {
        return score;
    }

    public void setScore(Score score) {
        this.score = score;
    }

    public Odds getOdds() {
        return odds;
    }

    public void setOdds(Odds odds) {
        this.odds = odds;
    }

    public ArrayList<Referee> getReferees() {
        return referees;
    }

    public void setReferees(ArrayList<Referee> referees) {
        this.referees = referees;
    }

    public ArrayList<AwayTeam> getAwayTeams() {
        return awayTeams;
    }

    public void setAwayTeams(ArrayList<AwayTeam> awayTeams) {
        this.awayTeams = awayTeams;
    }

    public ArrayList<Area> getAreas() {
        return areas;
    }

    public void setAreas(ArrayList<Area> areas) {
        this.areas = areas;
    }

    public ArrayList<Competition> getCompetitions() {
        return competitions;
    }

    public void setCompetitions(ArrayList<Competition> competitions) {
        this.competitions = competitions;
    }

    public ArrayList<FullTime> getFullTimes() {
        return fullTimes;
    }

    public void setFullTimes(ArrayList<FullTime> fullTimes) {
        this.fullTimes = fullTimes;
    }

    public ArrayList<HalfTime> getHalfTimes() {
        return halfTimes;
    }

    public void setHalfTimes(ArrayList<HalfTime> halfTimes) {
        this.halfTimes = halfTimes;
    }

    public ArrayList<HomeTeam> getHomeTeams() {
        return homeTeams;
    }

    public void setHomeTeams(ArrayList<HomeTeam> homeTeams) {
        this.homeTeams = homeTeams;
    }

    public ArrayList<Odds> getOddsArrayList() {
        return oddsArrayList;
    }

    public void setOddsArrayList(ArrayList<Odds> oddsArrayList) {
        this.oddsArrayList = oddsArrayList;
    }

    public ArrayList<Root> getRoots() {
        return roots;
    }

    public void setRoots(ArrayList<Root> roots) {
        this.roots = roots;
    }

    public ArrayList<Season> getSeasons() {
        return seasons;
    }

    public void setSeasons(ArrayList<Season> seasons) {
        this.seasons = seasons;
    }

    public ArrayList<Score> getScores() {
        return scores;
    }

    public void setScores(ArrayList<Score> scores) {
        this.scores = scores;
    }


    public static class Area {
        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("code")
        @Expose
        private String code;
        @SerializedName("flag")
        @Expose
        private String flag;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getFlag() {
            return flag;
        }

        public void setFlag(String flag) {
            this.flag = flag;
        }


    }

    public static class AwayTeam {
        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("shortName")
        @Expose
        private String shortName;
        @SerializedName("tla")
        @Expose
        private String tla;
        @SerializedName("crest")
        @Expose
        private String crest;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getShortName() {
            return shortName;
        }

        public void setShortName(String shortName) {
            this.shortName = shortName;
        }

        public String getTla() {
            return tla;
        }

        public void setTla(String tla) {
            this.tla = tla;
        }

        public String getCrest() {
            return crest;
        }

        public void setCrest(String crest) {
            this.crest = crest;
        }


    }

    public static class Competition {

        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("code")
        @Expose
        private String code;
        @SerializedName("type")
        @Expose
        private String type;
        @SerializedName("emblem")
        @Expose
        private String emblem;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getEmblem() {
            return emblem;
        }

        public void setEmblem(String emblem) {
            this.emblem = emblem;
        }

    }

    public static class FullTime {

        @SerializedName("home")
        @Expose
        private Object home;
        @SerializedName("away")
        @Expose
        private Object away;

        public Object getHome() {
            return home;
        }

        public void setHome(Object home) {
            this.home = home;
        }

        public Object getAway() {
            return away;
        }

        public void setAway(Object away) {
            this.away = away;
        }


    }

    public static class HalfTime {
        @SerializedName("home")
        @Expose
        private Object home;
        @SerializedName("away")
        @Expose
        private Object away;

        public Object getHome() {
            return home;
        }

        public void setHome(Object home) {
            this.home = home;
        }

        public Object getAway() {
            return away;
        }

        public void setAway(Object away) {
            this.away = away;
        }


    }

    public static class HomeTeam {
        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("shortName")
        @Expose
        private String shortName;
        @SerializedName("tla")
        @Expose
        private String tla;
        @SerializedName("crest")
        @Expose
        private String crest;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getShortName() {
            return shortName;
        }

        public void setShortName(String shortName) {
            this.shortName = shortName;
        }

        public String getTla() {
            return tla;
        }

        public void setTla(String tla) {
            this.tla = tla;
        }

        public String getCrest() {
            return crest;
        }

        public void setCrest(String crest) {
            this.crest = crest;
        }

    }


    public static class Odds {
        @SerializedName("msg")
        @Expose
        private String msg;

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }
    }

    public static class Referee {
        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("type")
        @Expose
        private String type;
        @SerializedName("nationality")
        @Expose
        private String nationality;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getNationality() {
            return nationality;
        }

        public void setNationality(String nationality) {
            this.nationality = nationality;
        }


    }

    public static class Root {
        public ArrayList<Match> matches;
    }

    public static class Score {
        @SerializedName("winner")
        @Expose
        private Object winner;
        @SerializedName("duration")
        @Expose
        private String duration;
        @SerializedName("fullTime")
        @Expose
        private FullTime fullTime;
        @SerializedName("halfTime")
        @Expose
        private HalfTime halfTime;

        public Object getWinner() {
            return winner;
        }

        public void setWinner(Object winner) {
            this.winner = winner;
        }

        public String getDuration() {
            return duration;
        }

        public void setDuration(String duration) {
            this.duration = duration;
        }

        public FullTime getFullTime() {
            return fullTime;
        }

        public void setFullTime(FullTime fullTime) {
            this.fullTime = fullTime;
        }

        public HalfTime getHalfTime() {
            return halfTime;
        }

        public void setHalfTime(HalfTime halfTime) {
            this.halfTime = halfTime;
        }


    }

    public static class Season {
        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("startDate")
        @Expose
        private String startDate;
        @SerializedName("endDate")
        @Expose
        private String endDate;
        @SerializedName("currentMatchday")
        @Expose
        private Integer currentMatchday;
        @SerializedName("winner")
        @Expose
        private Object winner;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getStartDate() {
            return startDate;
        }

        public void setStartDate(String startDate) {
            this.startDate = startDate;
        }

        public String getEndDate() {
            return endDate;
        }

        public void setEndDate(String endDate) {
            this.endDate = endDate;
        }

        public Integer getCurrentMatchday() {
            return currentMatchday;
        }

        public void setCurrentMatchday(Integer currentMatchday) {
            this.currentMatchday = currentMatchday;
        }

        public Object getWinner() {
            return winner;
        }

        public void setWinner(Object winner) {
            this.winner = winner;
        }


    }

    public  static class ResultSet {
        @SerializedName("count")
        @Expose
        private Integer count;
        @SerializedName("competitions")
        @Expose
        private String competitionss;
        @SerializedName("first")
        @Expose
        private String first;
        @SerializedName("last")
        @Expose
        private String last;
        @SerializedName("played")
        @Expose
        private Integer played;

        public Integer getCount() {
            return count;
        }

        public void setCount(Integer count) {
            this.count = count;
        }

        public String getCompetitionss() {
            return competitionss;
        }

        public void setCompetitions(String competitionss) {
            this.competitionss = competitionss;
        }

        public String getFirst() {
            return first;
        }

        public void setFirst(String first) {
            this.first = first;
        }

        public String getLast() {
            return last;
        }

        public void setLast(String last) {
            this.last = last;
        }

        public Integer getPlayed() {
            return played;
        }

        public void setPlayed(Integer played) {
            this.played = played;
        }

    }

}
