package org.robojackets.apiaryclient

import java.util.Date

data class Event(
    val id: Int,
    val name: String,
    val location: String?,
    val allowAnonymousRsvp: Boolean,
    val price: Float,
    val organizer: Int?,
    val startTime: Date?,
    val endTime: Date?,
    val createdAt: Date,
    val updatedAt: Date
)


val sampleEvent1 = Event(
    1,
    "2019 General Interest Meeting A",
    null,
    true,
    0f,
    null,
    null,
    null,
    Date(1577214913000), //Approx 2019-12-24 14:16
    Date(1577215013000))