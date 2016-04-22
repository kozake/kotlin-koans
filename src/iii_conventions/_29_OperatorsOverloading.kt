package iii_conventions

import util.TODO

fun todoTask29(): Nothing = TODO(
    """
        Task 29.
        日付計算を実装します。日付に年、月、週と日をサポートします。
        MyDateとTimeIntervalクラスを使用してください。
        便利関数であるMyDate.addTimeIntervalsを使用してください。
        コメント行のコメントを外してコンパイルしてください。

        (1). MyDateへ引数としてTimeIntervalを取る'plus()'拡張関数を追加してください。
        (2). dateにTimeIntervalの足し算をサポートします。他のクラス追加が必要です。
        何か問題がある場合は、iii_conventions/_29_Tips.ktファイルを参照してください。
    """,
    references = { date: MyDate, timeInterval: TimeInterval ->
        date.addTimeIntervals(timeInterval, 1)
    })

fun task29_1(today: MyDate): MyDate {
    todoTask29()
//    return today + YEAR + WEEK
}

fun task29_2(today: MyDate): MyDate {
    todoTask29()
//    return today + YEAR * 2 + WEEK * 3 + DAY * 5
}

