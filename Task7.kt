// Анонимные методы или лямбда-выражения

fun main() {
    val sum = {a: Int, b: Int -> a + b}
    val square = {a: Int -> a.times(a)}
    val thirdDegree: (Int) -> Int = {it * it * it}
    val perimeter = {a: Int, b: Int -> (a + b).times(2)}
    println(perimeter(2, 6))
    val greetings: (String) -> String = {"hello, $it"}
    println(greetings("Masha"))
    val sort: (Array<Int>) -> Array<Int> = {
        for(i in it.size - 2 downTo 0) {
            for (j in 0 .. i){
                if(it[j] < it[j + 1]){
                    val temp = it[j]
                    it[j] = it[j + 1]
                    it[j + 1] = temp
                }
            }
        }
        it
    }
    println(sort(arrayOf(9, 3, 6, 2, 6)))
}

