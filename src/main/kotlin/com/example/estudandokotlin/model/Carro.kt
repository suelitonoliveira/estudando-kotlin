package com.example.estudandokotlin.model

import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor
import java.time.LocalDate
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
class Carro(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?,
    val modelo: String?,
    val anoFabricacao: Long?,
    val cor: String?,
    val data: LocalDate? = LocalDate.now()
)

