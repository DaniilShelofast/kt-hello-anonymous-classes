package mate.academy

class FrenchGreeting : HelloWorldAnonymousClasses.HelloWorldGreeting {
    override fun greet(): String = "Salut tout le monde"

    override fun greetSomeone(someone: String): String = "Salut $someone"
}
