fun main() {

    val phrase = "Kotlin e uma linguagem"
    val feature = "show!"

    println(phrase + " " + feature)
    println("Kotlin e uma linguagem $feature") // tempĺate

    var str = """Uma frase
        | muito longa
        | com varias linhas
    """.trimMargin()

    println(str)

    println("Qual o tamanho de feature ${feature.length}")

}