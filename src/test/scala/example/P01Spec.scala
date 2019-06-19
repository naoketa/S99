package example

import org.scalatest.{DiagrammedAssertions, FunSpec}

class P01Spec extends FunSpec with DiagrammedAssertions {
  describe("P01") {
    it("2つ以上の要素を持つリストで、最後の値を返す") {
      assert(P01.last(List(1,2)) === 2)
    }
    it("1つの要素を持つリストで、唯一の要素を返す") {
      assert(P01.last(List(1)) === 1)
    }
    it("複数の文字列を持つリストで、最後の要素を返す") {
      assert(P01.last(List("1","2","3")) === "3")
    }
    it("空のリストでNoSuchElementExceptionを発生させる") {
      intercept[NoSuchElementException] {
        P01.last(List())
      }
    }
  }

}