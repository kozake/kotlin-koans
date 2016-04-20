package ii_collections

fun example() {

    val result = listOf("abc", "12").flatMap { it.toList() }

    result == listOf('a', 'b', 'c', '1', '2')
}

val Customer.orderedProducts: Set<Product> get() {
    // CustomerがOrderした全てのProductを返します。
    todoCollectionTask()
}

val Shop.allOrderedProducts: Set<Product> get() {
    // 少なくとも一人のCustomerからOrderされたProductを返します。
    todoCollectionTask()
}
