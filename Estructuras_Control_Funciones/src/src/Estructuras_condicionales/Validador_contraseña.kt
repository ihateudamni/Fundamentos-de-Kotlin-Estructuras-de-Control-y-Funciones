fun main() {
    val contrasena = "0123456789"

    if (contrasena.length < 6)
        println("Muy debil")

    else if (contrasena.length in 6..8)
        println("Debil")

    else println("Fuerte")
}
