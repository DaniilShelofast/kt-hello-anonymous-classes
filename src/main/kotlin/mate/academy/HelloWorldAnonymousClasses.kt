package mate.academy

class HelloWorldAnonymousClasses {

    interface HelloWorldGreeting {
        fun greet(): String
        fun greetSomeone(someone: String): String
    }

    fun sayHello(names: List<String>): List<String> {
        val listClazzGreets = listOf<HelloWorldGreeting>(
            EnglishGreeting(),
            FrenchGreeting(),
            SpanishGreeting()
        )

        val resultGreet = mutableListOf<String>()
        for (g in listClazzGreets) {
            resultGreet.add(g.greet())
        }

        if (names.isEmpty()) {
            return resultGreet
        } else {
            for (name in names) {
                for (g in listClazzGreets) {
                    resultGreet.add(g.greetSomeone(name))
                }
            }
        }
        return resultGreet
    }
}

fun main() {
    val helloWorld = HelloWorldAnonymousClasses()
    println(helloWorld.sayHello(listOf()))
    println(helloWorld.sayHello(listOf("Alice", "Bob")))
}
