package i_introduction._5_String_Templates

import util.TODO
import util.doc5

fun example1(a: Any, b: Any) =
        "このように、テキスト内で変数 ($a, $b) を表示できます."

fun example2(a: Any, b: Any) =
        "Javaのように書くこともできますよ。このように: " + a + ", " + b + "!"

fun example3(c: Boolean, x: Int, y: Int) = "任意の式も使用できます ${if (c) x else y}"

fun example4() =
        """
複数業のテキストを書く為にraw stringsが使用できます。
ここではエスケープ処理が必要ないので、raw stringsは正規表現パターンを記述するのに便利です。
バックスラッシュの為のバックスラッシュエスケープは必要ありません。
Stringテンプレートの代入 (${42}) もここで許可されています。
"""

fun getPattern() = """\d{2}\.\d{2}\.\d{4}"""

fun example() = "13.06.1992".matches(getPattern().toRegex()) //true

val month = "(JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC)"

fun todoTask5(): Nothing = TODO(
    """
        Task 5.
        'task5()'関数に'getPattern()'の処理をコピーし、
        'month'変数を用いて'13 JUN 1992'に一致するように書き換えてください。
    """,
    documentation = doc5(),
    references = { getPattern(); month })

fun task5(): String = todoTask5()
