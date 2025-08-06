fun main() {
    val rol = "moderador"

    when (rol) {
        "admin", "Admin" ->
            println("Permisos: Total")

        "moderador", "Moderador" ->
            println("Permisos: Moderar contenido")

        "usuario", "Usuario" ->
            println("Permisos: Acceso básico")

        "invitado", "Invitado" ->
            println("Permisos: Solo lectura")

        else -> println("Rol desconocido")
    }
}
