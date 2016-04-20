package ii_collections

fun example9() {
    val result = listOf(1, 2, 3, 4).fold(1, { partResult, element -> element * partResult })
    result == 24
}

// 以下と同じ
fun whatFoldDoes(): Int {
    var result = 1
    listOf(1, 2, 3, 4).forEach { element -> result = element * result}
    return result
}

fun Shop.getSetOfProductsOrderedByEveryCustomer(): Set<Product> {
    // 全customerにOrderされたProductsのSetを返します。
    return customers.fold(allOrderedProducts, {
        orderedByAll, customer ->
        todoCollectionTask()
    })
}
