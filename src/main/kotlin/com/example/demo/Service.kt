package com.example.demo

import org.springframework.stereotype.Service

@Service
class Service(private val repository: Repository) {


    fun getName(id: Int): String {
        return repository.getName(id).first()
    }
}