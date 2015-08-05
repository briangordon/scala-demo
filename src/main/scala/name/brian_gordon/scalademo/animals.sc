abstract class Animal(name: String) {
    def getMessage: String
}

class Walrus(val name: String) extends Animal(name) {
    override def getMessage: String = "OORT OORT."
}

class Giraffe(name: String) extends Animal(name) {
    override def getMessage: String = "GRGHGHGH."
}

new Walrus("Tusky").getMessage
new Walrus("Ooorty").name