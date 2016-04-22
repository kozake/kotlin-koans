package iv_properties

import util.TODO
import util.doc34

class LazyPropertyUsingDelegates(val initializer: () -> Int) {
    val lazyValue: Int by todoTask34()
}

fun todoTask34(): Lazy<Int> = TODO(
    """
        Task 34.
        delegated propertiesの記事を読んだ後、delegatesを使って怠惰なプロパティを作ってください。
    """,
    documentation = doc34()
)
