fun encontrarMultiplo(lista: List<Int>): Int? {
    for (num in lista) {
        if (num % 4 == 0) return num
    }
    return null
}

fun main() {
    val numeros = listOf(3, 5, 8, 10)
    println("Primer múltiplo de 4: ${encontrarMultiplo(numeros)}")
}
