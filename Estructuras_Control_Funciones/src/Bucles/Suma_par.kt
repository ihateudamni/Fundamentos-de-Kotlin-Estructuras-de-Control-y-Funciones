fun main() {
    var suma = 0
    for (i in 1..20) {
        if (i % 2 == 0) {
            suma += i
        }
    }
    println("Suma de pares: $suma")
}
