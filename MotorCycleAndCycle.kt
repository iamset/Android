open class Cycle{
    open fun printText(){
        println("I am the ancestor.")
    }
}

class MotorCycle: Cycle(){
    override fun printText(){
        super.printText();
        println(
            "Hello I am a motorcyle, I am a cycle with an engine"
        )
        println(
            "My ancestor is a cycle who is a vehicle with pedals"
        )
    }
}
