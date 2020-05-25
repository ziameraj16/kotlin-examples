
fun main() {
    val rectangle = Rectangle(5.0, 2.0)
    val triangle = Triangle(2.0, 3.0, 5.0)
    println("Area of rectangle is ${rectangle.area()}, it's perimeter is ${rectangle.perimeter}")
    println("Area of triangle is ${triangle.area()}, it's perimeter is ${triangle.perimeter}")

}

abstract class Shape(val sides: List<Double>) {
    val perimeter: Double get() = sides.sum()
    abstract fun area(): Double
}

interface RectangleProperties {
    val isSquare: Boolean
}

class Rectangle(
    var length: Double,
    var width: Double
): Shape(listOf(length, width, length, width)), RectangleProperties {
    override val isSquare: Boolean get() = length == width
    override fun area(): Double = length * width
}

class Triangle(
    var sideA: Double,
    var sideB: Double,
    var sideC: Double
): Shape(listOf(sideA, sideB, sideC)) {
    override fun area(): Double {
        val s = perimeter / 2
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC))
    }
}


