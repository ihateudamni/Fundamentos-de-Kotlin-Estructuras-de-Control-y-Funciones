fun main() {
    val pinCorrecto = "1234"
    var intentos = 0

    do {
        println("Ingrese su PIN:")
        val pinIngresado = readLine() ?: ""
        intentos++
        if (pinIngresado == pinCorrecto) {
            println("Acceso permitido")
            return
        }
    } while (intentos < 3)

    println("Acceso denegado")
}
