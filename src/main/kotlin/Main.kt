fun main(args: Array<String>) {

    println("Hello from Kotlin")

    var value: Int = 5
    var sum: Double = 10.5
    var text: String = "Hello kotlin"

    if (value > 5) {
        println(">5")
    }

    when (value) {
        in 1.. 4 -> {

        }
        5 -> {
            println(">5555")
        }
        10 -> {

        }
        else -> {

        }
    }
}