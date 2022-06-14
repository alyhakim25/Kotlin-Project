class `Nested Function` {
}

fun main (){
    setWord("asd")

    val value = sum(20,1,10)
    println(value)
}

fun setWord(message: String) {
    fun printMessage() {
        println(message)
    }

    printMessage()
}

fun sum(valueA: Int, valueB: Int, valueC: Int): Int {
    fun validateNumber(value: Int) {
        if (value == 0) {
            throw IllegalArgumentException("value must be better than 0")
        }
    }

    validateNumber(valueA)
    validateNumber(valueB)
    validateNumber(valueC)
    // or we can change to this
    /***
    fun Int.validateNumber(){
    if (this == 0) {
    throw IllegalArgumentException("value must be better than 0")
    }
    }

    valueA.validateNumber()
    valueB.validateNumber()
    valueC.validateNumber()
     ***/
    return valueA + valueB + valueC
}