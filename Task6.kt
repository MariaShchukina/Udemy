
fun main(){
    println(sum("3", "6"))
}

fun sum(a: String, b: String): Int {
    return try {
        val a = a.toInt()
        val b = b.toInt()
        a.plus(b)
    } catch (e: Exception) {
        0
    }
}