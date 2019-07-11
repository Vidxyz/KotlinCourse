package com.vid.kotlin.stdlib

data class Album(val title: String, val year: Int, val chartUK: Int, val chartUS: Int, val tracks: List<Track> = listOf())

data class Track(val title: String, val durationInSeconds: Int)


val albums = listOf(
    Album("The Dark side of the moon", 1973, 2, 1, listOf(
        Track("Speak to me", 90),
        Track("Breathe", 163),
        Track("On the run", 246),
        Track("Money", 331),
        Track("Us and theme", 157),
        Track("Eclipse", 144)
    )),
    Album("The Wall", 1988, 4, 6),
    Album("Animals", 1977, 2, 4),
    Album("Atom Hart MOther", 1997, 2, 1),
    Album("The Final cut", 1998, 1, 1),
    Album("Minutes to Midnight", 2007, 1, 1)
)


fun main() {

    // Non functional way of doing this
    for(album in albums) {
        if(album.chartUK == 1) {
            println("Found ${album.title}")
        }
    }

    println("Done")

    // Better way
    albums.forEach {
        if(it.chartUK == 1) println("Found it - ${it.title}")
    }

    println("Done")

    // Using filter
    val topAlbums =  albums.filter {
        it.chartUK == 1
    }

    topAlbums.forEach {
        println(it.title)
    }


    albums
        .filter { it.chartUK == 1 }
        .forEach { println(it.title) }

    println("Done")

    albums
        .filter { it.chartUK == 1 }
        .map { Pair(it.title, it.year) }
        .forEach {println(it)}


    println("About to custom filter")

    albumAndTracksLowerThanXSeconds(200, albums).forEach{
        println(it)
    }
}


fun albumAndTracksLowerThanXSeconds(duration: Int, albums: List<Album>): List<Pair<String, String>> {

    // MAP
    // [a,b,c], f(x) =? [f(a), f(b), f(c)]
    // FLATMAP: works on collections on collections, to essentially flatten them
    // [[a,b] , [c,d]], f(x) => [f(a), f(b), f(c), f(d)]

    return albums.flatMap {
        val albumTitle = it.title
        it.tracks.filter { it.durationInSeconds < duration }
            .map { Pair(albumTitle, it.title) }
    }

}