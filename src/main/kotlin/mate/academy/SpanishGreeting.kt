package mate.academy

class SpanishGreeting : HelloWorldAnonymousClasses.HelloWorldGreeting {
    override fun greet(): String = "Hola, mundo"

    override fun greetSomeone(someone: String): String = "Hola, $someone"
}
