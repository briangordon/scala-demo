val concat = (first: String, second: String) => first + second

val concat2 = new Function2[String, String, String] {
    override def apply(first: String, second: String): String =
        first + second
}
concat2.apply("Sig", "Fig")
concat2("Sig", "Fig")

object A {
    def concatt(first: String, second: String) = first + second
}

A.concatt _