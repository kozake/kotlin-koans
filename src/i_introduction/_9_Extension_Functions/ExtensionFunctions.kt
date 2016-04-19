package i_introduction._9_Extension_Functions

import util.TODO
import util.doc9

fun String.lastChar() = this.get(this.length - 1)

// 'this' は省略できます。
fun String.lastChar1() = get(length - 1)

fun use() {
    // try Ctrl+Space "default completion" after the dot: lastChar() is visible
    "abc".lastChar()
}

// 'lastChar' ExtensionFunctionsKtクラスのstataic関数としてコンパイルされます。
// (JavaCode9.useExtensionを参照)

fun todoTask9(): Nothing = TODO(
    """
        Task 9.
        extension関数でInt.r(), Pair<Int, Int>.r()を実装してください。
        これらは以下の呼び出しで分数の生成をサポートします。
        1.r(), Pair(1, 2).r()
    """,
    documentation = doc9(),
    references = { 1.r(); Pair(1, 2).r(); RationalNumber(1, 9) })

data class RationalNumber(val numerator: Int, val denominator: Int)

fun Int.r(): RationalNumber = todoTask9()
fun Pair<Int, Int>.r(): RationalNumber = todoTask9()


