// Exercise 2.5

def compose1[A, B, C](f: B => C, g: A => B): A => C = {
  a: A => f(g(a))
}

def compose2[A, B, C](f: B => C, g: A => B) = (a: A) => f(g(a))