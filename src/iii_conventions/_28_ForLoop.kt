package iii_conventions

import util.TODO
import util.doc28

fun iterateOverCollection(collection: Collection<Int>) {
    for (element in collection) {}
}

fun iterateOverString() {
    // You can iterate over anything that has an 'iterator' method, member or extension.
    for (c in "abcd") {}
    "abcd".iterator() //library extension method
}

fun iterateOverRange() {
    for (i in 1..10) {}
    for (c in 'a'..'z') {}
}

fun todoTask28(): Nothing = TODO(
    """
        Task 28.
        コメント行のコメントを外してコンパイルしてください。
        全ての変更はMyDate.kt ファイルへ行ってください。
        DateRangeクラスにIterable<MyDate>を実装してください。
        オブジェクト式を使用するか、Iterator<MyDate>を実装する別のクラスを宣言することで実現できます。
        便利関数の'MyDate.nextDay()'を使用してください。
    """,
    documentation = doc28(),
    references = { date: MyDate -> DateRange(date, date.nextDay()) })


fun iterateOverDateRange(firstDate: MyDate, secondDate: MyDate, handler: (MyDate) -> Unit) {
    todoTask28()
//    for (date in firstDate..secondDate) {
//        handler(date)
//    }
}
