package specialclasses

data class User(val id: Int, val name: String) // Defines a data class with the data modifier

fun main() {
    val abc = User(1, "ABC")
    println(abc) // Method toString is auto-generated, which makes println output look nice

    val abc_2 = User(1, "ABC")
    val xyc = User(2, "ABC")

    println("abc == abc_2: ${abc == abc_2}")   // Auto-generated equals considers two instances equal if all their properties are equal.
    println("abc == xyc: ${abc == xyc}")


    println(abc.hashCode()) // Equal data class instances have equal hashCode().
    println(abc_2.hashCode())
    println(xyc.hashCode())

    // copy() function
    println(abc.copy()) // Auto-generated copy function makes it easy to create a new instance.
    println(abc.copy(name = "ABC")) // When copying, you can change values of certain properties. copy accepts arguments in the same order as the class constructor.
    println(abc.copy(2)) // Use copy with named arguments to change the value despite of the properties order.

    println("name = ${abc.component1()}") // Auto-generated componentN functions let you get the values of properties in the order of declaration.
    println("id = ${abc.component2()}")

}