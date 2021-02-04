package com.vmichalak.prsmashfranceclient.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Placement (
    @SerialName("id") val id: Long,
    @SerialName("tournament") val tournament: String,
    @SerialName("seed") val seed: Int,
    @SerialName("placement") val placement: Int
)
