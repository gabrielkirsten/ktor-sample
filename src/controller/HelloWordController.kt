package me.gabrielkirsten.example.controller

import io.ktor.application.call
import io.ktor.http.ContentType
import io.ktor.response.respondText
import io.ktor.routing.Routing
import io.ktor.routing.get

class HelloWordController {

    companion object {
        const val PATH = "/"
    }

}

fun Routing.helloWord() {
    get(HelloWordController.PATH) {
        call.respondText("Hello, world!", ContentType.Text.Plain)
    }
}


