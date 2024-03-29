Understanding Koin
Koin is a lightweight DI framework for Kotlin applications, including Android. It was designed with simplicity and ease of use in mind. Koin does not rely on code generation or reflection, which makes it fast and efficient. It leverages the power of Kotlin’s DSL (Domain Specific Language) capabilities to provide a simple and declarative syntax for defining dependencies and their relationships.

class Pilot(private val fly: Fly, private val eat: Eat) {

   fun perform(): String = fly.flyPlane() + "\n" + eat.eatFood()
}

class Eat {
   fun eatFood(): String = "I am eating food"
}

class Fly {
   fun flyPlane(): String = "I am flying a plane"
}

Dependencies are made by Koin using modules. The following code should be added to a new Kotlin file with the name “module.”

val appModule = module {
   single { Fly() }
   factory { Eat() }
   factory { Pilot(get(), get()) }
}
As the name implies, a module is created using the module function. Creating a singleton instance requires the keyword single. This indicates that when the dependency is required, Koin will return the same instance of the class. Since we believe that all pilots fly in a similar manner, we have created a singleton. On the other hand, we use the factory method when we require a new instance of the class for each call. Both Eat and Fly classes have been created using the factory because we need a new instance every time we use them. The type of dependence we require is recognized, and it is then fetched for us. For the module, that is all we require.
