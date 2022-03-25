package id.ac.polbeng.depandi.test_kelas

// child class (initializes the parent class)
class LaptopB : Computer{
    val batteryLife: Double

//    Calls super() to initialize the Parent class
    constructor(name: String, brand: String, batteryLife:Double): super(name, brand){
        this.batteryLife = batteryLife
    }

//    calls another constructor (which call super())
    constructor(name: String,brand: String): this(name, brand, 0.0){

    }
    fun info() {
        println("Name : $name")
        println("Brand : $brand")
        println("Battery Life : $batteryLife")
    }
}

fun main() {
    val myLaptop = LaptopB ("Asus Think Pas","Asus")
    println(myLaptop.info())
}