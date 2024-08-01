package `Kotlin Nested Class`

class Outer {
    var neme:String = "Soyat"
    class Nasted{
        var outer = Outer()

        fun display(){
            println(outer.neme)
        }
    }
}

fun main(){
    val out = Outer()
    val nasted = Outer.Nasted()
    nasted.display()
}



