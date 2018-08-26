// Exercise 2.1
def fib(n: Int): Int = {

  def go(n1: Int, n2: Int, i: Int, n: Int): Int = {
    if (i == n) n2
    else go(n2, n1 + n2, i+1, n)
  }

  go(0, 1, 1, n)
}

fib(25)