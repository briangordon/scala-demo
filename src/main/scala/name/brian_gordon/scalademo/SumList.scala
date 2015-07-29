package name.brian_gordon.scalademo

import scala.annotation.tailrec

/**
 * @author Brian Gordon
 */
object SumList {
    /**
     * Sum using side-effects.
     */
    def sum1(numbers: List[Int]): Int = {
        var sum = 0
        for (number <- numbers) {
            sum += number
        }
        sum
    }

    /**
     * Sum using recursion.
     */
    def sum2(numbers: List[Int]): Int =
        numbers match {
            case (head :: tail) => head + sum2(tail)
            case _ => 0
        }

    /**
     * Sum using tail recursion.
     */
    @tailrec
    def sum3(numbers: List[Int], accumulator: Int = 0): Int =
        numbers match {
            case head :: tail => sum3(tail, accumulator + head)
            case _ => accumulator
        }

    /**
     * Sum using fold.
     */
    def sum4(numbers: List[Int]): Int =
        numbers.fold(0)((acc, cur) => acc + cur)

    /**
     * Sum using fold.
     */
    def sum5(numbers: List[Int]): Int =
        numbers.fold(0)(_ + _)

    /**
     * Sum.
     */
    def sum6(numbers: List[Int]): Int =
        numbers.sum
}
