fun main() {
    try {
        val a = 10
        val b = 0
        val resultado = a / b
        println("Resultado: $resultado")
    } catch (e: ArithmeticException) {
        println("No se puede dividir por cero")
    }
}
