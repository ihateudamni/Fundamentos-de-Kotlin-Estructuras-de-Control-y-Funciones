fun main() {
    val edad = 30

    if (edad < 12)
        println("Tarifa infantil")

    else if (edad in 12..64)
        println("Tarifa general")

    else println("Tarifa de adulto mayor")
}
