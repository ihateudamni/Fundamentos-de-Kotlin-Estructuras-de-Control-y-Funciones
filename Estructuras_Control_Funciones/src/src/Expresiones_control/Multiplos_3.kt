fun main() {
    var suma = 0
    for (i in 1..10) {
        if (i % 3 == 0) continue
        suma += i
    }
    println("Suma: $suma")
}
