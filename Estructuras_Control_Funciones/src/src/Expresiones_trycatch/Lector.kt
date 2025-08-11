import java.io.File
import java.io.FileNotFoundException

fun main() {
    try {
        val archivo = File("inexistente.txt")
        val contenido = archivo.readText()
        println(contenido)
    } catch (e: FileNotFoundException) {
        println("Archivo no encontrado")
    }
}
