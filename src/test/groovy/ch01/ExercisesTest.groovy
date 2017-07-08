package ch01

import org.junit.Test

class ExercisesTest {

  // Implement, as best as you can, the identity function in your favorite
  // language (or the second favorite, if your favorite language happens
  // to be Haskell).
  @Test
  void identityTest() {
    (1..100).each {
      def x = new Object()
      assert x == Exercises.identity(x)
    }
  }

}