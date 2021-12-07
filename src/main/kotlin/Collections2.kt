fun main(args: Array<String>){

    val numbers = listOf(1,2,3,4,5)

    //forEach ->
    numbers.forEach{
        println(it)
    }

    numbers.forEach{
        number ->
        val newNumber = number*15
        print(newNumber)

    }

    //map -> will return a new collection, performing the transformation
    val newNumbers = numbers.map{
        it*3
    }
    println(newNumbers)

    //filter -> will return a new collection, filtering the values based on our condition
    val evenNumbers = numbers.filter {
        it % 2 == 0
    }
    println(evenNumbers)

    
}