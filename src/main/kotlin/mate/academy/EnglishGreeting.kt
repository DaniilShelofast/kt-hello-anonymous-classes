package mate.academy

class EnglishGreeting : HelloWorldAnonymousClasses.HelloWorldGreeting {
    override fun greet(): String = "Hello world"

    override fun greetSomeone(someone: String): String = "Hello $someone"
}
