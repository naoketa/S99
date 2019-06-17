package example

import org.scalatest.{DiagrammedAssertions, FunSpec}

class P02Spec extends FunSpec with DiagrammedAssertions{
  describe("P02") {
    it("3つの要素のリストから、最後から二つ目の要素を返す") {
      assert(P02.penultimate(List(1,2,3)) === 2)
    }
  }
}
