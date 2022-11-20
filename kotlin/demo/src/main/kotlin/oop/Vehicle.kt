package oop

interface Vehicle {
    val makeName: String
    fun go() {
        println("Vroom, vroom")
    }

    fun stop() {
        println("Screehing")
    }

    fun getKph(): Int {
        return 50
    }

    fun getDoors(): Int

}