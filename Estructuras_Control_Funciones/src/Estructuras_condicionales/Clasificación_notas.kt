fun main() {
    val nota = 90

    if (nota >= 90)
        println("Excelente")

    else if (nota in 70..89)
        println("Bueno")

    else if (nota in 50..69)
        println("Regular")
    else
        println("Reprobado")
}
