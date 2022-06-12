fun main() {
    //1
    // normal lambda
    message()
    printMessage("Hello, this is Lambda too")
    val len = messageLength("hello there")
    println("the length of \"hello there\" is $len ")

    val message = buildString {
        append("Hello ")    // give parameter append
        append("from ")
        append("lambda ")
        delete(0,5)
    }

    //2
    //lambda with receiver
    val message2 = buildString { append(message)
    append("Hello")}
    println(message2)

    //3
    //scope function with lambda receiver
    // run function
    val text = "Hello"
    val result1 = text.run { //'run' function will return value based on expression that in lambda
        val from = this // get value using receiver 'this'
        val to = this.replace("Hello", "Kotlin") // replace the value
        to  // return from lambda
    }
    println("result : $result1")

    // with function
    val message3 = "Hello Kotlin!"
    val result2 = with(message3) {
        "First character is ${this[0]}" +
                " and last character is ${this[this.length - 1]}"
    }

    println(result2)

    //apply
    //from this
    /***
        val builder = StringBuilder()
        builder.append("Hello ")
        builder.append("Kotlin!")

        println(builder.toString())
     ***/
    //can be like this
    val message4 = StringBuilder().apply {
        append("Hello ")
        append("Kotlin!")
    }

    println(message4.toString())

    // scope function with lambda argument
    // let function ( it argument)
    val message5: String? = null
    message5?.let {
        val length = it.length * 2
        val text = "text length $length"
        println(text)
    } ?: run {
        val text = "message is null"
        println(text)
    }

    //also function ( it argument )
    val text2 = "Hello Kotlin"
    val result = text2.also {
        println("value length -> ${it.length}")
    }

    println("text -> $result")
}

//lambda without receiver
val message = { println("Hello From Lambda") } // this is function with no param and no return
val printMessage = { message: String -> println(message) } // this is function with param without return
val messageLength = { message: String -> message.length } // this is function with param and return

//lambda with receiver
fun buildString(action: StringBuilder.() -> Unit): String {  //set lambda parameter for this case is StringBuilder class
    val stringBuilder = StringBuilder() // call StringBuilder() class to variable
    stringBuilder.action()  // implement method that given from parameter
    return stringBuilder.toString() // return
}