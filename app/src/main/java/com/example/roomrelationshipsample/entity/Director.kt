package com.example.roomrelationshipsample.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "director_table")
data class Director(
    @PrimaryKey(autoGenerate = false)
    val directorName: String
)
