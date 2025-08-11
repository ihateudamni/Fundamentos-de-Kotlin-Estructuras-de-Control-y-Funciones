fun main() {
    val numeros = listOf(3, 5, 7, 9, 11)
    var index = 0

    while (index < numeros.size) {
        if (numeros[index] == 7) {
            println("El número 7 esta en $index")
            break
        }
        index++
    }
}
