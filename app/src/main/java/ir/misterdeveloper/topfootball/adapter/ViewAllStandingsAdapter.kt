package ir.misterdeveloper.topfootball.adapter

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.NonNull
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView
import com.ahmadrosid.svgloader.SvgLoader
import com.squareup.picasso.Picasso
import ir.misterdeveloper.topfootball.R
import ir.misterdeveloper.topfootball.model.Response.StandingsResponse

class ViewAllStandingsAdapter(
    private var context: Context,
    private var standingsResponse: StandingsResponse,
    private val activity: Activity
) : RecyclerView.Adapter<ViewAllStandingsAdapter.viewAllStandingVH>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewAllStandingsAdapter.viewAllStandingVH {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.card_standing, null)
        return viewAllStandingVH(view)
    }
    override fun onBindViewHolder(holder: viewAllStandingVH, position: Int) {
        val match = standingsResponse.standings[0].table[position]
        holder.team_position.text = match.position.toString()
        holder.matches_won.text = match.won.toString()
        holder.team_points.text = match.points.toString()
        holder.matches_lost.text = match.lost.toString()
        holder.matches_drawn.text = match.draw.toString()
        holder.matches_played.text = match.playedGames.toString()
        holder.team_name.text = match.team.shortName.toString()

        if (match.team.crest.contains(".svg")) {

            SvgLoader.pluck()
                .with(activity)
                .setPlaceHolder(R.drawable.default_crest, R.drawable.default_crest)
                .load(match.team.crest, holder.team_crest)

        } else {

            Picasso.get().load(match.team.crest).placeholder(R.drawable.default_crest)
                .into(holder.team_crest)
        }
    }


    override fun getItemCount(): Int {
        return standingsResponse.standings[0].table.size
    }

    inner class viewAllStandingVH(@NonNull itemView: View) : RecyclerView.ViewHolder(itemView) {

        var team_name: AppCompatTextView = itemView.findViewById(R.id.team_name)
        var matches_played: AppCompatTextView = itemView.findViewById(R.id.matches_played)
        var matches_won: AppCompatTextView = itemView.findViewById(R.id.matches_won)
        var matches_drawn: AppCompatTextView = itemView.findViewById(R.id.matches_drawn)
        var team_crest: AppCompatImageView = itemView.findViewById(R.id.team_crest)
        var matches_lost: AppCompatTextView = itemView.findViewById(R.id.matches_lost)
        var team_points: AppCompatTextView = itemView.findViewById(R.id.team_points)
        var team_position: AppCompatTextView = itemView.findViewById(R.id.team_position)


    }

}