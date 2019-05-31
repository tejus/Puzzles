package puzzles

fun incrementalRanges(n: Int): Sequence<Int> {
    var start = 1
    var end = n
    return sequence {
        while (true) {
            yieldAll((start++)..(end++))
        }
    }
}

//https://codegolf.stackexchange.com/questions/186233/incremental-ranges
fun incrementalRanges2(x: Int, n: Int): List<Int> {
    return (0 until x).map { it / n + it % n + 1 }
}

fun main() {
    println(incrementalRanges(1).take(49).toList())
    println(incrementalRanges(2).take(100).toList())
    println(incrementalRanges(3).take(13).toList())
    println(incrementalRanges2(49, 1))
    println(incrementalRanges2(100, 2))
    println(incrementalRanges2(13, 3))
}
