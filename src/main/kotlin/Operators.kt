fun main() {
    // Call arithmetic
//    arithmetic()

    // Call comparison
//    comparison()

    // Call assignment
//    assignment()

    // Call additionAssignment
//    additionAssignment()

    // Call incrementDecrement
//    incrementDecrement()

    //Call logical()
    logical()
}

fun arithmetic() {
    val x: Int = 24
    val y: Int = 13

    // addition
    println("x + y = ${x + y}")

    // subtraction
    println("x - y = ${x - y}")

    // division
    println("x / y = ${x / y}")

    // multiplication
    println("x * y = ${x * y}")

    // modulus
    println("x % y = ${x % y}")
}

fun comparison() {
    val x: Int = 45
    val y: Int = 39

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
    val x: Int = 42
    val y: Int = 97

    // variable x is assigned a value of 40
    println("x = $x")

    // variable y is assigned a value of 20
    println("y = $y")
}

fun additionAssignment() {
    var x: Int = 16

    // x = x + 10
    x += 10

    println("x = $x")
}

fun incrementDecrement() {
    var x:Int = 71
    val b: Boolean = true

    // sets x as positive
    println("+x = " +  (+x))

    // sets x as negative
    println("-x = " +  (-x))

    // increment x by 1 or x + 1
    println("++x = " +  (++x))

    // decrement x by 1 or x - 1
    println("--x = " +  (--x))

    // inverts the boolean value
    println("!b = " +  (!b))
}

fun logical() {
    val x: Boolean = true
    val y: Boolean = false

    // true AND false
    println("x && y = " +  (x && y))

    // true OR false
    println("x || y = " +  (x || y))

    // NOT false
    println("!y = " +  (!y))
}
