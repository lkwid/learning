package functional

data class Student(val name: String, var age: Int)

fun getStudents(): List<Student> {
    return listOf(
        Student("Ginger", 19),
        Student("Michael", 23),
        Student("Maria", 20),
        Student("Joe", 39),
        Student("Bob", 16)
    )
}

fun main(args: Array<String>) {
    val students = getStudents()
    val combos = students.map{s -> "${s.name} : ${s.age}"}
    println("Combos: $combos")
    println("The oldest student: ${students.maxBy{ it.age }}")

    val studentsWithLongNames = students.filter { it.name.length > 5 }
    println("Long names: $studentsWithLongNames")
}