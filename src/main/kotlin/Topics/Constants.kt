//const val PI_VALUE = 3.14

//fun main(){
//    print(PI_VALUE * 13)
//
//}

//fun main(args: Array<String>) {
//    print("Write anything here: ")
//
//    val enteredString = readLine()
//    println("You have entered this: $enteredString")
//
////  converting into integer
////    val number = Integer.valueOf(readLine())
////    println("The entered number is: $number")
//}

import java.time.LocalDate

fun main() {
    print("What is your name? ")
     val yourName = readLine()

    print("What is your birthdate? (YYYY-MM-DD")
    val yourBirthday = readLine()

//COMPLEX USING LIBRARY
    val yourAge = LocalDate.parse(yourBirthday).until(LocalDate.now())


//SIMPLEST
//    val yourBirthday = Integer.valueOf(readLine())
//    val yourAge = 2021-yourBirthday

    println("Your name is: $yourName")
    println("Your birthdate is: $yourBirthday")
    println("Your age is: ${yourAge.years} years, ${yourAge.months} months, ${yourAge.days} days old.")


}

//fun multiply(x: Double, y: Double): Double { return x * y }

