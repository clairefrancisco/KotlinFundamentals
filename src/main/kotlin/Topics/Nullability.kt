fun main() {

    var possiblyNull:String? = "Hello"
    var mustNotBeNull: String = "Hello"

    possiblyNull = null

    println(possiblyNull)
    println(mustNotBeNull)

    //NullPointerException
//    println(possiblyNull!!.toInt())

    //Elvis Operator
    println(possiblyNull?:"Default")
}
