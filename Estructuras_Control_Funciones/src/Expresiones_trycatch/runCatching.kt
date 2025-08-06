fun main() {
    val texto = "123a"
    val resultado = runCatching { texto.toInt() }
        .onSuccess { println("Número: $it") }
        .onFailure { println("Error: ${it.message}") }
}
