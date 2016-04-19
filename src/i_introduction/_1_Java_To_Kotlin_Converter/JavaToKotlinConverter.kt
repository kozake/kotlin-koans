package i_introduction._1_Java_To_Kotlin_Converter

import util.TODO

fun todoTask1(collection: Collection<Int>): Nothing = TODO(
    """
        Task 1.
        JavaCode1.task1をKotlinに書き換えてください。
        IntelliJ IDEAを用いると、コピーペースとで自動的にコードがKotlinコードに置き換えることができます。
        ただし、このタスクはそれだけではありません！
    """,
    references = { JavaCode1().task1(collection) })


fun task1(collection: Collection<Int>): String {
    todoTask1(collection)
}
