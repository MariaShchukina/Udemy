fun main() {
    println(volume("2", "3"))
}

fun volume(firstSide: String = "1", secondSide: String = "", thirdSide: String = "") = if(secondSide.isEmpty()) firstSide.toInt() * firstSide.toInt() * firstSide.toInt() else if(thirdSide.isEmpty()) firstSide.toInt() * firstSide.toInt() * secondSide.toInt() else firstSide.toInt() * secondSide.toInt() * thirdSide.toInt()
