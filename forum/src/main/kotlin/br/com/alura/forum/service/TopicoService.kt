package br.com.alura.forum.service

import br.com.alura.forum.model.Curso
import br.com.alura.forum.model.Topico
import br.com.alura.forum.model.Usuario
import org.springframework.stereotype.Service
import java.util.*

@Service
class TopicoService(private var topicos: List<Topico>) {

    init {
        val topico = Topico(
                id = 1,
                titulo = "Duvida Kotlin",
                mensagem = "Variaveis no Kotlin",
                curso = Curso(
                        id = 1,
                        nome = "Kotlin",
                        categoria = "Programacao"
                ),
                autor = Usuario(
                        id = 1,
                        nome = "Maria da Silva",
                        email = "maria@gmail.com"
                )
        )

        val topico2 = Topico(
                id = 2,
                titulo = "Duvida Java",
                mensagem = "Variaveis no Java",
                curso = Curso(
                        id = 1,
                        nome = "Java",
                        categoria = "Programacao"
                ),
                autor = Usuario(
                        id = 1,
                        nome = "Maria da Silva",
                        email = "maria@gmail.com"
                )
        )

        val topico3 = Topico(
                id = 3,
                titulo = "Duvida Go",
                mensagem = "Variaveis no Go",
                curso = Curso(
                        id = 1,
                        nome = "Go",
                        categoria = "Programacao"
                ),
                autor = Usuario(
                        id = 1,
                        nome = "Maria da Silva",
                        email = "maria@gmail.com"
                )
        )
        topicos = Arrays.asList(topico, topico2, topico3)
    }
    fun listar(): List<Topico>{
        return topicos
    }

    fun buscarPorId(id: Long): Topico{
        return topicos.stream().filter({
            t -> t.id == id
        }).findFirst().get()
    }
}