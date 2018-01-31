package classes

class Filme3(nome: String, anoDeLancamento: Int, genero: String){
    val nome: String
    val anoDeLancamento: Int
    val genero: String

    init {
        this.nome = nome
        this.anoDeLancamento = anoDeLancamento
        this.genero = genero
    }
}

fun main(args: Array<String>) {
    val filme = Filme3("Os Incríveis",2004, "Ação")
    println("${filme.nome} foi lançado em ${filme.anoDeLancamento}")
}