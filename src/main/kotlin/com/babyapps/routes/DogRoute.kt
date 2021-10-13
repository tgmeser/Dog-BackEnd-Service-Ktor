package com.babyapps.routes

import com.babyapps.data.model.Dog
import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*

//private const val BASE_URL = "http://localhost:8080" <---doesnt work in android emulator
private const val BASE_URL= "http://192.168.1.2:8080"

private val dogList = listOf(
    Dog("Doberman", "Germany", true, 70, 40.00, "$BASE_URL/dogs/doberman.jpg"),
    Dog("Rottweiler", "Germany", true, 65, 55.50, "$BASE_URL/dogs/rottweiler.jpg"),
    Dog("Akita", "Japan", true, 63, 38.00, "$BASE_URL/dogs/akita.jpg"),
    Dog("Cane Corso", "Italy", true, 68, 57.00, "$BASE_URL/dogs/canecorso.jpg"),
    Dog("Dogo Argentino", "Argentina", true, 72, 58.00, "$BASE_URL/dogs/dogoargentino.jpg"),
    Dog("German Shepherd", "Germany", true, 62, 37.00, "$BASE_URL/dogs/germanshepherd.jpg"),
    Dog("Husky", "Siberia", false, 60, 35.00, "$BASE_URL/dogs/husky.jpg"),
    Dog("Bulldog", "England", false, 55, 30.00, "$BASE_URL/dogs/bulldog.jpg"),
)

fun Route.emitDogRandomly() {
    get("/randomdog") {
        call.respond(
            HttpStatusCode.OK,
            dogList.random()
        )
    }
}