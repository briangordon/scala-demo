val a = 5

val product = (x: Int, y: Int) => x * y
product(1, 4)

val map = Map(1 -> 2, 3 -> 4)
map.get(5) match {
    case Some(value) => value
    case None => 0
}
map.withDefaultValue(5)(7)

(1 to 10).map(println)