package ii_collections

fun example4() {
    val max = listOf(1, 42, 4).max()
    val longestString = listOf("a", "b").maxBy { it.length }
}

fun Shop.getCustomerWithMaximumNumberOfOrders(): Customer? {
    // 全Customerの中で一番Order数が多いCustomerを返します。
    todoCollectionTask()
}

fun Customer.getMostExpensiveOrderedProduct(): Product? {
    // Orderした中で一番高いProductを返します。
    todoCollectionTask()
}
