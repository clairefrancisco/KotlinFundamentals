fun main() {

    //Print Number Types
    numberTypes()

    //Convert one data type to another data type
//    convertDataTypes()
}
fun numberTypes() {

    val numberTypes1 = 8
    println(numberTypes1::class.simpleName)  //display type

    val numberTypes2 = 34.5
    println(numberTypes2::class.simpleName)

    val numberTypes3 = 3333333333333333333
    println(numberTypes3::class.simpleName)

    println(longArrayOf(numberTypes3))
    val numberTypes4 = 3333333333333333333F
    println(numberTypes4::class.simpleName)

    val oneByte: Byte = 1
    println(oneByte::class.simpleName)

}

fun printDouble(num: Double) {
    println(num)
}

fun convertDataTypes() {
    val numberTypes4 : Float = 3333333333333333333F
    val b: Byte = 1 // OK, literals are checked statically

    val i1: Int = numberTypes4.toInt()
    println(i1)





}

//Reduce but Grow
//fun grow(arr: IntArray): Int {
//    return arr.reduce{product, e -> product * e }
//}

//byte < short < int < long < float < double