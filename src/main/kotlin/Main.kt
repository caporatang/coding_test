import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val arr = IntArray(9)
    for (i in 0 until 9) {
        arr[i] = br.readLine()?.toInt() ?: 0
    }

    var order = 1
    var max = arr[0]
    for (i in arr.indices) {
        if (max < arr[i]) {
            max = arr[i]
            order = i + 1
        }
    }
    val sb = StringBuilder()
    println(sb.append(max).append("\n").append(order))
}

