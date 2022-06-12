class `Member Reference` {

}
var message = "Kotlin"
fun main(){
    //Reflection
    //val sum: (Int, Int) -> Int = { valueA, valueB -> valueA + valueB }
    val sum: (Int, Int) -> Int = ::count

    println(sum(10,10))

    // Function Reference
    val numbers = 1.rangeTo(10)
    val evenNumbers = numbers.filter(::isEvenNumber)

    println(evenNumbers)

    //Property Reference
    println(::message.name)
    println(::message.get())

    ::message.set("Kotlin Academy")

    println(::message.get())
}
fun count(valueA: Int, valueB
: Int): Int {
    return valueA + valueB
}
fun isEvenNumber(number: Int) = number % 2 == 0