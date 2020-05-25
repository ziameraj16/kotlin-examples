fun main() {
    val x = null           // 'x' has type `Nothing?`
    val l = listOf(null)   // 'l' has type `List<Nothing?>
    fail("ERROR!!")
}

fun fail(msg: String): Nothing {
    throw IllegalAccessError(msg)

}
