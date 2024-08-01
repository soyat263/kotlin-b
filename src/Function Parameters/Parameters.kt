package `Function Parameters`

fun main(){
    sum2(10, 20)
    sum2(50, 60)
    sum2(70, 100)
}

fun sum2(a:Int, b:Int){
    var sum = a+b
    println("Sum of $a and $b is $sum")
}