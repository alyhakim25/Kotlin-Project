class Extensions() {
    fun Int.printInt() {
        println("value $this") // print value using this statement
    }
    fun printNilai(){
        10.printInt()  // give value to printInt function
    }

    val Int.slice: Int
        get() = this / 2

    fun printPropeties(){
        println(10.slice)
    }
}

fun Int.plusThree(): Int {
    return this + 3
}

val Int.slice: String
    get() = (this + 3).toString() // get the value then add with 3 then convert to string

fun main(){
    //Extension Function
    val extensionsFunction = Extensions() // get Extensions class

    extensionsFunction.printNilai() // call printNilai function in Extensions class

    val nilai = 20 // give value to variable
    val total = nilai.plusThree() // set value from variable to function
    println("$nilai + 3 = $total") // print the return from function

    //Extension Properties
    val extensionsProperties = Extensions()

    extensionsProperties.printPropeties()

    println(10.slice)
}