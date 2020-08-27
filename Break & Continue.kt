fun main() {
    loop@ for (i in 1..20) {
        println("Outside Loop")

        for (j in 1..20) {
            println("Inside Loop")
            if (j > 10) break@loop
        }
    }
}