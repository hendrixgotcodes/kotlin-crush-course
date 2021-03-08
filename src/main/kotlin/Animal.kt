abstract class Animal(

    private val type:String,
    private val legCount:Int = 4,

    ) {
    abstract fun makeNoise();
    abstract fun eat();
    abstract fun sleep();

}