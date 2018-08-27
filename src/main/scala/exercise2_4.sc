// Exercise 2.3

def uncurry1[A, B, C](f: A => B => C): (A, B) => C = {

  def uncurryExec(a: A, b: B): C = {
    f(a)(b)
  }

  uncurryExec
}

def uncurry2[A, B, C](f: A => B => C) = (a: A, b: B) => f(a, b)

