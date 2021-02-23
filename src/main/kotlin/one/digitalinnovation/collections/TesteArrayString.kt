package one.digitalinnovation.collections

fun main() {
   val nomes = Array(3){""}

    nomes[0] = "Maria"
    nomes[1] = "Zaza"
    nomes[2] = "Jose"

    nomes.forEach {
        println(it)
    }

    println("======================")

    nomes.sort()
    for (valor in nomes){
        println(valor)
    }

    println("===================")

    val nome2 = arrayOf("Maria", "Joao", "Zezin", "Tiao")
    nome2.sort()
    nome2.forEach { println(it) }
}