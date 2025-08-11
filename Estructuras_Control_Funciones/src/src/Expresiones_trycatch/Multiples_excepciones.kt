fun main() {
    try {
        val texto = "abc"
        val numero = texto.toInt()
        val resultado = 10 / numero
        println("Resultado: $resultado")
    } catch (e: Exception) {
        when (e) {
            is NumberFormatException -> println("Error: Conversión inválida")
            is ArithmeticException -> println("Error: División por cero")
            else -> println("Error desconocido: ${e.message}")
        }
    }
}
