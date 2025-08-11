fun indicePrimeraVocal(texto: String): Int {
    val vocales = listOf('a', 'e', 'i', 'o', 'u',
        'A', 'E', 'I', 'O', 'U')
    for (i in texto.indices) {
        if (texto[i] in vocales) return i
    }
    return -1
}

fun main() {
    val palabra = "Kotlin"
    println("Índice de la primera vocal: ${indicePrimeraVocal(palabra)}")
}
