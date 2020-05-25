fun main() {
    foo2()
}

/**
 * Any expression in Kotlin may be marked with a label.
 * Labels have the form of an identifier followed by the @ sign, for example: abc@, fooBar@ are valid labels
 */

fun loopWithBreak() {
    loop@ for (i in 1..5) {
        for (j in 1..5) {
            println("i = $i, j = $j")
            if (j == 2) break@loop
        }
    }
}

fun loopWithContinue() {
    loop@ for (i in 1..5) {
        for (j in 1..5) {
            println("i = $i, j = $j")
            if (j == 2) continue@loop
        }
    }
}
// The return-expression returns from the nearest enclosing function,
// If we need to return from a lambda expression, we have to label it and qualify the return:
fun foo() {
    listOf(1, 2, 3, 4, 5).forEach lit@{
        if (it == 3) return@lit // local return to the caller of the lambda, i.e. the forEach loop
        print(it)
    }
    print(" done with explicit label")
}

fun foo2() {
    listOf(1, 2, 3, 4, 5).forEach {
        if (it == 3) return@forEach // local return to the caller of the lambda, i.e. the forEach loop
        print(it)
    }
    print(" done with implicit label")
}
