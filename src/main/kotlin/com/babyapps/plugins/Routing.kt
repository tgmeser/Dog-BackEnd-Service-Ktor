package com.babyapps.plugins

import com.babyapps.routes.emitDogRandomly
import io.ktor.routing.*
import io.ktor.http.*
import io.ktor.content.*
import io.ktor.http.content.*
import io.ktor.application.*
import io.ktor.response.*
import io.ktor.request.*

fun Application.configureRouting() {
    

    routing {

        // Just for testing below
        /*
        get("/") {
                call.respondText("Hello World!")
            }

         */
        emitDogRandomly()

        // Static plugin. Try to access `/static/index.html`

        //static("/static") {
        static {
            resources("static")
        }
    }
}
