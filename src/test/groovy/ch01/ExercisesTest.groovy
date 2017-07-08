package ch01

import org.junit.Test

class ExercisesTest {

  @Test
  void identityFunctionTest() {
    (1..100).each {
      def x = new Object()
      assert x == Exercises.identity(x)
    }
  }

}