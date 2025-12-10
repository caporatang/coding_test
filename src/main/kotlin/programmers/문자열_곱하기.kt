package programmers

fun main() {
    println(solution("string", 3))
}

private fun solution(my_string: String, k: Int): String {
    return my_string.repeat(k)
}