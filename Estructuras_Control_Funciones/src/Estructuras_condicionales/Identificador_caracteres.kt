fun main() {
    val caracter = '1'

    if (caracter in listOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')) {
        println("Vocal")
    } else {
        println("No es una vocal")
    }
}
