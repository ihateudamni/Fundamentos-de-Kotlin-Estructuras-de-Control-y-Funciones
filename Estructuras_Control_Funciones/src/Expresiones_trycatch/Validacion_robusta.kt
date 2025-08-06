fun convertirASeguro(texto: String): Int {
    return try {
        texto.toInt()
    } catch (e: Exception) {
        0
    }
}

fun main() {
    println(convertirASeguro("123"))
    println(convertirASeguro("abc"))
}
