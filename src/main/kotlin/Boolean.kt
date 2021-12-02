fun main() {

    //andOrBoolean
    andOrBoolean()

    //compareTo
//    compareTo()

    // Call equals
//    equals()
}

fun andOrBoolean() {
    val t = true
    val f = false

    // T AND T
    println("true and true: "+t.and(t))

    // T AND F
    println("true and false: "+t.and(f))

    // F AND T
    println("false and true: "+f.and(t))

    // F AND F
    println("false and false: "+f.and(false))

    // T OR T
    println("true or true: "+t.or(t))

    // T OR F
    println("true or false: "+t.or(f))

    // F OR T
    println("false or true: "+f.or(t))

    // F OR F
    println("false or false: "+f.or(f))

    // NOT T
    println("not true: "+t.not())

    // NOT F
    println("not false: "+f.not())
}

fun compareTo() {
    val t = true
    val f = false

    // true compareTo true
    println("t.compareTo(t): "+t.compareTo(t))

    // true compareTo false
    println("t.compareTo(f): "+t.compareTo(f))

    // false compareTo true
    println("f.compareTo(t): "+f.compareTo(t))

    // false compareTo false
    println("f.compareTo(f): "+f.compareTo(f))
}

fun equals() {
    val t = true
    val f = false

    // true equals true
    println("t.equals(t): "+ (t == t))

    // true equals false
    println("t.equals(f): "+ (t == f))

    // false equals true
    println("f.equals(t): "+ (f == t))

    // false equals false
    println("f.equals(f): "+ (f == f))
}