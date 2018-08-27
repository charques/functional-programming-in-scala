// Exercise 2.3

def curry1[A, B, C](f: (A, B) => C): A => B => C = {

  def curryExec(a: A): B => C = {
    b: B => f(a,b)
  }

  curryExec
}

def curry2[A, B, C](f: (A, B) => C) = (a: A) => (b: B) => f(a,b)
