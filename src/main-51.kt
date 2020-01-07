//fun media(n1: Float, n2: Float) {
//
//}

fun media(vararg notas: Float) {
    println(notas.size)
//    if (notas.size > 0) {
    if (notas.isNotEmpty()) {
        var soma = 0f
        for (nota in notas) {
            soma += nota
        }
        println("A media é ${soma / notas.size}")
    }
}

fun <N> media3(vararg notas: N) {
    for (nota in notas) {
        println(nota)
    }
}
fun main() {
    media()
    media(9f)
    media(5f, 9f, 8f, 9f, 10f, 9f)

    media3(1, 9f, false, "")
}