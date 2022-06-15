
fun main() {
    val name1 = "Seva"
    val name2 = "Masha"
    val name3= null
    counting(name1, name2, name3)
}

fun counting(name1: String?, name2: String?, name3: String?) {
    val length1 = name1?.length?:0
    val length2 = name2?.length?:0
    val length3 = name3?.length?:0
    val fullLength = length1 + length2 + length3
    println(fullLength)
}