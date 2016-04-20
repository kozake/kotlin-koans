package ii_collections

fun example1(list: List<Int>) {

    // ラムダが一つのパラメータのみ持つ場合、そのパラメータに'it'でアクセスできます。
    val positiveNumbers = list.filter { it > 0 }

    val squares = list.map { it * it }
}

fun Shop.getCitiesCustomersAreFrom(): Set<City> {
    // CustomerのCityのSetを返します。
    todoCollectionTask()
}

fun Shop.getCustomersFrom(city: City): List<Customer> {
    // 指定されたCityに住んでいるCustomerのListを返します。
    todoCollectionTask()
}


