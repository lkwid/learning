package oop

@Deprecated("Just testing Kotlin's annotations.", ReplaceWith("Animal"))
class Person internal constructor(var firstName: String, var lastName: String){
    init {
        println("Creating a person named $firstName $lastName")
    }

    constructor(firstName: String, lastName: String, middleName: String):this(firstName, lastName) {
                println("Creating a person named $firstName $lastName $middleName")
            }
}