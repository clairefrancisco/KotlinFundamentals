fun main(args: Array<String>){

    //Collections - group of related data
    //Immutable (cannot be changed) vs Mutable (can be manipulated)
    //Airlines = ["Cebu Pacific", "PAL", "Airasia"] to make it consistent throughout the process
    //Mutable -> Users = []
    //YAGNI - you ain't gonna to need it
    //List, Set, Map

//    listCollection()
//    setCollection()
      mapCollection()

}

fun listCollection() {
    //List -> ordered collections that can be accessed by indices

    //immutable
    val airlines = listOf("Cebu Pacific", "PAL", "Airasia")
    println(airlines)
    println(airlines[airlines.size-1]) //print the last element of the list using the size-1
    println(airlines.first()) //print the first element in the list
    println(airlines.last())  //print the last element in the list
    println(airlines.reversed()) //reversed element of the list
    println(airlines.contains("PAL")) //check if Pal is present in the list
    println(airlines.isEmpty()) //check if list is empty
    println(airlines.drop(1)) //drop the item from index 0 and before index 1
    println(airlines.dropLast(1)) //drop the item from index 0 and before index 1
    println(airlines.shuffled()) //shuffle the elements in the list
    println(airlines.get(2)) //get element in specific index

    println()

    //mutable
    val terminals = mutableListOf<Int>(1,2,3,4)
    println(terminals)
    terminals.add(5) //Add 5 in terminal list
    println(terminals)
    println(terminals.contains(2)) //check if 2 is present in the list
    terminals.remove(2) //remove 2 in the list
    terminals.removeFirst() //remove the first element in the list
    terminals.removeLast()  //remove the last element in the list
    println(terminals)

}

fun setCollection() {
    //Set -> it contains unique set of elements

    //immutable
   val usernames: Set<String> = setOf("Brandon", "Amelia", "Charlie")
    println(usernames)
    println(usernames.size) //Count of usernames
    println(usernames.isEmpty()) //check if set is empty
    println(usernames.shuffled()) //shuffled elements of set
    println(usernames.sorted()) //sorted set
    println(usernames.contains("Amelia"))  //check if "Amelia" is present in the set
    println(usernames.plus("Clara")) //returns list including the plus element
    println()
    //mutable
    val students: MutableSet<String> = mutableSetOf("Brandon", "Amelia", "Charlie")
    students.add("Claire") //use set if you don't want duplicated data
    students.remove("Brandon") //remove element "Brandon" in the set
    println(students.isEmpty()) //check if set is empty
    println(students.sorted()) //print sorted set in natural order
    println(students.first()) //print the first element
    println(students.last()) //print the last element
    println(students.contains("Charlie")) //check if Charlie is present in the set
    println(students.clear()) //remove all elements in the set
    println(students)

//    val studentNumber: MutableList<Int> = mutableListOf(1,2,3,4,5)
//    studentNumber.add(3) //use list to add a duplicate data
//    println(studentNumber)

}

fun mapCollection() {
    //Map -> iterable, key-value pairs
    //Student Details: firstName, lastName, yrLevel, section
    //"Brandon", "Diaz", 1, "A"

    //immutable
    val studentDetails: Map<String, String> = mapOf(
        "firstName" to "Brandon",
        "lastName" to "Diaz",
        "yrLevel" to "first",
        "section" to "A",
    )
    println(studentDetails)
    println(studentDetails.keys) //print map keys
    println(studentDetails.values) //print map values

    //mutable
    val studentDetailsTwo: MutableMap<String, String> = mutableMapOf(
        "firstName" to "Brandon",
        "lastName" to "Diaz",
        "yrLevel" to "first",
        "section" to "A",
    )
    println(studentDetailsTwo)
    println(studentDetailsTwo.keys) //print map keys
    println(studentDetailsTwo.values) //print map values
    studentDetailsTwo["firstName"] = "Clara" //like a put func, change Brandon to Clara
    println(studentDetailsTwo)
    studentDetailsTwo.remove("section") //remove the key section
    studentDetailsTwo.replace("firstName","Claire") //replace the firstName into Claire
    println(studentDetailsTwo.isEmpty()) //check if map is empty
    println(studentDetailsTwo.entries) //show all key and values of the map
    studentDetailsTwo.clear() //clear the map
    println(studentDetailsTwo)
}