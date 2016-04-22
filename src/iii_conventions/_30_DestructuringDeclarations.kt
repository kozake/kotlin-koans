package iii_conventions.multiAssignemnt

import util.TODO
import util.doc30

fun todoTask30(): Nothing = TODO(
    """
        Task 30.
        destructuring declarations の記事を読み、一つのワードを追加することで、(コメントを外したのち）以下のコードをコンパイルしなさい。
    """,
    documentation = doc30()
)

class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

fun isLeapDay(date: MyDate): Boolean {
    todoTask30()
//    val (year, month, dayOfMonth) = date
//
//    // 29 February of a leap year
//    return year % 4 == 0 && month == 2 && dayOfMonth == 29
}