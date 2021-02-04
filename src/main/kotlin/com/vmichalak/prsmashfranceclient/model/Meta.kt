package com.vmichalak.prsmashfranceclient.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Meta(
    @SerialName("current") val current: Int,
    @SerialName("all_time") val allTime: Int
)
