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

fun main() {
    println(incrementalRanges(1).take(49).toList())
    println(incrementalRanges(2).take(100).toList())
    println(incrementalRanges(3).take(13).toList())
}
