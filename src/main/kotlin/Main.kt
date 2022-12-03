import java.io.File

fun main(args: Array<String>) {
    val inputList = File("path").bufferedReader().readLines()
    var max = 0
    var current = 0
    inputList.forEach {
        if (it == "") {
            if (current > max) max = current
            current = 0
        } else {
            current += it.toInt()
        }
    }
    println("result: $max")
}
