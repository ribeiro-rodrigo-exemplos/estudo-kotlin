package fundamentos.controles

fun main(args: Array<String>) {
    for (i in 10 downTo 1){
        println ("i = $i")
    }

    println (11 in 10 downTo  1) // testando range fora do for
}
