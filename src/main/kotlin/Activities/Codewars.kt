fun main() {


//    print(addLetters(listOf('y', 'c', 'b')))
    println(reverseSeq(5))
    println(highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"))

    //TEST 12
//    val left = mutableMapOf("w" to 4, "p" to 3, "b" to 2, "s" to 1)
//    val right = mutableMapOf("m" to 4, "q" to 3, "d" to 2, "z" to 1)
//    var score=0
//    var fight ="wwwwww"
//
//    for(i in fight){
//        if(left.containsKey("$i")){
//
//            score -= left.getValue(i.toString())
//
//        }
//        else if(right.containsKey("$i")){
//            score += right.getValue(i.toString())
//        }
//    }
//
//    if(score>0) {
//        println("Right side wins!")
//    }
//    else if(score<0){
//        println("Left side wins!")
//    }
//    else{
//        println("Let's fight again!")
//    }
//    var res=0
//    var resPos=0
//    var newArray = intArrayOf(resPos,res)
//    var some = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15)
//    var some1 = intArrayOf()
//    if(some.isEmpty()){
//        println(newArray.map { it.toInt() })
//    }
//    else{
//    for(i in some!!){
//        if(i>0){
//            resPos++
//        }
//        else{
//            res += i
//        }
//
//    }}
//    newArray = intArrayOf(resPos,res)
//    println(newArray.map { it.toInt() })
//
    //TESTING NO.5
//    var num=35231
//    val splitString: List<String> = num.toString().split("")
//
//    var initialArray = (num.toString()).split("")
//    var newArray = initialArray.reversed().drop(1).dropLast(1)
//    val result = newArray.map { it.toInt() }
//    println(result)

    //TESTING NO.9
//    var someArray = intArrayOf(-1,2,-3,4,-5)
//    println(someArray.map { n -> if(n  > 0) {
//        -n
//    }
//        else {
//        Math.abs(n)
//    }})


//    print(countPositivesSumNegatives(arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15)))
//    print(countPositivesSumNegatives(arrayOf()))
}

fun high(str: String) : String {
    var wordList = str.split(' ')


    return wordList.toString()
}

//Alphabetical Addition
//fun addLetters(arr: List<Char>): Char {
//  var sum = 0
//    var sum1= 0
//    for(i in arr){
//
//        sum += (i-'a'+1)
//        sum1 += (i-'a')
//        var k : Int = i.toInt()
//        println("$k $i $sum")
//        println("$k $i $sum1")
//    }
//    if(sum==0)
//        return 'z'
//    return ((sum-1)%26 +97).toChar()
//}

//Reversed Sequence
fun reverseSeq(n: Int): List<Int> {
    var list: List<Int> = emptyList()
    var num=n
    var i=0
    while(i < num)
    {
        i++
        list = list + i
    }
    return list.reversed()
}

//Sum of Angles
//fun angle(n: Int): Int {
//    if (n < 3)
//        return 0;
//    return ((n - 2) * 180);
//}

//Highest and Lowest
fun highAndLow(numbers: String): String {
    var numbs= numbers.split(" ").filterNot { it.isBlank() }.map { it.toInt()}
    var sorted = numbs.toSortedSet()
    return "${sorted.last()} ${sorted.first()}"
}

//Closest Elevator
//fun elevator(left: Int, right: Int, call: Int): String {
//    var leftd = Math.abs(call-left)
//    var rightd = Math.abs(call-right)
//    if (rightd <= leftd){
//        return "right"
//    }
//    return "left"
//    // code here
//}

//CONVERT NUMBER TO STRING 1
//fun numberToString(num: Int): String {
//    return num.toString()
//}

//Grasshoper - Summation 2
//object GrassHopper {
//    fun summation(n:Int):Int {
//        var i=1
//        var sum=0
//        var num=n
//        while(i <= n)
//        {
//            sum += i
//            i++
//            num--
//        }
//        return sum
//    }
//}

//Area or Perimeter 3
//object Solution {
//    fun areaOrPerimeter(l:Int, w:Int):Int {
//        if (l == w) {
//            return l * w
//        } else {
//            return 2 * (l + w)
//        }
//    }
//}

//Is he gonna survive? 4
//fun hero(bullets: Int, dragons: Int) : Boolean {
//    return bullets>=(2 * dragons)
////    if the bullets is greater the the dragons 2 times it will return true; else false
//    //code here
//}

//Convert Number to reversed array of digits 5
//object Kata {
//    fun digitize(n:Long):IntArray {
//        var initialArray = (n.toString()).split("")
//        var newArray = initialArray.reversed().drop(1).dropLast(1)
//        val result = newArray.map { it.toInt() }
//        return result.toIntArray()
//        // Code here
//    }
//}

//Count of positives / sum of negatives 6
//fun countPositivesSumNegatives(input : Array<Int>?) : Array<Int> {
//    var res=0
//    var resPos=0
//    val numArray : Array<Int> =  emptyArray()
//    if(input?.isEmpty() == true){
//        return numArray
//    }
//
//    input?.let {
//        for(n in input) {
//            if(n > 0) {
//
//                resPos++
//            }
//            else {
//                res += n
//            }
//        }
//        var newArray = arrayOf<Int>(resPos,res)
//        return newArray.map { it.toInt() }.toTypedArray()
//    }
//    return numArray
//}


//Is n divisible by x and y? 7
//fun isDivisible(n: Int, x: Int, y: Int): Boolean {
//    if (n % x == 0 && n % y == 0){
//        return true
//    }
//    else{
//        return false
//    }
//    // your code here
//}

//You Can't Code Under Pressure #1 8
//fun doubleInteger(i:Int):Int {
//    // Double the integer and return it!
//    return i.times(2)
//}

//Invert Values 9
//fun invert(arr: IntArray): IntArray {
//    return arr.map { n -> if(n  > 0) {
//        -n
//    }
//    else {
//        Math.abs(n)
//    }}.toIntArray()
//}

//Leap Years 10
//fun isLeapYear(year: Int) : Boolean {
//    return ((year % 400) == 0)
//            || (((year % 4) == 0) && ((year % 100) != 0))
//
//    // code here
//}

//Maximum Multiple 11
//fun maxMultiple(d: Int, b: Int): Int {
//
//    return b - (b % d)
//
//}

//Alphabet War 12
//fun alphabetWar(fight: String): String {
//    val left = mutableMapOf("w" to 4, "p" to 3, "b" to 2, "s" to 1)
//    val right = mutableMapOf("m" to 4, "q" to 3, "d" to 2, "z" to 1)
//    var score=0
//    for(i in fight){
//        if(left.containsKey("$i")){
//
//            score -= left.getValue(i.toString())
//
//        }
//        else if(right.containsKey("$i")){
//            score += right.getValue(i.toString())
//        }
//    }
//    if(score>0) {
//        return "Right side wins!"
//    }
//    else if(score<0){
//        return "Left side wins!"
//    }
//    else{
//        return "Let's fight again!"
//    }
//    // code here
//}


//Keep Hydrated! 13
//fun litres(time: Double): Int {
//    var res = time * 0.5
//
//    return res.toInt()
//}

//Return Negative 14
//class Kata {
//
//    fun makeNegative(x: Int): Int {
//        if(x==0||x<0){
//            return x
//        }
//        else{
//            return (-x)
//        }
//        // your code here
//    }

//Opposites Attract 15
fun loveFun(flowerA: Int, flowerB: Int): Boolean {
    return flowerA % 2 !== flowerB % 2;
    // moment of truth
}

