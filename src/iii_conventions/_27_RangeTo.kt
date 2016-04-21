package iii_conventions

import util.TODO
import util.doc26

fun todoTask27(): Nothing = TODO(
    """
        Task 27.
        コメント行のコメントを外してコンパイルしてください。
        '..'は、DateRangeを返す'MyDate.rangeTo()'拡張関数として作成します。
        全ての変更はMyDate.kt ファイルへ行ってください。
    """,
    documentation = doc26()
)

fun checkInRange2(date: MyDate, first: MyDate, last: MyDate): Boolean {
    todoTask27()
//    return date in first..last
}
