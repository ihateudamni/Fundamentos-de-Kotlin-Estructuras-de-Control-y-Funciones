fun main() {
    val temperatura = 18

    if (temperatura < 0)
        println("Bajo cero")

    else if (temperatura in 0..14)
        println("Fría")

    else if (temperatura in 15..25)
        println("Agradable")

    else println("Calurosa")
}
