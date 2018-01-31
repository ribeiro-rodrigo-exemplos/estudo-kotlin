package classes

class Cliente2{
    constructor(nome: String, sexo: String){
        this.nome = nome
        this.sexo = sexo
    }

    var nome: String
        get() = "Meu nome é ${field}"
        set(value){
            field = value.takeIf { value.isNotEmpty() } ?: "Anônimo"
        }

    var sexo: String
        get() = field.takeIf { field.isNotEmpty() } ?: "Indefinido"
}

fun main(args: Array<String>) {
    val c1 = Cliente2("","")
    println("${c1.nome} do sexo ${c1.sexo}")

    val c2 = Cliente2("Pedro","Feminino")
    c2.nome = "Ana"
    println("${c2.nome} do sexo ${c2.sexo}")
}