import domain.Address

fun main() {
    collection()
}

/**
 * If a function does not return any useful value, its return type is Unit. Unit is a type with only one value - Unit.
 * This value does not have to be returned explicitly:
 */
fun printHello(name: String?): Unit {
    if (name != null)
        println("Hello $name")
    else
        println("Hi there!")
    // `return Unit` or `return` is optional
}

// For loop
fun testForLoop() {
    val items = listOf("a", "b", "c")
    for (item in items) {
        print(item)
    }
}

// For loop using index
fun testForLoopUsingIndex() {
    val items = listOf("one", "two", "three")
    for (index in items.indices) {
        println("item at $index  is ${items[index]}")
    }

}

// iterate over range
fun iterateOverRange() {
    for (x in 1..5) {
        print(x)
    }
    println()
    for (x in 1..10 step 2) {
        print(x)
    }
    println()
    for (x in 9 downTo 0 step 3) {
        print(x)
    }
}

// Collection
fun collection() {
    val items = setOf("red", "blue", "white", "green")
    when {
        "red" in items -> print("red is present")
    }
    println()
    val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
    fruits
        .filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.toUpperCase() }
        .forEach { println(it) }
}