fun calcularPrecioTotal(
    precioBase: Double,
    impuesto: Double = 21.0,
    descuento: Double = 0.0
): Double {
    val precioConDescuento = precioBase - (precioBase * (descuento / 100))
    val precioFinal = precioConDescuento + (precioConDescuento * (impuesto / 100))
    return precioFinal
}

fun main() {
    println(calcularPrecioTotal(100.0))
    println(calcularPrecioTotal(100.0, descuento = 10.0))
    println(calcularPrecioTotal(100.0, impuesto = 10.0))
    println(calcularPrecioTotal(precioBase = 100.0, descuento = 15.0, impuesto = 18.0))
}
