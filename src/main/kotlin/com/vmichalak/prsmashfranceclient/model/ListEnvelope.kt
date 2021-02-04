package com.vmichalak.prsmashfranceclient.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ListEnvelope<T> (
    @SerialName("data") val data: List<T>
)
