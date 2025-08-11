fun main() {
    loop@ for (i in 1..3) {
        for (j in 1..3) {
            if (i == j) continue@loop
            println("i=$i, j=$j")
        }
    }
}
