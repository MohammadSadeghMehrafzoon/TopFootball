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
import ir.misterdeveloper.topfootball.model.Response.Match
import ir.misterdeveloper.topfootball.model.Response.MatchResponse

class LiveMatchesAdapter(
    private var context: Context,
    private var matchResponse: MatchResponse,
    private val activity: Activity
) : RecyclerView.Adapter<LiveMatchesAdapter.LiveMatchesVH>() {


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): LiveMatchesAdapter.LiveMatchesVH {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.card_live_matches, null)
        return LiveMatchesVH(view)
    }

    override fun onBindViewHolder(holder: LiveMatchesAdapter.LiveMatchesVH, position: Int) {
        val match = matchResponse.matches[position]

            holder.textViewHome.text = match.homeTeam.shortName
            holder.textViewAway.text = match.awayTeam.shortName
              holder.textViewResultHome.text =(match.score.fullTime.home as Double).toInt().toString()
              holder.textViewResultAway.text = (match.score.fullTime.away as Double).toInt().toString()
            holder.textViewNameLeague.text = match.competition.name

            if (match.awayTeam.crest.contains(".svg")) {

                SvgLoader.pluck()
                    .with(activity)
                    .setPlaceHolder(R.drawable.default_crest, R.drawable.default_crest)
                    .load(match.awayTeam.crest, holder.imageViewAway)

            } else {

                Picasso.get().load(match.awayTeam.crest).placeholder(R.drawable.default_crest)
                    .into(holder.imageViewAway)
            }
            if (match.homeTeam.crest.contains(".svg")) {

                SvgLoader.pluck()
                    .with(activity)
                    .setPlaceHolder(R.drawable.default_crest, R.drawable.default_crest)
                    .load(match.homeTeam.crest, holder.imageViewHome)

            } else {

                Picasso.get().load(match.homeTeam.crest).placeholder(R.drawable.default_crest)
                    .into(holder.imageViewHome)

            }


    }

    override fun getItemCount(): Int {
        return matchResponse.matches.size
    }


    inner class LiveMatchesVH(@NonNull itemView: View) : RecyclerView.ViewHolder(itemView) {

        var textViewHome: AppCompatTextView = itemView.findViewById(R.id.textViewTeam1)
        var textViewAway: AppCompatTextView = itemView.findViewById(R.id.textViewTeam2)
        var textViewResultHome: AppCompatTextView = itemView.findViewById(R.id.textViewResultTeam1)
        var textViewResultAway: AppCompatTextView = itemView.findViewById(R.id.textViewResultTeam2)
        var imageViewHome: AppCompatImageView = itemView.findViewById(R.id.imageViewTeam1)
        var imageViewAway: AppCompatImageView = itemView.findViewById(R.id.imageViewTeam2)
        var textViewNameLeague: AppCompatTextView = itemView.findViewById(R.id.textViewNameLeague)


    }
}