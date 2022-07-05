fun main() {
    println(sort(bubbleSort(arrayOf(3, 1, 6, 1))))
}

fun onlyChar(a: String) = a.substring(0, 5)

fun sum(vararg numbers: Int): Int {
    var result = 0
    for(n in numbers){
        result += n
    }
    return result
}


fun sort(array: Array<Int>): List<Int> {
    return array.toList()
}

fun bubbleSort(array: Array<Int>): Array<Int> {
        var sorted = false
        while(!sorted){
            sorted = true
            for (i in 1 until array.size) {
                val previous = array[i - 1]
                val current = array[i]
                if (previous > current) {
                    val buffer = array[i - 1]
                    array[i - 1] = array[i]
                    array[i] = buffer
                    sorted = false
                }
        }
    }
    return array
}
