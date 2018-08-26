// Exercise 2.3

def curry[A, B, C](f: (A, B) => C): A => (B => C) = {

  def curryExec(a: A): B => C = {
    (b: B) => f(a,b)
  }

  curryExec
}

