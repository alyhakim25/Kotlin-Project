class Collection {

}
fun main(){
    //map()
    val capital = mapOf(
        "Jakarta" to "Indonesia",
        "London" to "England",
        "New Delhi" to "India"
    )
    println(capital["Jakarta"])

    //sum()
    val num : IntArray = intArrayOf(1,2,3,4)

    println("sum = ${num.sum()}")

    //sorted()
    val numberList = listOf(3, 7, 8, 9, 4, 5, 1, 2, 6, 10)
    val ascendingSort = numberList.sorted()

    println(ascendingSort)
    //fold()
    // used to readd all collection from left
    val numbers = listOf(1, 2, 3)
    var value = 0;

    val fold1 = numbers.fold(10) { current, item ->
        println("current $current")
        println("item $item")
        value += item + current
        println()
        current + item
    }
    println(value)
    println("Fold result: $fold1")

    //rightfold
    // used to read all collection from right
    val fold2 = numbers.foldRight(10) { item, current ->
        println("current $current")
        println("item $item")
        println()
        item + current
    }

    println("Fold result: $fold2")

    //drop
    // used to delete some collection
    val number = listOf(1, 2, 3, 4, 5, 6)
    val drop = number.drop(3)
    val drop2 = number.dropLast(2)
    println(drop)
    println(drop2)

    //Take
    // Used to take some collection
    val total = listOf(1, 2, 3, 4, 5, 6)
    val take = total.take(3)

    println(take)

    //slice
    // Used to take some collection with specific position
    val total3 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val slice1 = total3.slice(3..6 step 2)

    println(slice1)

    val index = listOf(2, 3, 5, 8)
    val total4 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val slice2 = total4.slice(index)

    println(slice2)

    //Distinct
    //Used to filter item in the collection with ignoring same value
    val total5 = listOf(1, 2, 1, 3, 4, 5, 2, 3, 4, 5)
    val distinct = total5.distinct()

    println(distinct)

    val items = listOf(
        Item("1", "Kotlin"),
        Item("2", "is"),
        Item("3", "Awesome"),
        Item("3", "as"),
        Item("3", "Programming"),
        Item("3", "Language")
    )
    val distinctItems = items.distinctBy { it.key }
    distinctItems.forEach {
        println("${it.key} with value ${it.value}")
    }

    val text = listOf("A", "B", "CC", "DD", "EEE", "F", "GGGG")
    val distinct2 = text.distinctBy {
        it.length
    }
    println(distinct2)

    //Chunked
    // used to split string into new array
    val word = "QWERTY"
    val chunkedTransform = word.chunked(3) {
        it.toString().toLowerCase()
    }

    println(chunkedTransform)
}


data class Item(val key: String, val value: Any)