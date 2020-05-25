package math

fun main() {
    val a: Int = 1  // immediate assignment
    val b = 2   // `Int` type is inferred
    val c: Int  // Type required when no initializer is provided
    c = 3       // deferred assignment
    println("a = $a, b = $b, c = $c")
    println("Sum of 3 and 5 is " + sum(3, 5))
    println("Sum of 12 and 45 is " + sum2(12, 45))
    println("Max of 456 and 23 is: " + maxOf(456, 23))

}
fun sum(a: Int, b: Int): Int {
    return a + b
}

// Function with an expression body and inferred return type:
fun sum2(a: Int, b: Int) = a + b

fun maxOf(a: Int, b: Int) = if (a > b) a else b