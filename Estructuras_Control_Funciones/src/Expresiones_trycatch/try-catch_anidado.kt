fun main() {
    try {
        val texto = "10"
        val numero = try {
            texto.toInt()
        } catch (e: NumberFormatException) {
            println("Error de conversión")
            return
        }

        try {
            val resultado = 100 / numero
            println("Resultado: $resultado")
        } catch (e: ArithmeticException) {
            println("Error: División por cero")
        }
    } catch (e: Exception) {
        println("Error inesperado")
    }
}
