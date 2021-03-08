fun main(){

    val anArray = arrayOf<Int>(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);

    printer(anArray);

}

fun printer(anArray: Array<Int>){

    for(aNumber in anArray){

        when (aNumber) {

            in 1..5 -> println("$aNumber is among first five");
            in 6..10 -> println("$aNumber is among second five")
            in 11..15 -> println("$aNumber is among third five")
            in 16..20 -> println("$aNumber is among last five")

        }

    }

}