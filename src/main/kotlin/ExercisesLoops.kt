//val numbers = [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15]

//Create a loop that will print the following based on these conditions:

// If the value is divisible by 3 = "Ping"
// If the value is divisible by 5 = "Pong"
// If the value is divisible by 3 and 5  = "PingPong"
// Else "x"

fun main(args: Array<String>){
    val numbers = listOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15)

    numbers.forEach{
        if(it % 3==0 && it % 5==0){
            println("PingPong")
        }else if(it % 3==0){
            println("Ping")
        }else if(it % 5==0){
            println("Pong")
        }else {
            println("x")
        }
    }
}