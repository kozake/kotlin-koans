package ii_collections

fun example8() {
    val numbers = listOf(1, 3, -4, 2, -11)

    // 複数の変数に割り当てる仕組みの詳細は、'Conventions'の章で説明します。
    val (positive, negative) = numbers.partition { it > 0 }

    positive == listOf(1, 3, 2)
    negative == listOf(-4, -11)
}

fun Shop.getCustomersWithMoreUndeliveredOrdersThanDelivered(): Set<Customer> {
    // deliveredよりundeliveredが多いcustomerを返します。
    todoCollectionTask()
}
