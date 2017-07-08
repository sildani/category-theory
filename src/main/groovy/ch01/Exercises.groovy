package ch01

class Exercises {

  static identity(x) { x }

  static compose(Closure x, Closure y) {
    Closure composite = y << x
    composite
  }

}