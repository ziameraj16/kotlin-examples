// Member functions and extensions with a single parameter can be turned into infix functions
fun main() {
    infix fun Int.times(str: String) = str.repeat(this)
    println((3 times "Zia ").trim())

    // Creates a Pair by calling the infix function to from the standard library
    val pair = "Sarah" to "Meraj"
    println(pair)

    // Here's your own implementation of to creatively called onto
    infix fun String.onto(other: String) = Pair(this, other)
    val pair2 = "Harry" onto "Potter"
    println(pair2)

    val tim = Person("tim")
    val dougal = Person("dougal")
    tim likes dougal
}

class Person(val name: String) {
    val likedPeople = mutableListOf<Person>()
    infix fun likes (other: Person) {likedPeople.add(other)}
}