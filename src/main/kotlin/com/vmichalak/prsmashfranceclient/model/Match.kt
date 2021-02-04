package com.vmichalak.prsmashfranceclient.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Match (
    @SerialName("id") val id: Long,
    @SerialName("score")  val score: Int,
    @SerialName("opponent") val opponent: String,
    @SerialName("is_winner") val isWinner: Boolean?,
    @SerialName("winner_score") val winnerScore: Int?,
    @SerialName("looser_score") val looserScore: Int?
)
