fun main() {
    loop@ for (i in 1..5) {
        for (j in 1..5) {
            if (i + j == 5) break@loop
            println("i=$i, j=$j")
        }
    }
}
