package example

object P03 {
  def nth[T](n:Int, list: List[T]): T = list match {
    case x::_ if n == 0 => x
    case _::xs => nth(n-1, list)
  }
}
