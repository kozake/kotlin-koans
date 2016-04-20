package ii_collections

import java.util.*

/*
 * This part of workshop was inspired by:
 * https://github.com/goldmansachs/gs-collections-kata
 */

/*
 * 'to'で始まる1つのコレクションを別のコレクションに変換する多くの操作が提供されています。
 */
fun example0(list: List<Int>) {
    list.toSet()

    val set = HashSet<Int>()
    list.to(set)
}

fun Shop.getSetOfCustomers(): Set<Customer> {
    // このShopの全Customerを含むSetを返します。
    todoCollectionTask()
//    return this.customers
}

