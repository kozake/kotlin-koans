package iv_properties

import util.TODO
import util.doc32

class PropertyExample() {
    var counter = 0
    var propertyWithCounter: Int? = todoTask32()
}

fun todoTask32(): Nothing = TODO(
    """
        Task 32.
        カスタムsetterをPropertyExample.propertyWithCounterへ追加してください。
        'counter'がpropertyWithCounterへ代入する度にカウントされます。
    """,
    documentation = doc32(),
    references = { PropertyExample() }
)
