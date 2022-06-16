fun main() {
    val time = 19
    val weatherNice = false
    when {
        time in 11..22 && weatherNice -> println("гулять")
        time in 11..22 && !weatherNice -> println("читать")
        else -> println("спать")
    }
}