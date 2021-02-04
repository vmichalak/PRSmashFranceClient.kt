package com.vmichalak.prsmashfranceclient

import kotlinx.coroutines.runBlocking
import kotlin.test.Test
import kotlin.test.assertNotEquals

class PRSmashFranceClientTest {
    private val client = PRSmashFranceClient()

    @Test
    fun testGetMeta() {
        val result = runBlocking { client.getMeta() }
        assertNotEquals(result.allTime, 0)
        assertNotEquals(result.current, 0)
    }

    @Test
    fun testGetPlayerRatings() {
        val result = runBlocking { client.getPlayerRatings(1, 1) }
        assertNotEquals(result.size, 0)
    }

    @Test
    fun testGetPlayerPlacements() {
        val result = runBlocking { client.getPlayerPlacements(1, 1) }
        assertNotEquals(result.size, 0)
    }

    @Test
    fun testGetAllTimeRanking() {
        val result = runBlocking { client.getAllTimeRanking() }
        assertNotEquals(result.size, 0)
    }

    @Test
    fun testGetCurrentRanking() {
        val result = runBlocking { client.getCurrentRanking() }
        assertNotEquals(result.size, 0)
    }
}
