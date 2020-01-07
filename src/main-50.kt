fun endereco(rua: String = "", cidade: String = "", numero: String = "") {
    println("Rua $rua")
    println("Cidade $cidade")
    println("Numero $numero")
}

fun main() {
    endereco(cidade= "Paulista")
}