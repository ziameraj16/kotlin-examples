fun printMessage(message: String): Unit {
    println(message)
}

fun printMessageWithDefault(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

fun sum(x: Int, y:Int): Int {
    return x + y
}

fun multiply(x: Int, y: Int) = x * y

fun printAll(vararg msg: String) {
    for(m in msg) println(m)
}

fun main() {
    printMessage("Hello!!")
    printMessageWithDefault("Hello", "Log")
    printMessageWithDefault("Hello")
    printMessageWithDefault(prefix = "Log", message = "Hello")
    printAll("Hello,", "Good", "Morning", "你好")
}