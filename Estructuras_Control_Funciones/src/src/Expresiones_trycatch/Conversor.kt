fun main() {
    try {
        val texto = "abc"
        val numero = texto.toInt()
        println("Número: $numero")
    } catch (e: NumberFormatException) {
        println("Error: No es posible convertir a número")
    }
}
