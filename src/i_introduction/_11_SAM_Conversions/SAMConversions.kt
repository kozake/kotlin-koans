package i_introduction._11_SAM_Conversions

import util.TODO
import util.doc11
import java.util.*

fun todoTask11(): Nothing = TODO(
    """
        Task 11.
        SAMインターフェース (Single Abstract Method)のオブジェクトを実装するとき、代わりにラムダ式を使う事が出来ます。
        KotlinでのSAM変換についての詳細はブログ記事を読んでください。

        以下の例題をラムダによるオブジェクト式に変更してください。
    """,
    documentation = doc11()
)

fun task11(): List<Int> {
    val arrayList = arrayListOf(1, 5, 2)
    Collections.sort(arrayList, { x, y -> todoTask11() })
    return arrayList
}
