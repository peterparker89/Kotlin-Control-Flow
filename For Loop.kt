fun main() {
    val ranges = 1.rangeTo(50) step 5
    ranges.forEachIndexed { index, _ ->
        println("index $index")
    }
}