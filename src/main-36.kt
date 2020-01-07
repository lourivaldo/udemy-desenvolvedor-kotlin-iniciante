fun calcFaixaEtaria(idade: Int): String = if (idade >= 18) "adulto" else "criança"

fun main() {
    println(calcFaixaEtaria(18))
    println(calcFaixaEtaria(5))
}