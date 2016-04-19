package i_introduction._4_Lambdas

import util.TODO
import util.doc4

fun example() {

    val sum = { x: Int, y: Int -> x + y }
    val square: (Int) -> Int = { x -> x * x }

    sum(1, square(2)) == 5
}

fun todoTask4(collection: Collection<Int>): Nothing = TODO(
    """
        Task 4.
        'JavaCode4.task4()'をラムダを用いたKotlinコードに置き換えてください。
        IntelliJのIDEAのコード補完機能を使用して、'collection'を呼び出す適切な関数を見つけることができます。
        ('Iterables'クラスは使わないように)。
    """,
    documentation = doc4(),
    references = { JavaCode4().task4(collection) })

fun task4(collection: Collection<Int>): Boolean = todoTask4(collection)




