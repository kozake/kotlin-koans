package iv_properties

import util.TODO

class LazyProperty(val initializer: () -> Int) {
    val lazy: Int = todoTask33()
}

fun todoTask33(): Nothing = TODO(
    """
        Task 33.
        カスタムgetterを追加し、'lazy'を怠惰な値にしてください。
        最初のアクセス時に'initializer()'の実行で値は初期化してください。
        必要に応じて、いくつかのプロパティを追加することができます。
        delegated propertiesは使用しない事！
    """,
    references = { LazyProperty({ 42 }).lazy }
)
