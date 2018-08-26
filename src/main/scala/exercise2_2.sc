// Exercise 2.2

def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {

  def loop(n: Int): Boolean = {
    if(n+1 >= as.length) true
    else if(ordered(as(n), as(n+1))) loop(n+1)
    else false
  }
  loop(0)
}

val a = Array[Int](1,2,3)

def orderedInt(a: Int, b: Int): Boolean =
  if(a <= b) true
  else false

isSorted(a, orderedInt)


