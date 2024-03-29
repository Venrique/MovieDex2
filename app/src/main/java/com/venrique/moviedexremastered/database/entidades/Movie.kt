package com.venrique.moviedexremastered.database.entidades

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.squareup.moshi.Json
import java.io.Serializable

@Entity(tableName = "peliculas")
data class Movie(
    @PrimaryKey
    @field:Json(name = "imdbID")
    val id: String,
    @field:Json(name = "Title")
    val title: String,
    @field:Json(name = "Year")
    val year: String,
    @field:Json(name = "Genre")
    val genre: String,
    @field:Json(name = "Director")
    val director: String,
    @field:Json(name = "Poster")
    val poster: String,
    @field:Json(name = "Rated")
    val rating: String,
    @field:Json(name = "Plot")
    val plot: String,
    @field:Json(name= "Runtime")
    val duration: String


): Serializable

data class MovieResponse(
    @field:Json(name = "Search")
    val search: List<Movie> = listOf<Movie>(),
    @field:Json(name = "totalResults")
    val results: String
)