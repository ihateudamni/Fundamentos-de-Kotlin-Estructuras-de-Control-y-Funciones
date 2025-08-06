fun main() {
    val numeros = arrayOf(1, 2, 3)
    var producto = 1
    for (num in numeros) {
        producto *= num
    }
    println("Producto total: $producto")
}
