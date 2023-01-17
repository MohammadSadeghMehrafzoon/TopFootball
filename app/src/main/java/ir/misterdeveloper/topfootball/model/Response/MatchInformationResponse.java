package ir.misterdeveloper.topfootball.model.Response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.Date;

public class MatchInformationResponse {

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
    private int id;
    @SerializedName("utcDate")
    @Expose
    private Date utcDate;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("minute")
    @Expose
    private int minute;
    @SerializedName("injuryTime")
    @Expose
    private int injuryTime;
    @SerializedName("attendance")
    @Expose
    private int attendance;
    @SerializedName("venue")
    @Expose
    private String venue;
    @SerializedName("matchday")
    @Expose
    private int matchday;
    @SerializedName("stage")
    @Expose
    private String stage;
    @SerializedName("group")
    @Expose
    private Object group;
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
    @SerializedName("goals")
    @Expose
    private ArrayList<Goal> goals;
    @SerializedName("penalties")
    @Expose
    private ArrayList<Object> penalties;
    @SerializedName("bookings")
    @Expose
    private ArrayList<Booking> bookings;
    @SerializedName("substitutions")
    @Expose
    private ArrayList<Substitution> substitutions;
    @SerializedName("odds")
    @Expose
    private Odds odds;
    @SerializedName("referees")
    @Expose
    private ArrayList<Referee> referees;

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

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getInjuryTime() {
        return injuryTime;
    }

    public void setInjuryTime(int injuryTime) {
        this.injuryTime = injuryTime;
    }

    public int getAttendance() {
        return attendance;
    }

    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
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

    public Object getGroup() {
        return group;
    }

    public void setGroup(Object group) {
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

    public ArrayList<Goal> getGoals() {
        return goals;
    }

    public void setGoals(ArrayList<Goal> goals) {
        this.goals = goals;
    }

    public ArrayList<Object> getPenalties() {
        return penalties;
    }

    public void setPenalties(ArrayList<Object> penalties) {
        this.penalties = penalties;
    }

    public ArrayList<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(ArrayList<Booking> bookings) {
        this.bookings = bookings;
    }

    public ArrayList<Substitution> getSubstitutions() {
        return substitutions;
    }

    public void setSubstitutions(ArrayList<Substitution> substitutions) {
        this.substitutions = substitutions;
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

    public static class Assist {

        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("name")
        @Expose
        private String name;

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
    }

    public static class AwayTeam {

        @SerializedName("id")
        @Expose
        private int id;
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
        @SerializedName("coach")
        @Expose
        private Coach coach;
        @SerializedName("leagueRank")
        @Expose
        private Object leagueRank;
        @SerializedName("formation")
        @Expose
        private String formation;
        @SerializedName("lineup")
        @Expose
        private ArrayList<Lineup> lineup;
        @SerializedName("bench")
        @Expose
        private ArrayList<Bench> bench;
        @SerializedName("statistics")
        @Expose
        private Statistics statistics;

        public int getId() {
            return id;
        }

        public void setId(int id) {
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

        public Coach getCoach() {
            return coach;
        }

        public void setCoach(Coach coach) {
            this.coach = coach;
        }

        public Object getLeagueRank() {
            return leagueRank;
        }

        public void setLeagueRank(Object leagueRank) {
            this.leagueRank = leagueRank;
        }

        public String getFormation() {
            return formation;
        }

        public void setFormation(String formation) {
            this.formation = formation;
        }

        public ArrayList<Lineup> getLineup() {
            return lineup;
        }

        public void setLineup(ArrayList<Lineup> lineup) {
            this.lineup = lineup;
        }

        public ArrayList<Bench> getBench() {
            return bench;
        }

        public void setBench(ArrayList<Bench> bench) {
            this.bench = bench;
        }

        public Statistics getStatistics() {
            return statistics;
        }

        public void setStatistics(Statistics statistics) {
            this.statistics = statistics;
        }
    }

    public static class Bench {
        @SerializedName("id")
        @Expose
        private int id;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("position")
        @Expose
        private String position;
        @SerializedName("shirtNumber")
        @Expose
        private int shirtNumber;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPosition() {
            return position;
        }

        public void setPosition(String position) {
            this.position = position;
        }

        public int getShirtNumber() {
            return shirtNumber;
        }

        public void setShirtNumber(int shirtNumber) {
            this.shirtNumber = shirtNumber;
        }
    }

    public static class Booking {

        @SerializedName("minute")
        @Expose
        private int minute;
        @SerializedName("team")
        @Expose
        private Team team;
        @SerializedName("player")
        @Expose
        private Player player;
        @SerializedName("card")
        @Expose
        private String card;

        public int getMinute() {
            return minute;
        }

        public void setMinute(int minute) {
            this.minute = minute;
        }

        public Team getTeam() {
            return team;
        }

        public void setTeam(Team team) {
            this.team = team;
        }

        public Player getPlayer() {
            return player;
        }

        public void setPlayer(Player player) {
            this.player = player;
        }

        public String getCard() {
            return card;
        }

        public void setCard(String card) {
            this.card = card;
        }
    }

    public static class Coach {
        @SerializedName("id")
        @Expose
        private int id;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("nationality")
        @Expose
        private String nationality;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getNationality() {
            return nationality;
        }

        public void setNationality(String nationality) {
            this.nationality = nationality;
        }
    }

    public static class Competition {

        @SerializedName("id")
        @Expose
        private int id;
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

        public int getId() {
            return id;
        }

        public void setId(int id) {
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

    public  static class FullTime {
        @SerializedName("home")
        @Expose
        private int home;
        @SerializedName("away")
        @Expose
        private int away;

        public int getHome() {
            return home;
        }

        public void setHome(int home) {
            this.home = home;
        }

        public int getAway() {
            return away;
        }

        public void setAway(int away) {
            this.away = away;
        }
    }

    public static class Goal {
        @SerializedName("minute")
        @Expose
        private int minute;
        @SerializedName("injuryTime")
        @Expose
        private Object injuryTime;
        @SerializedName("type")
        @Expose
        private String type;
        @SerializedName("team")
        @Expose
        private Team team;
        @SerializedName("scorer")
        @Expose
        private Scorer scorer;
        @SerializedName("assist")
        @Expose
        private Assist assist;
        @SerializedName("score")
        @Expose
        private Score score;

        public int getMinute() {
            return minute;
        }

        public void setMinute(int minute) {
            this.minute = minute;
        }

        public Object getInjuryTime() {
            return injuryTime;
        }

        public void setInjuryTime(Object injuryTime) {
            this.injuryTime = injuryTime;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Team getTeam() {
            return team;
        }

        public void setTeam(Team team) {
            this.team = team;
        }

        public Scorer getScorer() {
            return scorer;
        }

        public void setScorer(Scorer scorer) {
            this.scorer = scorer;
        }

        public Assist getAssist() {
            return assist;
        }

        public void setAssist(Assist assist) {
            this.assist = assist;
        }

        public Score getScore() {
            return score;
        }

        public void setScore(Score score) {
            this.score = score;
        }
    }

    public  static class HalfTime {
        @SerializedName("home")
        @Expose
        private int home;
        @SerializedName("away")
        @Expose
        private int away;

        public int getHome() {
            return home;
        }

        public void setHome(int home) {
            this.home = home;
        }

        public int getAway() {
            return away;
        }

        public void setAway(int away) {
            this.away = away;
        }
    }

    public static class HomeTeam {
        @SerializedName("id")
        @Expose
        private int id;
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
        @SerializedName("coach")
        @Expose
        private Coach coach;
        @SerializedName("leagueRank")
        @Expose
        private Object leagueRank;
        @SerializedName("formation")
        @Expose
        private String formation;
        @SerializedName("lineup")
        @Expose
        private ArrayList<Lineup> lineup;
        @SerializedName("bench")
        @Expose
        private ArrayList<Bench> bench;
        @SerializedName("statistics")
        @Expose
        private Statistics statistics;

        public int getId() {
            return id;
        }

        public void setId(int id) {
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

        public Coach getCoach() {
            return coach;
        }

        public void setCoach(Coach coach) {
            this.coach = coach;
        }

        public Object getLeagueRank() {
            return leagueRank;
        }

        public void setLeagueRank(Object leagueRank) {
            this.leagueRank = leagueRank;
        }

        public String getFormation() {
            return formation;
        }

        public void setFormation(String formation) {
            this.formation = formation;
        }

        public ArrayList<Lineup> getLineup() {
            return lineup;
        }

        public void setLineup(ArrayList<Lineup> lineup) {
            this.lineup = lineup;
        }

        public ArrayList<Bench> getBench() {
            return bench;
        }

        public void setBench(ArrayList<Bench> bench) {
            this.bench = bench;
        }

        public Statistics getStatistics() {
            return statistics;
        }

        public void setStatistics(Statistics statistics) {
            this.statistics = statistics;
        }
    }

    public static class Lineup {

        @SerializedName("id")
        @Expose
        private int id;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("position")
        @Expose
        private String position;
        @SerializedName("shirtNumber")
        @Expose
        private int shirtNumber;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPosition() {
            return position;
        }

        public void setPosition(String position) {
            this.position = position;
        }

        public int getShirtNumber() {
            return shirtNumber;
        }

        public void setShirtNumber(int shirtNumber) {
            this.shirtNumber = shirtNumber;
        }
    }

    public static class Odds {
        @SerializedName("homeWin")
        @Expose
        private double homeWin;
        @SerializedName("draw")
        @Expose
        private double draw;
        @SerializedName("awayWin")
        @Expose
        private double awayWin;

        public double getHomeWin() {
            return homeWin;
        }

        public void setHomeWin(double homeWin) {
            this.homeWin = homeWin;
        }

        public double getDraw() {
            return draw;
        }

        public void setDraw(double draw) {
            this.draw = draw;
        }

        public double getAwayWin() {
            return awayWin;
        }

        public void setAwayWin(double awayWin) {
            this.awayWin = awayWin;
        }
    }

    public  static class Player {
        @SerializedName("id")
        @Expose
        private int id;
        @SerializedName("name")
        @Expose
        private String name;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class PlayerIn {
        @SerializedName("id")
        @Expose
        private int id;
        @SerializedName("name")
        @Expose
        private String name;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class PlayerOut {
        @SerializedName("id")
        @Expose
        private int id;
        @SerializedName("name")
        @Expose
        private String name;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class Referee {

        @SerializedName("id")
        @Expose
        private int id;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("type")
        @Expose
        private String type;
        @SerializedName("nationality")
        @Expose
        private String nationality;

        public int getId() {
            return id;
        }

        public void setId(int id) {
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

    public static class Score {
        @SerializedName("winner")
        @Expose
        private String winner;
        @SerializedName("duration")
        @Expose
        private String duration;
        @SerializedName("fullTime")
        @Expose
        private FullTime fullTime;
        @SerializedName("halfTime")
        @Expose
        private HalfTime halfTime;
        @SerializedName("home")
        @Expose
        private int home;
        @SerializedName("away")
        @Expose
        private int away;

        public String getWinner() {
            return winner;
        }

        public void setWinner(String winner) {
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

        public int getHome() {
            return home;
        }

        public void setHome(int home) {
            this.home = home;
        }

        public int getAway() {
            return away;
        }

        public void setAway(int away) {
            this.away = away;
        }
    }

    public  static class Scorer {
        @SerializedName("id")
        @Expose
        private int id;
        @SerializedName("name")
        @Expose
        private String name;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class Season {

        @SerializedName("id")
        @Expose
        private int id;
        @SerializedName("startDate")
        @Expose
        private String startDate;
        @SerializedName("endDate")
        @Expose
        private String endDate;
        @SerializedName("currentMatchday")
        @Expose
        private int currentMatchday;
        @SerializedName("winner")
        @Expose
        private Object winner;
        @SerializedName("stages")
        @Expose
        private ArrayList<String> stages;

        public int getId() {
            return id;
        }

        public void setId(int id) {
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

        public int getCurrentMatchday() {
            return currentMatchday;
        }

        public void setCurrentMatchday(int currentMatchday) {
            this.currentMatchday = currentMatchday;
        }

        public Object getWinner() {
            return winner;
        }

        public void setWinner(Object winner) {
            this.winner = winner;
        }

        public ArrayList<String> getStages() {
            return stages;
        }

        public void setStages(ArrayList<String> stages) {
            this.stages = stages;
        }
    }

    public static class Statistics {

        @SerializedName("corner_kicks")
        @Expose
        private int corner_kicks;
        @SerializedName("free_kicks")
        @Expose
        private int free_kicks;
        @SerializedName("goal_kicks")
        @Expose
        private int goal_kicks;
        @SerializedName("offsides")
        @Expose
        private int offsides;
        @SerializedName("fouls")
        @Expose
        private int fouls;
        @SerializedName("ball_possession")
        @Expose
        private int ball_possession;
        @SerializedName("saves")
        @Expose
        private int saves;
        @SerializedName("throw_ins")
        @Expose
        private int throw_ins;
        @SerializedName("shots")
        @Expose
        private int shots;
        @SerializedName("shots_on_goal")
        @Expose
        private int shots_on_goal;
        @SerializedName("shots_off_goal")
        @Expose
        private int shots_off_goal;
        @SerializedName("yellow_cards")
        @Expose
        private int yellow_cards;
        @SerializedName("yellow_red_cards")
        @Expose
        private int yellow_red_cards;
        @SerializedName("red_cards")
        @Expose
        private int red_cards;

        public int getCorner_kicks() {
            return corner_kicks;
        }

        public void setCorner_kicks(int corner_kicks) {
            this.corner_kicks = corner_kicks;
        }

        public int getFree_kicks() {
            return free_kicks;
        }

        public void setFree_kicks(int free_kicks) {
            this.free_kicks = free_kicks;
        }

        public int getGoal_kicks() {
            return goal_kicks;
        }

        public void setGoal_kicks(int goal_kicks) {
            this.goal_kicks = goal_kicks;
        }

        public int getOffsides() {
            return offsides;
        }

        public void setOffsides(int offsides) {
            this.offsides = offsides;
        }

        public int getFouls() {
            return fouls;
        }

        public void setFouls(int fouls) {
            this.fouls = fouls;
        }

        public int getBall_possession() {
            return ball_possession;
        }

        public void setBall_possession(int ball_possession) {
            this.ball_possession = ball_possession;
        }

        public int getSaves() {
            return saves;
        }

        public void setSaves(int saves) {
            this.saves = saves;
        }

        public int getThrow_ins() {
            return throw_ins;
        }

        public void setThrow_ins(int throw_ins) {
            this.throw_ins = throw_ins;
        }

        public int getShots() {
            return shots;
        }

        public void setShots(int shots) {
            this.shots = shots;
        }

        public int getShots_on_goal() {
            return shots_on_goal;
        }

        public void setShots_on_goal(int shots_on_goal) {
            this.shots_on_goal = shots_on_goal;
        }

        public int getShots_off_goal() {
            return shots_off_goal;
        }

        public void setShots_off_goal(int shots_off_goal) {
            this.shots_off_goal = shots_off_goal;
        }

        public int getYellow_cards() {
            return yellow_cards;
        }

        public void setYellow_cards(int yellow_cards) {
            this.yellow_cards = yellow_cards;
        }

        public int getYellow_red_cards() {
            return yellow_red_cards;
        }

        public void setYellow_red_cards(int yellow_red_cards) {
            this.yellow_red_cards = yellow_red_cards;
        }

        public int getRed_cards() {
            return red_cards;
        }

        public void setRed_cards(int red_cards) {
            this.red_cards = red_cards;
        }
    }

    public static class Substitution {
        @SerializedName("minute")
        @Expose
        private int minute;
        @SerializedName("team")
        @Expose
        private Team team;
        @SerializedName("playerOut")
        @Expose
        private PlayerOut playerOut;
        @SerializedName("playerIn")
        @Expose
        private PlayerIn playerIn;

        public int getMinute() {
            return minute;
        }

        public void setMinute(int minute) {
            this.minute = minute;
        }

        public Team getTeam() {
            return team;
        }

        public void setTeam(Team team) {
            this.team = team;
        }

        public PlayerOut getPlayerOut() {
            return playerOut;
        }

        public void setPlayerOut(PlayerOut playerOut) {
            this.playerOut = playerOut;
        }

        public PlayerIn getPlayerIn() {
            return playerIn;
        }

        public void setPlayerIn(PlayerIn playerIn) {
            this.playerIn = playerIn;
        }
    }

    public static class Team {
        @SerializedName("id")
        @Expose
        private int id;
        @SerializedName("name")
        @Expose
        private String name;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
