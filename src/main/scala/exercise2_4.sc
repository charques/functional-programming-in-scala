// Exercise 2.3

def uncurry[A, B, C](f: A => B => C): (A, B) => C = {

  def uncurryExec(a: A, b: B): C = {
    f(a).apply(b)
  }

  uncurryExec
}

