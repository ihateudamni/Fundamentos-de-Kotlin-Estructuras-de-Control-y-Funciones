fun main() {
    val extension = "jpg"

    when (extension) {
        "jpg", "png" -> println("Imagen")
        "pdf" -> println("Documento")
        "txt" -> println("Texto plano")
        else -> println("Tipo desconocido")
    }
}
