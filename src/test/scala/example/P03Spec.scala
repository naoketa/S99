package example

import org.scalatest.{DiagrammedAssertions, FunSpec}

class P03Spec extends FunSpec with DiagrammedAssertions{
  describe("P03") {
    it("複数要素から最初の数を取得する") {
      assert(P03.nth(0, List(0,1)) === 0)
    }

  }
}
