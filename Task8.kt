

fun main(){
    val listOfNames = mutableListOf("Angel", "Michel", "Arseniy", "Masha", "Arina")
    namesWhichStartedWithA(listOfNames)
    val numbers = (0..100).toList()
    val doubledNumbers = numbers.map { it * 2 }
    for(i in doubledNumbers){
        //println(i)
    }
    val employees = numbers.map {"Employee №$it"}

    val array = arrayOf(3, 5, 6)
    val sortedArray = array.sorted()
    for (i in sortedArray){
        //println(i)
    }

    val listOfNumbers = mutableListOf<Int>()
    for(i in 0 until 1000){
        listOfNumbers.add( (Math.random() * 1000).toInt() )
    }
    manipulationWithArray(listOfNumbers)


}

fun manipulationWithArray(list: MutableList<Int>): List<String> {
    val specialNumbers = list.filter({ number: Int -> number % 5 == 0 || number % 3 == 0 }).map { it * it }.sortedDescending().map { "$it" }
    for(i in specialNumbers){
        println(i)
    }
    return specialNumbers
}

fun namesWhichStartedWithA(list: MutableList<String>){
    val namesWithFirstA = list.filter{name: String -> name[0] == 'A'}
    for(i in namesWithFirstA){
           // println(i)
        }
}

fun evenNumbers() {
    val listOfNumbers = mutableListOf<Int>()
    for(i in 0..99) {
        listOfNumbers.add(i)
    }
    val listOfEvenNumbers = listOfNumbers.filter({number: Int -> number % 2 == 0 } )
    for( i in listOfEvenNumbers) {
        //println(i)
    }
}