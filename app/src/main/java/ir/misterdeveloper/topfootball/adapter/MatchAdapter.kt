package ir.misterdeveloper.topfootball.adapter

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.annotation.NonNull
import androidx.annotation.RequiresApi
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView
import com.ahmadrosid.svgloader.SvgLoader
import com.squareup.picasso.Picasso
import ir.misterdeveloper.topfootball.R
import ir.misterdeveloper.topfootball.model.Response.Match
import ir.misterdeveloper.topfootball.model.Response.MatchResponse
import ir.misterdeveloper.topfootball.util.DateConvert

import java.text.ParseException
import java.text.SimpleDateFormat

import java.util.*
import kotlin.collections.ArrayList


class MatchAdapter(
    private var context: Context,
    private var matchResponse: ArrayList<Match?>? = null,
    private val activity: Activity

    ) :
    RecyclerView.Adapter<MatchAdapter.MatchVH>() {
    private var timeIran: String? = null
    private var dateShamsi: String? = null


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MatchAdapter.MatchVH {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.card_matchs, null)
        return MatchVH(view)
    }

    @SuppressLint("SimpleDateFormat")
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onBindViewHolder(holder: MatchAdapter.MatchVH, position: Int) {




        val match = matchResponse?.get(position)

        holder.textViewHome.text = match!!.homeTeam.shortName
        holder.textViewAway.text = match!!.awayTeam.shortName

        if (match!!.awayTeam.crest.contains(".svg")) {

            SvgLoader.pluck()
                .with(activity)
                .setPlaceHolder(R.drawable.default_crest, R.drawable.default_crest)
                .load(match!!.awayTeam.crest, holder.imageViewAway)

        } else {

            Picasso.get().load(match!!.awayTeam.crest).placeholder(R.drawable.default_crest)
                .into(holder.imageViewAway)
        }
        if (match!!.homeTeam.crest.contains(".svg")) {

            SvgLoader.pluck()
                .with(activity)
                .setPlaceHolder(R.drawable.default_crest, R.drawable.default_crest)
                .load(match.homeTeam.crest, holder.imageViewHome)

        } else {

            Picasso.get().load(match.homeTeam.crest).placeholder(R.drawable.default_crest)
                .into(holder.imageViewHome)

        }

        val dateTimeMatch: String = match.utcDate.toInstant().toString()
        formattedDateAndTime(dateTimeMatch)



        if (match.status.equals(context.getString(R.string.finished))) {

            holder.textViewDate.text = context.getString(R.string.finished)
            holder.textViewTime.text = "--:--"
            holder.textViewResultHome.text =
                (match.score.fullTime.home as Double).toInt().toString()
            holder.textViewResultAway.text =
                (match.score.fullTime.away as Double).toInt().toString()

        }

        if (match.status.equals(context.getString(R.string.timed))) {

            holder.textViewDate.text = dateShamsi
            holder.textViewTime.text = timeIran
            holder.textViewResultHome.text = "-"
            holder.textViewResultAway.text = "-"

        }
        if (match.status.equals(context.getString(R.string.in_play))) {

            holder.textViewDate.text = context.getString(R.string.in_play)
            holder.textViewTime.text = timeIran
            holder.textViewResultHome.text =
                (match.score.fullTime.home as Double).toInt().toString()
            holder.textViewResultAway.text =
                (match.score.fullTime.away as Double).toInt().toString()

        }
        if (match.status.equals(context.getString(R.string.pused))) {

            holder.textViewDate.text = context.getString(R.string.pused)
            holder.textViewTime.text = timeIran
            holder.textViewResultHome.text =
                (match.score.halfTime.home as Double).toInt().toString()
            holder.textViewResultAway.text =
                (match.score.halfTime.away as Double).toInt().toString()

        }







    }

    override fun getItemCount(): Int {
        return matchResponse!!.size
    }


    inner class MatchVH(@NonNull itemView: View) : RecyclerView.ViewHolder(itemView) {

        var textViewHome: AppCompatTextView = itemView.findViewById(R.id.textViewTeam1)
        var textViewAway: AppCompatTextView = itemView.findViewById(R.id.textViewTeam2)
        var textViewResultHome: AppCompatTextView = itemView.findViewById(R.id.textViewResultTeam1)
        var textViewResultAway: AppCompatTextView = itemView.findViewById(R.id.textViewResultTeam2)
        var imageViewHome: AppCompatImageView = itemView.findViewById(R.id.imageViewTeam1)
        var imageViewAway: AppCompatImageView = itemView.findViewById(R.id.imageViewTeam2)
        var textViewDate: AppCompatTextView = itemView.findViewById(R.id.textViewDate)
        var textViewTime: AppCompatTextView = itemView.findViewById(R.id.textViewTime)


    }

    private fun formattedDateAndTime(dateTimeMatch: String) {

        val separationTimeAndDate = dateTimeMatch.split("T").toTypedArray()

        val time = separationTimeAndDate[1]
        val df = SimpleDateFormat("HH:mm")
        df.timeZone = TimeZone.getTimeZone("UTC")
        var date: Date? = null
        try {
            date = df.parse(time)
        } catch (e: ParseException) {
            e.printStackTrace()
        }
        df.timeZone = TimeZone.getTimeZone("GMT+3:30")
        timeIran = df.format(date)


        val dateMatch = separationTimeAndDate[0]
        val dateGregorianToPersian = dateMatch.split("-").toTypedArray()

        val dateConvert = DateConvert()
        dateConvert.GregorianToPersian(
            dateGregorianToPersian[0].toInt(),
            dateGregorianToPersian[1].toInt(),
            dateGregorianToPersian[2].toInt()
        )

        dateShamsi = dateConvert.year
            .toString() + "/" + dateConvert.month + "/" + dateConvert.day

    }



}



