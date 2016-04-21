package ii_collections

fun Shop.getCustomersWhoOrderedProduct(product: Product): Set<Customer> {
    // 指定したProductをOrderしたCustomerのSetを返します。
    todoCollectionTask()
}

fun Customer.getMostExpensiveDeliveredProduct(): Product? {
    // deliverした全てのProductの中で一番高いProductを返します。
    // (Order.isDelivered フラグを使ってください。)
    todoCollectionTask()
}

fun Shop.getNumberOfTimesProductWasOrdered(product: Product): Int {
    // 指定されたProductがorderされた回数を返します。
    // 注意：一人のcustomerが同じProductを複数Orderするかもしれません。
    todoCollectionTask()
}
