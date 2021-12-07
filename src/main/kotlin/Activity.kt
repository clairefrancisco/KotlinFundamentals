fun main(){

    //Take three numbers from the user and print the greatest number.
    //Write a program to check whether an alphabet is a vowel or consonant.

//    findTheGreatest()
//    vowelConsonant()
//    checkPassword()
}

fun findTheGreatest(){
//    println("First Number:")
//    var firstNum = readLine()!!.toInt()
//
//    println("Second Number:")
//    var secondNum = readLine()!!.toInt()
//
//    println("Third Number:")
//    var thirdNum = readLine()!!.toInt()

//    if (firstNum >= secondNum && firstNum >= thirdNum)
//        println("$firstNum is the largest number.")
//    else if (secondNum >= firstNum && secondNum >= thirdNum)
//        println("$secondNum is the largest number.")
//    else
//        println("$thirdNum is the largest number.")
    var greatest=0
    for(x in 1..3){
        print("Input a number: ")
        var num= readLine()!!.toInt()
         if(num>greatest){
            greatest=num
        }
    }
    println("$greatest is the largest number.")

}

fun vowelConsonant(){

    println("Enter a character:")
    var character = readLine()!!.toLowerCase()

    if(character == "a" || character == "e" || character == "i" || character == "o" || character == "u")
        println("$character is a vowel.")
    else println("$character is a consonant.")

}

fun checkPassword(){

    //Write a program to check the validity of password input by users.
    //Validations:
    // At least 1 letter between [a-z] and 1 letter [A-Z]
    // At least 1 number between 0-9
    // At least 1 character from [$#@]
    // Minimum length 6 characters
    // Maximum length 16 characters

    println("Enter your password:")
    var pass = readLine()!!
//    var check = """^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#${'$'}%^&+=])(?=\\S+${'$'}).{4,}${'$'}"""".toRegex()

    if (pass.length < 8 || pass.length > 16||pass.filter { it.isDigit() }.firstOrNull() == null
        ||pass.filter { it.isLetter() }.filter { it.isUpperCase() }.firstOrNull() == null
        ||pass.filter { it.isLetter() }.filter { it.isLowerCase() }.firstOrNull() == null
        ||pass.filter { !it.isLetterOrDigit() }.firstOrNull() == null)
        println("Your password must contain at least 1 uppercase, lowercase, number and special character \n" +
            "Also, your password should be 6 to 16 characters.")


    else{
        println("Nice!")
    }
//    if(!check.matches(pass)){
//       println("Your password must contain at least 1 uppercase, lowercase, number and special character \n" +
//               "Also, your password should be 6 to 16 characters.")
//    }
//    else {
//        println("Nice!")
//    }


}