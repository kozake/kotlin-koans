package iii_conventions

import util.TODO


class Invokable

fun todoTask31(): Nothing = TODO(
    """
        Task 31.
        Invokableクラスを変更して実行された回数(丸括弧の回数）を返すようにしてください。
        コードのコメントを外してください。4が返るはずです。
    """,
    references = { invokable: Invokable -> })

fun task31(invokable: Invokable): Int {
    todoTask31()
//    return invokable()()()().getNumberOfInvocations()
}
