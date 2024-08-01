package Conditision

fun main(){
   println("Enter a year:")
   var year = readLine()!!.toInt()
   if (year%400==0 || year%100!=0 && year%4==0){
      println("$year is leap year")
   }
   else{
      println("$year is leap year")
   }


}
  // question: leap year
//year = 2018
//        year /400-0-leap year
//        year /4-0 and year /100 !=0 - leap year
//        2000/400 = 5 - 0 - leap year
//        2100/ 400 = 5 - 100