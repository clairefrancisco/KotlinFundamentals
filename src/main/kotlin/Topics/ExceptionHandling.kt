import java.lang.IllegalArgumentException

fun main() {
    //exception1
    exception1()

    //throwException
    throwException()
}

fun exception1() {
    try {
        val c = "A word"
        c.toInt()
    } catch (e: ArithmeticException) {
        println("Arithmetic Exception  ${e.localizedMessage}")
    } catch (e: NumberFormatException) {
        println("Number Format Exception  ${e.localizedMessage}")
    } catch (e: Exception) {
        println("Exception occurred. ${e.localizedMessage}")
    } finally {
        println("Optional")
    }
}


fun throwException() {
    try {
        val message = "Welcome to Valorant!"
        if(message.length > 10)
        throw IllegalArgumentException("Something went wrong here. Message is too long.")
    }catch(e: Exception){
        println(e.localizedMessage)
    }finally{
        println("Optional")
    }
}

//CODE WARS JAVA EXCEPTION HANDLING
//public class MyUtilities{
//
//    public boolean isDigit(String s){
//
//        try{
//            Float.parseFloat(s);
//            return true;
//        }catch(NumberFormatException e){
//            return false;
//        }
//
//    }
//}