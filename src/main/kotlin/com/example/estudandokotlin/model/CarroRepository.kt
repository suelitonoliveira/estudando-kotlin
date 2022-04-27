package com.example.estudandokotlin.model

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface CarroRepository : CrudRepository<Carro, Long> {
}