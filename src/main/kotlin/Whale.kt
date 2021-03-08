class Whale:Animal("Whale", 0) {
    override fun makeNoise() {
        println("Whale is singing")
    }

    override fun eat() {
        println("Whale opens big mouth to eat")
    }

    override fun sleep() {
        println("Whale suspends and sleep")
    }
}