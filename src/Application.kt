package me.gabrielkirsten.example

import io.ktor.routing.routing
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty
import me.gabrielkirsten.example.controller.helloWord

fun main(args: Array<String>) { // Application Entry Point

    val server = embeddedServer(Netty, 8080) { // Create an application using Netty
        routing {// Install the Routing Feature and start configuring it
            helloWord()
        }
    }

    server.start(wait = true) // start the server waiting for connections
}

