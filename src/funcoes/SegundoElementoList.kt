package funcoes

fun <E> List<E>.secondOrNull(): E? = if(this.size >= 2) this.get(1) else null
fun Int.aoQuadrado(): Int = Math.pow(this.toDouble(),2.toDouble()).toInt()

fun main(args: Array<String>) {
    val list = listOf("João","Maria","Pedro")
    println(list.secondOrNull())
    println(2.aoQuadrado())
}