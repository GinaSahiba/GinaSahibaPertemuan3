package id.ac.polbeng.depandi.test_kelas

class InitOrder(name:String) {
    val firstProperty = "First property: $name".also ( ::println )
    init {
        println("First initializer block that prints ${name}")
    }
    val secondProperty = "second property: ${name.length}".also ( ::println )
    init {
        println("Second intializer block that prints ${name.length}")
    }
}

fun main() {
    val initOrder = InitOrder("RPL")
}