class Person(name: String) {
    private var name: String
    init{
        this.name = name
    }
    fun printMe() = println(this.name)
}

fun main(args: Array<String>) {

    fun printArea(width:Int, height:Int) : Unit {
        fun calculateArea(width: Int, height: Int): Int = width * height
        val area = calculateArea(width, height)

        println("The area is $area")
    }
        printArea(10, 20)

    fun whatNumber(x: Int) {
        when (x) {
            0 -> println("x is zero")
            1 -> println("x is 1")
            else -> println("x is neither 0 or 1")
        }
    }
    whatNumber(0)
    whatNumber(1)
    whatNumber(100)

    fun isAbs(x: Int): Boolean {
        return when (x) {
            Math.abs(x) -> true
            else -> false
        }
    }

    println(isAbs(-10))
    println(isAbs(10))

    fun isSingleDigit(x:Int) : Boolean {
        return when(x) {
            in -9..9 -> true
            else -> false

        }
    }
    println(isSingleDigit(10))
    println(isSingleDigit(8))
    println(isSingleDigit(-5))

    fun deleteFiles(filePatterns: String, recursive: Boolean, ignoreCase : Boolean,
                    deleteDirectories: Boolean) : Unit {
        println("Hello")
    }

    deleteFiles("*.jpg", true, true, false)

    deleteFiles("*.jpg", recursive = true, ignoreCase = true, deleteDirectories = false)

    fun isDieNumber(x: Int): Boolean {
        return when(x) {
            in listOf(1, 2, 3, 4, 5, 6) -> true
            else -> false
        }
    }
    println(isDieNumber(3))
    println(isDieNumber(10))

    fun startsWithFoo(any: Any): Boolean {
        return when (any) {
            is String -> any.startsWith("Foo")
            else -> true
        }
    }

    println(startsWithFoo("Foo is terrible."))
    println(startsWithFoo(10))

    fun whenWithoutArgs(x: Int, y: Int) {
        when {
            x < y -> println("x in less than y")
            x > y -> println("x is greater than y")
            else -> println("x must equal y")
        }
    }

    whenWithoutArgs(10, y=20)
    whenWithoutArgs(x=20, y=10)
    whenWithoutArgs(x=10, y=10)

    fun addTwoNumbers(a: Int, b: Int): Int = a+b

    fun addTwoNumbers2(a: Int, b: Int): Int {
        return a+b
    }
    fun largestNumber(a: Int, b:Int, c:Int): Int {
        fun largest(a: Int, b: Int): Int{
            if (a>b) return a else return b
        }
        return largest(largest(a, b), largest(b, c))

    }

    println(largestNumber(a=10, b=20, c=30))

    fun printLessThanTwo() {
        val list =listOf(1, 2, 3, 4)
        list.forEach(fun(x: Int) {
            if (x < 2) println(x)
            else return
        })
        println ("This line will still execute")
    }
    printLessThanTwo()

    val person = Person(name="TaeWan")

    person.printMe()

    val instance = Widget.Factory.createInstance()

    print(instance.str)

    val withInheritance = withInheritanceDerive(true)

    withInheritance.doSomething()

    println("withInheritance:${withInheritance.isAvailable}")
}

class Widget{
    val str: String = "Hello World"
    companion object Factory {
        val test: String = "something"

        fun createInstance(): Widget = Widget()
    }

}

interface Shape {
    val area: Double

}

class Rectangle(val width: Double, val height: Double): Shape {
    override val area: Double
        get() = width * height

    val isSquare : Boolean = width == height

}
open class WithInheritance {
    open var isAvailable: Boolean = false
        get() = field //그대로 돌려주기
        protected set(value) {

        }

}
class withInheritanceDerive(isAvailable: Boolean) : WithInheritance() {
    override var isAvailable: Boolean = isAvailable
        get() {
            return super.isAvailable
        }
        set(value) {
            println("withInheritanceDerive.isAvailable")
            field = value
        }
    fun doSomething() {
        isAvailable = false
    }

}












