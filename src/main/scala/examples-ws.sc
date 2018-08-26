import scala.annotation.tailrec

def factorial(n: Int): Int = {

  @tailrec
  def go(n: Int, acc: Int): Int =
    if(n <= 0) acc
    else go(n-1, n*acc)

  go(n, 1)
}
factorial(5)


def partial1[A, B, C](a: A, f: (A, B) => C): B => C = {
  (b: B) => f(a, b)
}