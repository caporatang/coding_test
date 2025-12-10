package programmers

/**
 * 문자들이 담겨있는 배열 arr가 주어집니다. arr의 원소들을 순서대로 이어 붙인 문자열을 return 하는 solution함수를 작성해 주세요.
 */

fun main() {
    val list: Array<String> = listOf("1","2","3").toTypedArray()
    print(solution(list))
}
fun solution(arr: Array<String>): String {
    var answer: String = ""

    answer = arr.joinToString("")
    return answer
}