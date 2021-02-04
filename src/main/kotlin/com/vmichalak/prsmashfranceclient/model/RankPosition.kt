package com.vmichalak.prsmashfranceclient.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RankPosition(
     @SerialName("id") val id: Long,
     @SerialName("match_count") val matchCount: Int,
     @SerialName("score") val score: Int,
     @SerialName("name") val name: String,
     @SerialName("position") val position: Int
)
