
fun main(){
    val number = generateSequence(1) {it + 1}
    val employees = number.take(100)
    for(employee in employees) {
        println("Сотрудник №$employee")
    }
}

fun generating() {
    val array = generateSequence(0) { it + 2 } //можно без круглых скобок
    val evenList = array.take(10)
    for(i in evenList){
        println(i)
    }
}


fun takeAndDrop() {
    val array = (0..1000).toList()
    val employees = array.map { "Employee #$it" }
    val first30 = employees.take(10) //ещё есть takeLast
    val withoutFirst30 = employees.drop(10) // dropLast
    for (employee in withoutFirst30){
        println(employee)
    }
}