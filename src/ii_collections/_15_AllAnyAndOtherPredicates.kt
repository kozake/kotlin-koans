package ii_collections

fun example2(list: List<Int>) {

    val isZero: (Int) -> Boolean = { it == 0 }

    val hasZero: Boolean = list.any(isZero)

    val allZeros: Boolean = list.all(isZero)

    val numberOfZeros: Int = list.count(isZero)

    val firstPositiveNumber: Int? = list.firstOrNull { it > 0 }
}

fun Customer.isFrom(city: City): Boolean {
    // Customerが指定されたCity出身かどうかを返します。
    todoCollectionTask()
}

fun Shop.checkAllCustomersAreFrom(city: City): Boolean {
    // 全てのCustomerが指定されたCity出身かどうかを返します。
    todoCollectionTask()
}

fun Shop.hasCustomerFrom(city: City): Boolean {
    // 指定されたCity出身のCustomerがいるかどうかを返します。
    todoCollectionTask()
}

fun Shop.countCustomersFrom(city: City): Int {
    // 指定されたCity出身のCustomerの数を返します。
    todoCollectionTask()
}

fun Shop.findAnyCustomerFrom(city: City): Customer? {
    // 指定されたCity出身のCustomerの一人を返します。見つからない場合はnullを返します。
    todoCollectionTask()
}
