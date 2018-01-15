package fundamentos.operadores

fun main(args: Array<String>) {
    val executouTrabalho1: Boolean = true
    val executouTrabalho2: Boolean = true

    val comprouSorvete: Boolean = executouTrabalho1 || executouTrabalho2
    val comprouTv50: Boolean = executouTrabalho1 && executouTrabalho2
    val comprouTv32: Boolean = executouTrabalho1 xor executouTrabalho2

    println("$comprouSorvete $comprouTv50 $comprouTv32")

    //Operador unário

    if(!comprouSorvete){
        println("A saúde agradece.")
    }
}
