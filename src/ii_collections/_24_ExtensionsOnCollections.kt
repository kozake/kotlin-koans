package ii_collections

import util.TODO

fun todoTask24(): Nothing = TODO(
    """
        Task 24.
        この関数は'_24_JavaCode.doSomethingStrangeWithCollection'と同じように動作する必要があります。
        適切なコードで'todoTask24()'のすべての呼び出しを交換してください。
    """,
        references = { c: Collection<String> -> _24_JavaCode().doSomethingStrangeWithCollection(c) }
)

fun doSomethingStrangeWithCollection(collection: Collection<String>): Collection<String>? {
    val groupsByLength = collection.groupBy { s -> todoTask24() }

    return groupsByLength.values.maxBy { group -> todoTask24() }
}

