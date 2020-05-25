// Kotlin uses == for structural comparison and === for referential comparison
fun main() {
    val authors = setOf("Mohammad", "Meraj", "Zia")
    val writers = setOf("Meraj", "Zia", "Mohammad")

    println(authors == writers)   // Returns true because it calls authors.equals(writers) and sets ignore element order.
    println(authors === writers)  // Returns false because authors and writers are distinct references.
}
