fun validarEdad(edad: Int) {
    if (edad < 0) throw IllegalArgumentException("La edad no puede ser negativa")
}

fun main() {
    try {
        validarEdad(-5)
    } catch (e: IllegalArgumentException) {
        println("Error: ${e.message}")
    }
}
