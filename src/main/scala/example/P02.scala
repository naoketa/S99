package example

object P02 {
  def penultimate[T](list: List[T]):T = list match {
    case x :: _ :: Nil => x
    case _ :: y :: xs  => penultimate(y :: xs)
    case _             => throw new NoSuchElementException
  }

}
