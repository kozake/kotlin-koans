package ii_collections

fun example1(list: List<Int>) {

    // ラムダが一つのパラメータのみ持つ場合、そのパラメータに'it'でアクセスできます。
    val positiveNumbers = list.filter { it > 0 }

    val squares = list.map { it * it }
}

fun Shop.getCitiesCustomersAreFrom(): Set<City> {
    // 顧客の街のSetを返します。
    todoCollectionTask()
}

fun Shop.getCustomersFrom(city: City): List<Customer> {
    // 指定された街に住んでいる顧客のListを返します。
    todoCollectionTask()
}


