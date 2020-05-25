package functional

fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return operation(x, y)
}

fun sum(x: Int, y: Int) = x + y

fun main() {
    // Invokes the higher-order function passing in two integer values and the function argument ::sum.
    // :: is the notation that references a function by name in Kotlin.
    val sumResult = calculate(4, 5, ::sum)
    val multiplicationResult = calculate(4, 5) {a, b -> a * b}
    println("sum result: $sumResult, multiplication result: $multiplicationResult")
}