package gof.behavioral.memento

fun main() {
  Caretaker().run {
    doSomething("State1")
    doSomething("State2")
    doSomething("State3")
    doSomething("State4")
    undoSomething()
    undoSomething()
  }
}