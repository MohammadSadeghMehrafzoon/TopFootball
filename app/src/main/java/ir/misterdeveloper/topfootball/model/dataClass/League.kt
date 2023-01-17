package ir.misterdeveloper.topfootball.model.dataClass

import com.google.gson.annotations.SerializedName

data class League(


    @SerializedName("nameLeague")
    val nameLeague: String,

    @SerializedName("id")
    val id: Int
)