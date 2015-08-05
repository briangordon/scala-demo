def average(input: Seq[Int]) = {
    input.sum.toDouble / input.length
}

case class Student(grade: Int, height: Int)

val jordan = Student(3, 125)
val bridget = Student(5, 129)
val tyler = Student(4, 135)
val becky = Student(4, 126)
val jason = Student(5, 135)
val brian = Student(1, 114)

val students = Seq(jordan, bridget, tyler, becky, jason, brian)
students.groupBy(_.grade).mapValues(students => average(students.map(_.height)))