import java.io.InputStream
import java.io.OutputStream


interface Document {
    val version: Long
    val size : Long
    val name : String
        get()="NoName"

    fun save(input : InputStream)
    fun load(stream: OutputStream)
    fun getDescription(): String {
        return "Documents $name has $size byte(-s)"

    }
}

class DocumentImpl : Document {
    override val size: Long
        get() = 0
    override fun load(stream:OutputStream){

    }
    override fun save(input:InputStream) {

    }
    override val version : Long
        get()=0
}

fun main(args: Array<String>) {
    var name: Char = 'k'
    val name2: String = "kotlin"

//    name2 = "java"

    var array = arrayOf(1, 2, 3)

    println(array[1])

    var perfectSquares = Array(10, {k -> k*k})

    println(perfectSquares[2])

    for (k in perfectSquares) {
        println(k)
    }
    for(i: Int in 1..9) {
        for (j: Int in 1..9) {
            println(i*j)
        }
    }

    class Person2(firstname: String, lastName: String, howOld: Int?){
        private val name: String
        private val age : Int?

        init {
            this.name = "$firstname, $lastName"
            this.age = howOld
        }

        fun getName() : String = this.name
        fun getAge() : Int? = this.age
    }


    var person = Person2("Taewan","Ko",16)

    println(person.getName())
    println(person.getAge())


    println(name is Char)

    println(name)
    println("Hello")
    println("World")
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}

