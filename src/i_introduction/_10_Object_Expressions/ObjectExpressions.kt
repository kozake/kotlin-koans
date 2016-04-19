package i_introduction._10_Object_Expressions

import util.TODO
import util.doc10
import java.util.*

fun todoTask10(): Nothing = TODO(
    """
        Task 10.
        KotlinでJavaの匿名クラスと同じ役割を果たしているオブジェクト式について説明します。
        オブジェクト式を追加して、java.util.Collections クラスを用いて降順ソートする為のcomparatorを提供してください。
        Kotlinでは、java.util.Collectionsの代わりにKotlinの拡張ライブラリを使用できます。
        しかし、この例題はKotlinとJavaのコードを混合する良いデモです。
    """,
    documentation = doc10()
)

fun task10(): List<Int> {
    val arrayList = arrayListOf(1, 5, 2)
    Collections.sort(arrayList, todoTask10())
    return arrayList
}