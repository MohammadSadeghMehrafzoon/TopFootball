package ir.misterdeveloper.topfootball.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.NonNull
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import ir.misterdeveloper.topfootball.R
import ir.misterdeveloper.topfootball.model.dataClass.League

class LeagueAdapter(private var context: Context, private var leagueList: List<League>,private var clickEvent: ClickEvent) :
    RecyclerView.Adapter<LeagueAdapter.LeagueVH>() {

    private var selectedItem:Int = 0



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LeagueAdapter.LeagueVH {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.card_league, null)
        return LeagueVH(view)
    }

    override fun onBindViewHolder(holder: LeagueAdapter.LeagueVH, @SuppressLint("RecyclerView") position: Int) {

        val league = leagueList[position]

        holder.textViewNameLeague.text = league.nameLeague






        holder.itemView.setOnClickListener {
            selectedItem = position
            notifyDataSetChanged()
        }
        if (selectedItem == position)
            holder.cardView.setCardBackgroundColor(context.resources.getColor(R.color.pink_400))
        else
            holder.cardView.setCardBackgroundColor(context.resources.getColor(R.color.background))


        clickEvent.selectItem(selectedItem)

    }

    override fun getItemCount(): Int {
        return leagueList.size
    }


    inner class LeagueVH(@NonNull itemView: View) : RecyclerView.ViewHolder(itemView) {

        var textViewNameLeague: AppCompatTextView = itemView.findViewById(R.id.textViewNameLeague)
        var cardView: CardView = itemView.findViewById(R.id.cardView)

    }

    interface ClickEvent {
        fun selectItem(position: Int)
    }


}