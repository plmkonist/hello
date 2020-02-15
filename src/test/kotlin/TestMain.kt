import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class TestMain : StringSpec({
    "test the add method" {
        println(add(5,6)) shouldBe 11
    }
})