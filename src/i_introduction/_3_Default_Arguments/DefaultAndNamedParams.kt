package i_introduction._3_Default_Arguments

import util.TODO
import util.doc2

fun todoTask3(): Nothing = TODO(
    """
        Task 3.
        いくつかにオーバーロードされた'JavaCode3.foo()'はKotlinでは1つの関数に置き換えることができます。
        コンパイル'foo'を使用してコードを作る方法で関数 'foo'での宣言を変更します。
        'foo'関数の定義を変更し、コンパイルしてください。
        パラメータを追加して、'todoTask3()'の処理を置き換えてください。
        コードのコメントを外してコンパイルしてください。
    """,
    documentation = doc2(),
    references = { name: String -> JavaCode3().foo(name); foo(name) })

fun foo(name: String): String = todoTask3()

fun task3(): String {
    todoTask3()
//    return (foo("a") +
//            foo("b", number = 1) +
//            foo("c", toUpperCase = true) +
//            foo(name = "d", number = 2, toUpperCase = true))
}
