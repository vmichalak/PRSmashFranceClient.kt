package com.vmichalak.prsmashfranceclient

import com.vmichalak.prsmashfranceclient.model.*
import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.features.json.*
import io.ktor.client.request.*

class PRSmashFranceClient {
    companion object {
        private const val API_BASE = "https://api.supersmashranking.com"
    }

    private val client by lazy { HttpClient(CIO) {
        install(JsonFeature)
    } }

    suspend fun getMeta(): Meta
        = client.get("$API_BASE/meta")

    suspend fun getRanking(circuitId: Int, withPlacement: Boolean = false): List<RankPosition>
        = client.get<ListEnvelope<RankPosition>>("$API_BASE/circuits/$circuitId/rankings?placement=${withPlacement.toString().toLowerCase()}").data

    suspend fun getPlayerRatings(circuitId: Int, playerId: Int): List<Match>
        = client.get<ListEnvelope<Match>>("$API_BASE/circuits/$circuitId/players/$playerId/ratings").data

    suspend fun getPlayerPlacements(circuitId: Int, playerId: Int): List<Placement>
        = client.get<ListEnvelope<Placement>>("$API_BASE/circuits/$circuitId/players/$playerId/placements").data

    suspend fun getAllTimeRanking(withPlacement: Boolean = false): List<RankPosition> {
        val meta = getMeta()
        return getRanking(meta.allTime, withPlacement)
    }

    suspend fun getCurrentRanking(withPlacement: Boolean = false): List<RankPosition> {
        val meta = getMeta()
        return getRanking(meta.current, withPlacement)
    }
}
