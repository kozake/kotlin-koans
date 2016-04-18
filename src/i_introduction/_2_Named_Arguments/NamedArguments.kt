package i_introduction._2_Named_Arguments

import i_introduction._1_Java_To_Kotlin_Converter.task1
import util.TODO
import util.doc2

// default values for arguments:
fun bar(i: Int, s: String = "", b: Boolean = true) {}

fun usage() {
    // named arguments:
    bar(1, b = false)
}

fun todoTask2(): Nothing = TODO(
    """
        Task 2.
        ライブラリメソッドの'joinToString()'を使って、'task1'と同じロジックを再び実装してください。
        2つだけの引数を'joinToString'に指定してください。
    """,
    documentation = doc2(),
    references = { collection: Collection<Int> -> task1(collection); collection.joinToString() })

fun task2(collection: Collection<Int>): String {
    todoTask2()
    return collection.joinToString()
}
