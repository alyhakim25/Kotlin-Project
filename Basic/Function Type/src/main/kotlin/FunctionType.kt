
typealias Arithmetic = (Int, Int) -> Int

val sum: Arithmetic = { valueA, valueB -> valueA + valueB }

val multiply: Arithmetic = { valueA, valueB -> valueA * valueB }

// the code above its seem like code below,
// so for simplify the code we can use typealias key for function which have same variable count, type, and return
/***
fun sum(valueA : Int, valueB : Int): Int {
return valueA + valueB
}
fun multiply(valueA : Int, valueB : Int): Int {
return valueA * valueB
}
 ***/

fun main(){

    val sumResult = sum(10, 10)
    val multiplyResult = multiply(20, 20)

    //val sumResult = sum.invoke(10, 10)    // we can use invoke to call the function
    //val multiplyResult = multiply.invoke(20, 20)

    println(sumResult)
    println(multiplyResult)
}

