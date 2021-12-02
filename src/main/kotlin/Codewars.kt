import java.util.*

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

fun main() {
        print(doubleInteger(2))
//    print(countPositivesSumNegatives(arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15)))
//    print(countPositivesSumNegatives(arrayOf()))
}
//fun countPositivesSumNegatives(input : Array<Int>?) : Array<Int> {
//    var res=0
//    var resPos=0
//    var arrayResult = arrayOf(resPos,res)
//
//    if(input == null || input.isEmpty()){
//        return emptyArray<Int>()
//    }
//    else{
//    for(i in input!!){
//        if(i>0){
//            resPos++
//        }
//        else{
//            res += i
//        }
//    }
//    }
//
//     println(resPos)
//    println(res)
//    println(arrayResult.toString())
//    return Arrays.(arrayResult)
//
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
fun doubleInteger(i:Int):Int {
    // Double the integer and return it!
    return i.times(2)
}

//Leap Years 10
fun isLeapYear(year: Int) : Boolean {
    return ((year % 400) == 0)
            || (((year % 4) == 0) && ((year % 100) != 0))

    // code here
}

//Maximum Multiple 11
fun maxMultiple(d: Int, b: Int): Int {

    return b - (b % d)

}

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