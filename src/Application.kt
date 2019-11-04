package me.gabrielkirsten.example

import io.ktor.application.call
import io.ktor.http.ContentType
import io.ktor.response.respondText
import io.ktor.routing.get
import io.ktor.routing.routing
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty

fun main(args: Array<String>) { // Application Entry Point
    val server = embeddedServer(Netty, 8080) { // Create an application using Netty
        routing {// Install the Routing Feature and start configuring it
            get("/") {
                call.respondText("Hello, world!", ContentType.Text.Plain)
            }
            get("/demo") {
                call.respondText { "HELLO WORLD!" }
            }
        }
    }

    server.start(wait = true) // start the server waiting for connections
}

