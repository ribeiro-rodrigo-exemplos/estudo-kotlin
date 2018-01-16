package fundamentos

fun main(args: Array<String>){
    val a = 1

    //Número para string
    println(a.toString())

    //Strin para Número
    println("1.9".toDouble() + 3)
    println("Teste".toIntOrNull())
    println("Teste".toIntOrNull() ?: 0)
    println("1".toInt() + 3)
}