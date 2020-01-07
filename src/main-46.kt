import java.lang.NumberFormatException

fun main() {

    try {
        println("wertrewgt".toInt())
    } catch (e: NumberFormatException) {
        println("Esse valor não é um numero")
    } catch (e: Exception) {
        println("Erro generico")
    } finally {
        println("Sempre executa")
    }

    println("Fim")
    println("Fim")
}