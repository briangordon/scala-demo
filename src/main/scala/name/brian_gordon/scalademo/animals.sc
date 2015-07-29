abstract class Animal(name: String) {
    def getMessage: String
}

class Walrus(name: String) extends Animal(name) {
    override def getMessage: String = "OORT OORT."
}

class Giraffe(name: String) extends Animal(name) {
    override def getMessage: String = "GRGHGHGH."
}

new Walrus("Tusky").getMessage