import scala.collection.mutable
import org.scalatestplus.play.PlaySpec

class MapFuncSpec extends PlaySpec {
  "Map" should {
    "return map" in {
      val x: mutable.Map[String, Int] = mutable.Map[String, Int]()
      x ++= Map("Hello" -> 1)
      x mustBe Map("Hello" -> 1)
    }

    "return map1" in {
      val x: mutable.Map[String, Int] = mutable.Map[String, Int]()
      x += "Hello" -> 1
      x mustBe Map("Hello" -> 1)
    }

    "clear" in {
      val x: mutable.Map[String, Int] = mutable.Map[String, Int]()
      x += "Hello" -> 1
      x.clear() mustBe()
    }

    "put" in {
      val x: mutable.Map[String, Int] = mutable.Map[String, Int]()
      x put("Hello", 1)
      x mustBe Map("Hello" -> 1)
    }

    "update" in {
      val x: mutable.Map[String, Int] = mutable.Map[String, Int]()
      x put("Hello", 1)
      x update("Hello", 3)
      x mustBe Map("Hello" -> 3)
    }

    "-=" in {
      val x: mutable.Map[String, Int] = mutable.Map[String, Int]()
      x put("Hello", 1)
      x -= "Hello"
      x mustBe Map()
    }

    "--=" in {
      val x: mutable.Map[String, Int] = mutable.Map[String, Int]()
      x put("Hello", 1)
      x put("New", 2)
      x --= List("Hello", "New")
      x mustBe Map()
    }

    "getOrElseUpdate" in {
      val x: mutable.Map[String, Int] = mutable.Map[String, Int]()
      x put("Hello", 1)
      x getOrElseUpdate("New", 2)
      x mustBe Map("Hello" -> 1, "New" -> 2)
    }
  }
}
