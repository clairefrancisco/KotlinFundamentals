package Topics

fun main(args: Array<String>){

    //function for ATMs
    // Check balance -> "Your balance is: ____"
    // Deposit -> "You just deposited ___. Your new balance is: ___"
    // Withdrawal -> "Your new balance is: ___"


    //Deposit
    // 1. You cannot deposit more than 5000
    // 2. You canot deposit an amount not divisible by 100
    // 3. You cannot deposit negative amount

    //Withdraw
    // 1. You cannot withdraw more than half of the current amount
    // 2. You cannot withdraw negative amount

    val account = mutableMapOf<String,Any>(
        "username" to "Brandon",
        "balance" to 0
    )

    println(checkBalance(account))
    deposit(account,5200)
    withdraw(account,2500)
    deposit(account,400)
    withdraw(account,150)
}


fun checkBalance(account: MutableMap<String, out Any>) : String {

    return "Your balance is: ${account.getValue("balance")}"
}

fun deposit(account: MutableMap<String, Any>, amount: Int) : Unit {
    if(amount>5000) println("You cannot deposit more than 5000.")
    else if(amount % 100 != 0) println("You cannot deposit an amount not divisible by 100.")
    else if(amount<0) println("You cannot deposit negative amount")
    else {
        val newBalance= account.getValue("balance").toString().toInt() + amount
        account["balance"] = newBalance
        println("You just deposited $amount. Your new balance is: ${account.getValue("balance")}")
    }

}
fun withdraw(account: MutableMap<String, Any>, amount: Int) : Unit {
    if(amount>(account.getValue("balance").toString().toInt()/2))
        println("You cannot withdraw more than half of the current amount.")
    else if(amount<0) println("You cannot withdraw negative amount.")
    else {
        val newBalance= account.getValue("balance").toString().toInt() - amount
        account["balance"] = newBalance
        println("Your new balance is: ${account.getValue("balance")}")
    }



}