package iii_conventions

import util.TODO
import util.doc25

fun todoTask25(): Nothing = TODO(
    """
        Task 25.
        コメント行のコメントを外してコンパイルしてください。
        全ての変更はMyDate.ktファイルへ行ってください。
        MyDateにComparableを実装してください。
    """,
    documentation = doc25(),
    references = { date: MyDate, comparable: Comparable<MyDate> -> }
)

fun task25(date1: MyDate, date2: MyDate): Boolean {
    todoTask25()
//    return date1 < date2
}

