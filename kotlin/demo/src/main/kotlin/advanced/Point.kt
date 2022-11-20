package advanced

class Point (val x: Int, val y: Int, val z: Int) {
    operator fun component1() = x
    operator fun component2() = y
    operator fun component3() = z
}

fun showComponents() {
    val myPoint = Point(5000, 500, 16000)
    val (myX, myY, myZ) = myPoint
    println("myX = $myX, myY = $myY, myZ = $myZ")
}

