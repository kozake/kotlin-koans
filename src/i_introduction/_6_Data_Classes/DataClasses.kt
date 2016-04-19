package i_introduction._6_Data_Classes

import util.TODO
import util.doc6

fun todoTask6(): Nothing = TODO(
    """
        'JavaCode6.Person' クラスをKotlinで書き換えてください。
        そして、そのクラスにdataを追加してください。
        このアノーテーションは、コンパイルすると`equals`/`hashCode`, `toString`などの
        有用なメソッド群を生成します。
        `task6`の関数はPersonのリストを返します。
    """,
    documentation = doc6(),
    references = { JavaCode6.Person("Alice", 29) }
)

class Person

fun task6(): List<Person> {
    todoTask6()
    return listOf(/*Person("Alice", 29), Person("Bob", 31)*/)
}

