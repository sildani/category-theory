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

  // Implement the composition function in your favorite language. It takes
  // two functions as arguments and returns a function that is their
  // composition.
  @Test
  void composeFunctionsTest() {
    [1,2,"hello"].each {
      def f = { x -> x + 1 }
      def g = { x -> x + 2 }
      assert g(f(it)) == Exercises.compose(f,g).call(it)
    }
  }

  // Write a program that tries to test that your composition function
  // respects identity.
  @Test
  void composedFunctionRespectsIdentity() {
    def c = Exercises.compose({ x -> x + 1 }, { x -> x + 2 })
    assert c == Exercises.identity(c)
  }

}