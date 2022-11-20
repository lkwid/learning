// 06_06_start challenge
package _exercises


data class Cubic(val p1: Int, val p2: Int, val p3: Int) {

    operator fun plus(otherCubic: Cubic): Cubic {
        return Cubic(p1 + otherCubic.p1, p2 + otherCubic.p2, p3 + otherCubic.p3)
    }
     operator fun minus(otherCubic: Cubic): Cubic {
         return Cubic(p1 - otherCubic.p1, p2 - otherCubic.p2, p3 - otherCubic.p3)
     }

}

fun main(args: Array<String>) {
    println("operator")

    val pt1 = Cubic(100, 200, 300)
    val pt2 = Cubic(10, 20, 30)

    println("pt1 = $pt1")
    println("pt2 = $pt2")
    println("pt1 + pt2 = ${pt1 + pt2}")
    println("pt1 - pt2 = ${pt1 - pt2}")
}
