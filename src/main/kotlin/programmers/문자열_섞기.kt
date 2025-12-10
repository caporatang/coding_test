package programmers

/**
 * 길이가 같은 두 문자열 str1과 str2가 주어집니다.
 * 두 문자열의 각 문자가 앞에서부터 서로 번갈아가면서 한 번씩 등장하는 문자열을 만들어 return 하는 solution 함수를 완성해 주세요.
 */

fun main() {
    println(solution("aaaaa", "bbbbb"))
}

private fun solution(str1: String, str2: String): String {
    var answer: String = ""
    for (i in str1.indices) {
        answer += str1[i]
        answer += str2[i]
    }
    return answer
}