package _exercises

fun main(args: Array<String>) {
    for (i in 1..105) {
        when(0) {
            i.mod(3) + i.mod(5) -> println("$i fizz buzz")
            i.mod(3) -> println("$i fizz")
            i.mod(5) -> println("$i buzz")
            else -> println(i)
        }
    }
}