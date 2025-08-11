fun main() {
    val estudiantes = mapOf("Ana" to 85, "Luis" to 45, "María" to 72)

    for ((nombre, nota) in estudiantes) {
        if (nota >= 50)
            println("$nombre: Aprobado")

        else println("$nombre: Reprobado")
    }
}
