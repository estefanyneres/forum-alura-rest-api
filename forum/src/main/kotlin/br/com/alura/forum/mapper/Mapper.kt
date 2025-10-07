package br.com.alura.forum.mapper

interface Mapper<Entrada, Saida> {
    fun map(entrada: Entrada): Saida
}
