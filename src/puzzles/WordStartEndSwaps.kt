package puzzles

//https://codegolf.stackexchange.com/questions/185674/pwas-eht-tirsf-dna-tasl-setterl-fo-hace-dorw
fun swap(w: String): String {
    return w.split(" ")
        .map { it.last() + if (it.length > 1) it.substring(1, it.length - 1) + it.first() else "" }
        .joinToString(" ")
}

fun main() {
    println(swap("Test Message"))
    println(swap("swap the first and last letters of each word"))
    println(swap("hello world"))
    println(swap("test cases"))
    println(swap("programming puzzles and code golf"))
    println(swap("in a green meadow"))
    println(swap("yay racecar"))
    println(swap("z"))
}
