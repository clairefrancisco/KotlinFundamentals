import kotlin.math.abs

fun main() {

    //arithmetic
//    arithmetic()
//
//    //comparison
//    comparison()
//
//    //assignment
//    assignment()
//
//    //unary
//    unaryOperator()
//
//    //Call logical()
//    logical()
//
//    //code wars century
//    println(century(1900))

    //code wars twiceAsOld
    println(twiceAsOld(36,7))
}

fun arithmetic() {
    val x= 24
    val y= 13

    val numByte = Byte.MAX_VALUE
    val numShort = Short.MAX_VALUE
    val numFloat = Float.MAX_VALUE
    val numDouble = Double.MAX_VALUE

    // addition
    val resultAdd1 = numByte + numShort
    val resultAdd2= numFloat + numDouble
    println("Byte + Short = $resultAdd1  ${resultAdd1::class.simpleName}")
    println("Float + Double = $resultAdd2  ${resultAdd2::class.simpleName}")
    println("x + y = ${x + y}")

    // subtraction
    val resultSubtract1 = numByte - numShort
    val resultSubtract2 = numFloat - numDouble
    println("Byte - Short = $resultSubtract1  ${resultSubtract1::class.simpleName}")
    println("Float - Double = $resultSubtract2  ${resultSubtract2::class.simpleName}")
    println("x - y = ${x - y}")

    // division
    val resultDivision1 = numByte - numShort
    val resultDivision2 = numFloat - numDouble
    println("Byte / Short = $resultDivision1  ${resultDivision1::class.simpleName}")
    println("Float / Double = $resultDivision1  ${resultDivision2::class.simpleName}")
    println("x / y = ${x / y}")

    // multiplication
    val resultMultiply1 = numByte - numShort
    val resultMultiply2 = numFloat - numDouble
    println("Byte * Short = $resultMultiply1  ${resultMultiply1::class.simpleName}")
    println("Float * Double = $resultMultiply2  ${resultMultiply2::class.simpleName}")
    println("x * y = ${x * y}")

    // modulus
    val resultModulo1 = numByte - numShort
    val resultModulo2 = numFloat - numDouble
    println("Byte % Short = $resultModulo1  ${resultModulo1::class.simpleName}")
    println("Float % Double = $resultModulo2  ${resultModulo2::class.simpleName}")
    println("x % y = ${x % y}")

}

fun comparison() {
    val x = 45
    val y = 39

    // greater than
    println("x > y = " +  (x > y))

    // less than
    println("x < y = " +  (x < y))

    // greater than or equal to
    println("x >= y = " +  (x >= y))

    // less than or equal to
    println("x <= y = " +  (x <= y))

    // equal to
    println("x == y = " +  (x == y))

    // not equal to
    println("x != y = " +  (x != y))
}

fun assignment() {
    var x = 42
    val y = 97

    // variable x is assigned a value of 40
    println("x = $x")

    // variable y is assigned a value of 20
    println("y = $y")

    //AUGMENTED
    x += y
    println("X += Y = $x")
    x -= y
    println("X -= Y = $x")
}


fun unaryOperator() {
    var x = 46
    val b = true

    // positive
    println("+x = " +  (+x))

    // negative
    println("-x = " +  (-x) )

    // increment
    println("++x = " +  (++x))
    println("++x using the unaryPlus = " +  x.unaryPlus())

    // decrement
    println("--x = " +  (--x))
    println("++x using the unaryMinus = " +  x.unaryMinus())

    // inverts the boolean value
    println("!b = " +  (!b))
    println("!b using not  = " +  b.not())
}

fun logical() {
    val x= true
    val y= false

    // true AND false
    println("x && y = " +  (x && y))

    // true OR false
    println("x || y = " +  (x || y))

    // NOT false
    println("!y = " +  (!y))
}

fun century(number: Int): Int {
//    if(number%100 == 0){
//        return number/100
//    }
//    else {
//        return (number/100).plus(1)
//    }

    return ((number - 1) / 100) + 1

}

//TWICE AS OLD FATHER
fun twiceAsOld(dadYearsOld: Int, sonYearsOld: Int): Int {
    return Math.abs((dadYearsOld - sonYearsOld) - sonYearsOld)
}

//CONVERT NUMBER TO STRING
fun numberToString(num: Int): String {
    return num.toString()
}

//Area or Perimeter
//object Solution {
//    fun areaOrPerimeter(l:Int, w:Int):Int {
//        if (l == w) {
//            return l * w
//        } else {
//            return 2 * (l + w)
//        }
//    }
//}

//Is he gonna survive?
fun hero(bullets: Int, dragons: Int) : Boolean {
    return bullets>=(2 * dragons)
//    if the bullets is greater the the dragons 2 times it will return true; else false
    //code here
}