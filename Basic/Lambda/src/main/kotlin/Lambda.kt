fun main() {
    message()
    printMessage("Hello, this is Lambda too")
    val len = messageLength("hello there")
    println("the length of \"hello there\" is $len ")
}

val message = { println("Hello From Lambda") } // this is function with no param and no return
val printMessage = { message: String -> println(message) } // this is function with param without return
val messageLength = { message: String -> message.length } // this is function with param and return