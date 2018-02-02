package lambdas

fun main(args: Array<String>) {
    val nomes = arrayListOf("Renata","Bernardo","Willian","Andrea","Caio")
    val ordenados = nomes.sortedBy { it.reversed() }

    println(ordenados)

}
