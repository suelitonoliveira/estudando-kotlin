package com.example.estudandokotlin;

import com.example.estudandokotlin.model.Pessoa
import org.springframework.data.jpa.repository.JpaRepository

interface PessoaRepository : JpaRepository<Pessoa, Long> {
}