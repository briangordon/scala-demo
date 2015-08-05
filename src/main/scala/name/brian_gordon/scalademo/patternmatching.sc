case class Person(name: String, age: Int, height: Int)

val harold = Person("Harold", 42, 183)
val Person(haroldsName, haroldsAge, haroldsHeight) = harold
haroldsName
haroldsAge
haroldsHeight
class MyPerson(val name: String, val age: Int, val height: Int)
object MyPerson {
    def apply(name: String, age: Int, height: Int) =
        new MyPerson(name, age, height)
    def unapply(person: MyPerson) =
        Some((person.name, person.age, person.height))
}

val MyPerson(geraldsName, geraldsAge, geraldsHeight) =
    MyPerson("Gerald", 71, 160)
object MultipleOfTwo {
    def unapply(number: Int) = {
        if (number % 2 == 0) Some(number / 2)
        else None
    }
}

object MultipleOfThree {
    def unapply(number: Int) = {
        if (number % 3 == 0) Some(number / 3)
        else None
    }
}

7 match {
    case MultipleOfTwo(factor) => factor
    case MultipleOfThree(factor) => factor
}