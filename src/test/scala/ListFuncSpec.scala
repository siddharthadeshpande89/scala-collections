import org.scalatestplus.play.PlaySpec

class ListFuncSpec extends PlaySpec {
  // ::
  ":: should add element to beginning of list" should {
    "return List" in {
      val x = List(1, 2, 3)
      4 :: x mustBe List(4, 1, 2, 3)
    }
  }

  // +:
  "+: should add any traversable element to beginning of list" should {
    "return List" in {
      val x = List(1, 2, 3)
      val y = Seq(5, 4)
      x +: y mustBe (List(List(1, 2, 3), 5, 4))
    }
  }

  // :+
  ":+ should add any traversable element to beginning of list" should {
    "return List" in {
      val x = List(1, 2, 3)
      val y = Seq(5, 4)
      x :+ y mustBe (List(1, 2, 3, List(5, 4)))
    }
  }

  // :::
  "::: should append traversable element to list" should {
    "return List" in {
      val x = List(1, 2, 3)
      val y = List(4, 5, 6)
      x ::: y mustBe List(1, 2, 3, 4, 5, 6)
    }
  }

  // drop
  "drop should drop element from list" should {
    "return List" in {
      val x = List(1, 2, 3)
      x.drop(1) mustBe List(2, 3)
    }
  }

  // ++
  "++ should prepend element from list" should {
    "return List" in {
      val x = List(1, 2, 3)
      val y = List(4, 5, 6)

      x ++ y mustBe List(1, 2, 3, 4, 5, 6)
    }
  }

  // take
  "take should pick n elements from list" should {
    "return List" in {
      val x = List(1, 2, 3)

      x take 1 mustBe List(1)
    }
  }

  // takeRight
  "takeRight" should {
    "return right elements from n" in {
      val x = List(1, 2, 3)
      x.takeRight(3) mustBe List(1, 2, 3)
    }
  }

  // slice
  "slice should take the from to from list" should {
    "return ranged list" in {
      val x = List(1, 3, 4)

      x(0) mustBe 1
      x slice(1, 3) mustBe List(3, 4)
    }
  }

  // splitAt
  "splitAt" should {
    "split list with n" in {
      val x = List(1, 2, 3)
      val r = x.splitAt(1)
      r mustBe(List(1), List(2, 3))
    }
  }

  // map
  "map" should {
    "map the elements" in {
      val list = List(1, 2, 3)

      list.map(_ * 2) mustBe List(2, 4, 6)
    }
  }

  // takeWhile
  "takeWhile" should {
    "while condition" in {
      val list = List(2, 3, 4, 5, 6)

      list.takeWhile(_ % 2 == 0) mustBe List(2)
    }
  }

  // dropWhile
  "dropWhile" should {
    "drop while" in {
      val list = List(1, 2, 3)

      list.dropWhile(_ <= 3) mustBe List()
    }
  }

  // span
  "span" should {
    "span the list" in {
      val list = List(1, 2, 3, 4, 5, 6)

      list.span(_ < 4) mustBe(List(1, 2, 3), List(4, 5, 6))
    }
  }

  // forEach
  "forEach" should {
    " forEach over list" in {
      val l = List(1, 2, 3)
      l.foreach(println(_))
    }
  }

  // reverse
  "reverse" should {
    "reverse the list" in {
      val list = List(1, 2, 3, 4)

      list.reverse mustBe List(4, 3, 2, 1)
    }
  }

  // isEmpty
  "isEmpty" should {
    "if empty" in {
      List().isEmpty mustBe true
    }
  }

  // head
  "head" should {
    "head of the list" in {
      val list = List(1, 2, 3)

      list.head mustBe 1
    }
  }

  // tail
  "tail" should {
    "tail of the list" in {
      val list = List(1, 2, 3)

      //      list.reduce()

      list.tail mustBe List(2, 3)
    }
  }
}
