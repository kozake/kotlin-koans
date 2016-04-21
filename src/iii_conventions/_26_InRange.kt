package iii_conventions

import util.TODO
import util.doc26

fun todoTask26_(): Nothing = TODO(
    """
        Task 26.
        コメント行のコメントを外してください。
        Kotlinでは、'in'チェックは'contains'呼び出しへ変換されます。
        'fun contains(d: MyDate)'メソッドを'DateRange'へ追加することで、'in'による日付の範囲チェックが行えます。
        あるいは、標準のClosedRange インターフェースをDateRangeクラスに実装することで実現できます。
        全ての変更はMyDate.kt ファイルへ行ってください。
    """,
    documentation = doc26(),
    references = { range: ClosedRange<Int> -> }
)

fun checkInRange(date: MyDate, first: MyDate, last: MyDate): Boolean {
    todoTask26_()
//    return date in DateRange(first, last)
}
