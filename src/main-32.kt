fun calculaBonus2(a: Int, b: Int, c:Int) {
    println("O bonus é: ${a + b + c}")
}

fun hello(txt: String): String {
    return "Olá, $txt"
}

fun hello2(txt: String) = "Olá, $txt"

fun main() {

    val a = 10
    val b = 20
    val c = 30

    calculaBonus2(a, b, c)
    println(hello("Loro"))
    println(hello2("Loro"))
}