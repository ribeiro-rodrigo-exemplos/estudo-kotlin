package funcoes

inline fun transacao(funcao: () -> Unit){
    println("abrindo transação")
    try{
        funcao()
    }
    finally {
        println("fechando transacao")
    }
}

inline fun transacao2(a: Int, funcao: () -> Unit){
    println("abrindo transação $a")
    try{
        funcao()
    }
    finally {
        println("fechando transacao $a")
    }
}

inline fun transacao3(funcao: () -> Unit,a: Int){
    println("abrindo transação $a")
    try{
        funcao()
    }
    finally {
        println("fechando transacao $a")
    }
}

fun main(args: Array<String>) {
    transacao {
        println("Executando SQL 1...")
        println("Executando SQL 2...")
        println("Executando SQL 3...")
    }

    transacao2(2){
        println("Executando SQL 4...")
        println("Executando SQL 5...")
        println("Executando SQL 6...")
    }

    transacao3({
        println("Executando SQL 7...")
        println("Executando SQL 8...")
        println("Executando SQL 9...")
    },3)

    transacao3(a = 4, funcao = {
        println("Executando SQL 10...")
        println("Executando SQL 11...")
        println("Executando SQL 12...")
    })
}