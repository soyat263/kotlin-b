package Interfaceclass

class Student: Person {
    override var name: String = ""

    override fun sleep() {
        println("$name is sleeping")
    }

    override fun work() {
        println("$name is playing...")
    }

    override fun study() {
        println("$name is studying...")
    }
}