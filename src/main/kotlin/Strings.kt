fun main(){
//    val myMessage = "Happy Birthday! Justin!"
//    val anotherMessage = "Happy Birthday! Macki!"
//    println(myMessage)
//    println(myMessage.get(0))
//    println(myMessage.length)
//    println(myMessage.substring(16,22))
//    println(myMessage.compareTo(anotherMessage))
//    println(myMessage.plus(anotherMessage))
//    println(myMessage.subSequence(16,22))
//    println(myMessage.contains("Justin"))
//    println(myMessage.drop(1))
//    println(myMessage.dropLast(1))
//    println(myMessage.toUpperCase())
//    println(myMessage.toLowerCase())
//    println(myMessage.reversed())
//    println(myMessage.random())

//    val givenName = "Claire"
//    val surName = "Francisco"
//    val middleName = "Cordero"
//    val myAge = 21

//    println("My full name is $givenName ${middleName.get(0)} $surName")
//    println("My full name is $givenName ${middleName.first()} $surName")
//    println("My age 10 years from now is ${myAge + 10} ")

    val nickName = "clara"
    val amount = 100
    val product = 10
    val nickTwoName = "clara marie"

    val words = nickTwoName.split(" ").toMutableList()
    var newNickname = ""

    for(word in words){
        newNickname += word.capitalize() +" "
    }

    newNickname = newNickname.trim()

    println("Hey! ${newNickname} You need to pay ${amount*product} for $product products with a price of $amount each")

}

//REMOVE FIRST AND LAST CHAR IN A STRING
//fun main(){
//    val sampleText = "eloquent"
//    var newText = sampleText.drop(1).dropLast(1)
//     println(newText)
//}

//REMOVE ALL WHITESPACES IN A STRING
//fun noSpace(x: String): String {
//    return x.replace("\\s".toRegex(), "")
//
//}

//MULTIPLY BY 8 IF EVEN, 9 IF ODD
//fun simpleMultiplication(n: Int): Int {
//    var answer=0
//    if(n%2==0){
//       answer=n*8
//    }
//    else{
//        answer=n*9
//    }
//    return answer
//}

//fun abbrevName(name:String) {
//
//    return name.split("\\s")
//}