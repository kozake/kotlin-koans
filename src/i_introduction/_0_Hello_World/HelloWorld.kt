package i_introduction._0_Hello_World

import util.TODO
import util.doc0

fun todoTask0(): Nothing = TODO(
    """
        導入:

        ワークショップでは、問題に応じて正しいコードに本文を置き換えることで'taskN'の機能を変更します。
        'todoTaskN()'は例外を投げますので、意味のあるコードに置き換えてください。

        'documentation' argumentを使うと、Kotlinオンラインドキュメントの関連部分を参照できます。
        'doc0()'の上にカーソルをもってきてm'F1'キーを押しください。"See also" にリンクがあります。

        'references'を使用すると、タスクの説明に言及されたコードを見れます。

        では、始めましょう！'task0'が "OK"を返すようにしてください。
    """,
    documentation = doc0(),
    references = { task0(); "OK" }
)

fun task0(): String {
    return todoTask0()
}


