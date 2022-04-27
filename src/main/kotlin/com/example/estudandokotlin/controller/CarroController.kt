package com.example.estudandokotlin.controller

import com.example.estudandokotlin.model.Carro
import com.example.estudandokotlin.model.CarroRepository
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class CarroController(private val carroRepository: CarroRepository) {

    @PostMapping("/carro")
    fun save(carro: Carro): Carro {
        return this.carroRepository.save(carro);
    }

    @GetMapping("/")
    fun blog(model: Model): String {
        model["title"] = "Blog"
        return "blog"
    }

}