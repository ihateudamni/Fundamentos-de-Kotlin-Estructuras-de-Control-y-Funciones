fun buscarAprobado(notas: List<Int>): Boolean {
    for (nota in notas) {
        if (nota > 60) return true
    }
    return false
}

fun main() {
    val notas = listOf(40, 55, 65, 30)
    println("¿Hay aprobado? ${buscarAprobado(notas)}")
}
