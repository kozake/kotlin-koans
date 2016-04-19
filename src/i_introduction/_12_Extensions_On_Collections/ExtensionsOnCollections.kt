package i_introduction._12_Extensions_On_Collections

import util.TODO
import util.doc12

fun todoTask12(): Nothing = TODO(
    """
        Task 12.
        Kotlin標準ライブラリにはコレクション操作をより便利にする拡張機能がたくさんあります。
        拡張機能を使用して、もう一度前の例を'sortedDescending'拡張関数を用いて書き直してください。

        Kotlinコードは簡単にJavaコードと混合できます。
        したがって、Kotlinでは独自のコレクションを導入していません。標準のJavaのものを使用しています（若干改善）。

        Javaコレクションによる「read-only and mutable views」について読んでください。
    """,
    documentation = doc12()
)

fun task12(): List<Int> {
    todoTask12()
    return arrayListOf(1, 5, 2)
}

