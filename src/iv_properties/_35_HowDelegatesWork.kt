package iv_properties

import iii_conventions.MyDate
import util.TODO
import java.util.*
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

fun todoTask35(): Nothing = TODO(
    """
        Task 35.
        delegate式は'get'と'set'のメソッドを持つ必要があります。
        以下の記述にそれをみることができます。（ReadWriteProperty'インターフェースのメンバーとして）

        'EffectiveDate'クラスのメンバをそれに委譲するよう実装します。
        'timeInMillis'プロパティでミリ秒のみ保持してください。
        'MyDate.toMillis'と'Long.ToDate'の拡張関数を使ってください。
    """,
    references = { date: MyDate -> date.toMillis().toDate()}
)

class D {
    var date by EffectiveDate()
    // The property date$delegate of type EffectiveDate is created;
    // the generated 'get' and 'set' accessors for 'date' are delegated to it.
    // Browse the Kotlin tool window in IntelliJ IDEA for details.
}

class EffectiveDate<R> : ReadWriteProperty<R, MyDate> {
    var timeInMillis: Long? = null

    operator override fun getValue(thisRef: R, property: KProperty<*>): MyDate = todoTask35()
    operator override fun setValue(thisRef: R, property: KProperty<*>, value: MyDate) = todoTask35()
}

fun MyDate.toMillis(): Long {
    val c = Calendar.getInstance()
    c.set(year, month, dayOfMonth)
    return c.timeInMillis
}

fun Long.toDate(): MyDate {
    val c = Calendar.getInstance()
    c.timeInMillis = this
    return MyDate(c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DATE))
}
