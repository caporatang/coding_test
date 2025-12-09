import java.io.*
import java.util.StringTokenizer

class FastReader {
    private var br: BufferedReader
    private var st: StringTokenizer? = null
    constructor() {
        br = BufferedReader(InputStreamReader(System.`in`))
    }
    constructor(path: String) {
        br = try {
            BufferedReader(FileReader(File(path)))
        } catch (e: FileNotFoundException) {
            throw RuntimeException(e)
        }
    }
    fun next(): String {
        while (st == null || !st!!.hasMoreElements()) {
            val line = br.readLine() ?: return ""
            st = StringTokenizer(line)
        }
        return st!!.nextToken()
    }

    fun nextInt(): Int = next().toInt()

    fun nextLong(): Long = next().toLong()

    fun nextDouble(): Double = next().toDouble()

    fun nextLine(): String {
        return br.readLine() ?: ""
    }
}

// 사용 예시:
// fun main() {
//     val sc = FastReader()
//     val n = sc.nextInt()
//     val m = sc.nextLong()
//     val str = sc.nextLine()
// }

