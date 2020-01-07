fun calcBonus(cargo: String, salario: Float): Float {

    val bonus: Float

    if (cargo == "coordenador") {
        bonus = salario * 0.2f
    } else if (cargo == "gerente junior") {
        bonus = salario * 0.5f
    } else {
        bonus = salario * 2
    }

    return bonus
}


fun main() {
    println(calcBonus("gerente junior", 1000f))
}