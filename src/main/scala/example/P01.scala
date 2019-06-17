package example

object P01 {
  def last[T](list: List[T]): T = list match {
    case x :: Nil => x
    case x :: xs => last(xs)
  }
}