class `Nullable Receiver` {
}

val Int?.exam1: Int
    get() = if (this == null) 0 else this.div(2)

val Int?.exam2: Int
    get() = this?.div(2) ?: 0 // add ? at the end of 'this' to give input null
                                    // ?: to switch the varibale value if the value is null
val Int.exam3: Int
    get() = this.div(2)

fun main(){
    val value1: Int? = null // add ? at the end of data type we able to give null value
    val value2: Int = 10

    println(value1.exam1)
    println(value1.exam2)
    println(value2.exam1)
    println(value2.exam2)

    //safe call operator
    println(value1?.exam3) // add ? at the end of variable name to avoid error cause off null value
}