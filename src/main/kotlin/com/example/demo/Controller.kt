package com.example.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller(private val service: Service) {

    @GetMapping("/{id}")
    fun getName(@PathVariable("id") id:Int): String {
        println(service.getName(id))
        return service.getName(id)

    }
}