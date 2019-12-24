package org.robojackets.apiaryclient

import java.util.Date

data class Event(
    val id: Int,
    val name: String,
    val location: String,
    val allowAnonymousRsvp: Boolean,
    val price: Float,
    val startTime: Date,
    val endTime: Date,
    val createdAt: Date,
    val updatedAt: Date
)