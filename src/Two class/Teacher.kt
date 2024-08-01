package `Two class`

class Teacher {
    var name:String = ""
    var ID:Int = 0
    var address:String = ""

    constructor()
    constructor(name:String)
    constructor(name:String, id:Int)
    constructor(name: String, id:Int, address:String){
        println("Name: $name, ID: $ID, Address: $address")
    }
    fun display(){
        println("Name: $name")
        println("ID: $ID")
    }

}