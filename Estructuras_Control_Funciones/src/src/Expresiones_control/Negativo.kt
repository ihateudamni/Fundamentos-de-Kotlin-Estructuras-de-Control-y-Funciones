fun main() {
    val numeros = listOf(5, 10, -15, 9, 20)
    var suma = 0

    for (num in numeros) {
        if (num < 0) break
        suma += num
    }

    println("Suma hasta el negativo: $suma")
}
