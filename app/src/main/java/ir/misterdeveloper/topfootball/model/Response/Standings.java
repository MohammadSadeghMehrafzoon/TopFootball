package ir.misterdeveloper.topfootball.model.Response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Standings {

    @SerializedName("stage")
    @Expose
    private String stage;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("group")
    @Expose
    private Object group;
    @SerializedName("table")
    @Expose
    private ArrayList<Table> table;

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Object getGroup() {
        return group;
    }

    public void setGroup(Object group) {
        this.group = group;
    }

    public ArrayList<Table> getTable() {
        return table;
    }

    public void setTable(ArrayList<Table> table) {
        this.table = table;
    }

    public static  class Table{
        @SerializedName("position")
        @Expose
        private int position;
        @SerializedName("team")
        @Expose
        private Team team;
        @SerializedName("playedGames")
        @Expose
        private int playedGames;
        @SerializedName("form")
        @Expose
        private String form;
        @SerializedName("won")
        @Expose
        private int won;
        @SerializedName("draw")
        @Expose
        private int draw;
        @SerializedName("lost")
        @Expose
        private int lost;
        @SerializedName("points")
        @Expose
        private int points;
        @SerializedName("goalsFor")
        @Expose
        private int goalsFor;
        @SerializedName("goalsAgainst")
        @Expose
        private int goalsAgainst;
        @SerializedName("goalDifference")
        @Expose
        private int goalDifference;

        public int getPosition() {
            return position;
        }

        public void setPosition(int position) {
            this.position = position;
        }

        public Team getTeam() {
            return team;
        }

        public void setTeam(Team team) {
            this.team = team;
        }

        public int getPlayedGames() {
            return playedGames;
        }

        public void setPlayedGames(int playedGames) {
            this.playedGames = playedGames;
        }

        public String getForm() {
            return form;
        }

        public void setForm(String form) {
            this.form = form;
        }

        public int getWon() {
            return won;
        }

        public void setWon(int won) {
            this.won = won;
        }

        public int getDraw() {
            return draw;
        }

        public void setDraw(int draw) {
            this.draw = draw;
        }

        public int getLost() {
            return lost;
        }

        public void setLost(int lost) {
            this.lost = lost;
        }

        public int getPoints() {
            return points;
        }

        public void setPoints(int points) {
            this.points = points;
        }

        public int getGoalsFor() {
            return goalsFor;
        }

        public void setGoalsFor(int goalsFor) {
            this.goalsFor = goalsFor;
        }

        public int getGoalsAgainst() {
            return goalsAgainst;
        }

        public void setGoalsAgainst(int goalsAgainst) {
            this.goalsAgainst = goalsAgainst;
        }

        public int getGoalDifference() {
            return goalDifference;
        }

        public void setGoalDifference(int goalDifference) {
            this.goalDifference = goalDifference;
        }
    }
    public static class Team {

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
    }


}
