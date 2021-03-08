class Animal(

    val name: String,
    val age:Int,
    val type:String

) {

    init {
        println(
            "Animal name: $name\n"+
                    "Animal Type: $type\n"+
                    "Animal age: $age months")
        ;
    }

}