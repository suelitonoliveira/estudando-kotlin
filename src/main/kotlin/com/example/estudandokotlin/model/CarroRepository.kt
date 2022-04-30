package com.example.estudandokotlin.model

import org.springframework.data.repository.CrudRepository

interface CarroRepository : CrudRepository<Carro, Long> {
}