import kotlin.math.log

fun main(){

    val list = listOf("School", "bus", "bee", "bic", "bell", "big");
    val count = list.count { string ->
        string.length == 3
    }

    println(count)

}

//fun

//fun main(){
//
//    println("Please enter a number");
//    val number = readLine() ?: "0";
//
//    val parsedNumber = try {
//        number.toInt();
//    }catch (e: Exception){
//
//        0
//
//    }
//
//    println(parsedNumber)
//
//}


//fun main(){
//
//    val newDog = Dog();
//    newDog.makeNoise();
//    newDog.eat();
//    newDog.sleep();
//
//    val newWhale = Whale();
//    newWhale.makeNoise();
//    newWhale.eat();
//    newWhale.sleep();
//
//}






//fun main(){
//
//    val anArray = arrayOf<Int>(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
//
//    printer(anArray);
//
//}
//
//fun printer(anArray: Array<Int>){
//
//    for(aNumber in anArray){
//
//        when (aNumber) {
//
//            in 1..5 -> {
//                println("$aNumber is among first five");
//                numberCommenter(aNumber, aNumber.isOdd())
//            };
//            in 6..10 -> {
//                println("$aNumber is among second five")
//                numberCommenter(aNumber, aNumber.isOdd())
//            }
//            in 11..15 -> {
//                println("$aNumber is among third five")
//                numberCommenter(aNumber, aNumber.isOdd())
//            }
//            in 16..20 -> {
//                println("$aNumber is among last five")
//                numberCommenter(aNumber, aNumber.isOdd())
//            }
//
//        }
//
//    }
//
//}
//
//fun Int.isOdd():Boolean{
//
//    return this % 2 == 0;
//
//}
//
//fun numberCommenter(number:Int, bool:Boolean){
//
//    when(bool){
//
//        false -> println("$number is odd");
//        true -> println("$number is even");
//
//    }
//
//}