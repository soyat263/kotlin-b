package Conditision

fun main(){
    var a = readLine()!!.toInt()
    when(a%2){
        0-> println("$a is even")
        else -> println("$a is odd")
    }
}