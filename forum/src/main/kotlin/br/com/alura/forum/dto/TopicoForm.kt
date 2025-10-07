package br.com.alura.forum.dto

import jakarta.validation.constraints.NotEmpty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size

data class TopicoForm (
        @field:NotEmpty(message = "Titulo nao pode ser vazio")
        @field:Size(min = 5, max = 100, message = "Titulo deve ter entre 5 e 100 caracteres")
        val titulo: String,

        @field:NotEmpty(message = "Mensagem nao pode ser vazia")
        val mensagem: String,

        @field:NotNull
        val idCurso: Long,

        @field:NotNull val idAutor: Long
)
