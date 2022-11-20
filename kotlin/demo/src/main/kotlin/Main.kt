import advanced.Position
import advanced.showComponents
import oop.Car
import oop.Person
import oop.max

fun main(args: Array<String>) {
    println("Hello World!")
    println("Program arguments: ${args.joinToString()}")

    // Type inference in action

    // val is constant
    val aSentence = "I know who you are Mr. String"
    val pi = 3.14
    //var is variable
    var aString: String
    var aDouble: Double
    var aInt: Int

    // Just like in java
    val myDouble = 1.999
    val myFloat = 1.9F
    val myLong = 123456L
    val myInt = 199
    val myShort: Short = 12
    val myByte: Byte = 127

    // User underscore in numbers for readability
    val myUnderscoreLong = 123_456L
    println(myLong == myUnderscoreLong)

    // Still explicit conversion
    val myConvertedLong: Long = myInt.toLong()

    // Control flow: if expression
    val lowest = if (myInt < 500) myInt else 500
    println("The lowest number is: $lowest")

    val temp = 80
    val isAirCoditionerOn = if (temp >= 80) {
        println("Warm day isn't it?")
        true
    } else {
        println("A bit chilly")
        false
    }
    println("Air conditioning status: $isAirCoditionerOn")

    // Control flow: when expression (switch case alike)
    val burgersOrdered = 2
    when (burgersOrdered) {
        0 -> println("Not hungry")
        1,2 -> println("Hungry")
        3 -> println("Very hungry")
        else -> {
            println("Are you sure?")
        }
    }
    when (burgersOrdered) {
        Math.abs(burgersOrdered) -> println("Correct order placed")
        else -> println("Incorrect order placed")
    }
    when (burgersOrdered) {
        0 -> println("We need order")
        in 1..4 -> println("Got some orders")
        in 5..9 -> println("Business is up")
        else -> println("Not sure")
    }
    when {
        burgersOrdered <= 0 -> println("None ordered")
        burgersOrdered % 2 == 1 -> println("Odd number ordered")
        burgersOrdered % 2 == 0 -> println("Even number ordered")
    }

    // Control flow: loops
    var x = 0
    while (x < 10) {
        print("$x, ")
        x += 2
    }
    do {
        print("$x, ")
        x -= 3
    } while (x > 0)
    println()
    for (item in 1..10) {
        print("$item, ")
    }
    println()
    for (ch in "biscuit") {
        print("$ch ")
    }
    println()
    var ndx = 0
    for (item in 10.rangeTo(20).step(2)) {
        print("${++ndx} $item, ")
    }
    println()
    for ((index, item) in 10.rangeTo(20).step(2).withIndex()) {
        print("${index+1} $item, ")
    }
    val myArray = arrayOf(10, 20, 30 ,40 ,50)
    for (item in myArray.indices) {
        println("At index $item is ${myArray[item]}")
    }

    // Functions
    println("10 + 20 = ${myFunction1(10, 20)}")
    myDefaults(10, 20)
    myDefaults(10, 20, "Hello")
    myDefaults(message = "Greetings")

    // Classes
    val me = Person("Łukasz", "Widawski")
    val you = Person("Agnieszka", "Widawska", "Gus")

    // Objects
    val location = object {
        var xPosition = 200
        var yPosition = 400
        fun printIt() {
            println("Position = ($xPosition, $yPosition)")
        }
    }
    location.printIt()
    location.xPosition = 3000
    location.yPosition = 5000
    location.printIt()

    val temperature = MySingleton.getLastTemperature()
    println("Last reading = $temperature degrees")

    // Interfaces
    val myCar = Car()
    myCar.go()
    println("My car's make = ${myCar.makeName}")

    // Generics
    val maxInt: Int = max(42, 99)
    val maxLong: Long = max(4212451512L, 99135149791L)
    val maxByte: Byte = max((-128).toByte(), (127).toByte())
    val maxString: String = max("Alpha", "Gama")

    println("The max Int: $maxInt")
    println("The max Long: $maxLong")
    println("The max Byte: $maxByte")
    println("The max String: $maxString")

    // Java interoperability
    JavaInterop()

    // Operators overloading
    userOverload()

    // Reflection
    val Joe = Person("Joe", "Smith")
    val kClass = Joe.javaClass.kotlin
    println("Simple name = ${kClass.simpleName}")

    for(name in kClass.members) {
        println("Person property name: ${name.name}")
    }

    // Destructuring
    val pos = Position(100, 200)
    val (xPosition, yPosition) = pos
    println("Destructured x = $xPosition and y = $yPosition")
    println("Component 1 = ${pos.component1()}")

    showComponents()

}

fun myFunction(param1: Int, param2: Int): Int {
    return param1 + param2
}

fun myFunction1(param1: Int, param2: Int) = param1 + param2

fun myDefaults(param1: Int = 1 , param2: Int = 5, message: String = "Hi"): Int {
    val result = param1 + param2
    println(message)
    return result
}

fun JavaInterop() {
    val Frisky = Animal("Frisky", "cat", 3)
    println(Frisky.show())
    val Fido = Animal("Fido", "dog", 10)
    println(Fido.show())

    Frisky.weight = 4
    println(Frisky.show())
}

fun userOverload() {
    val p1 = Position(200, 100)
    val p2 = Position(1000, 2000)
    val p3 = p1 + p2
    println("Overloaded sum of positions = ${p3.toString()}")
}

object MySingleton {
    var temperatures = arrayOf(15, 20, 25)
    fun getLastTemperature() = temperatures.last()
}