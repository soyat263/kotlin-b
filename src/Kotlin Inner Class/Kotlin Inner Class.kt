package `Kotlin Inner Class`

class Outer {
    var name:String = "Soyat"
    inner class Inner{
        fun display(){
            println(name)
        }
    }
}

fun main(){
    val out = Outer()
    val inner = out.Inner()
    inner.display()

}