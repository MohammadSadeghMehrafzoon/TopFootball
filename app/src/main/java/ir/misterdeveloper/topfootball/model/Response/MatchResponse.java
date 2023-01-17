package ir.misterdeveloper.topfootball.model.Response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

import ir.misterdeveloper.topfootball.model.Response.Match;


public class MatchResponse {

    @SerializedName("matches")
    @Expose
    private ArrayList<Match> matches = null;

    public ArrayList<Match> getMatches() {
        return matches;
    }

    public void setMatches(ArrayList<Match> matches) {
        this.matches = matches;
    }


}
