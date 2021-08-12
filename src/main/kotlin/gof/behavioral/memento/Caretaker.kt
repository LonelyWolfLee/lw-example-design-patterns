package gof.behavioral.memento

import java.util.*

class Caretaker {
  private val histories: Stack<Originator.Memento> = Stack()
  private val originator = Originator("First State")

  fun doSomething(state: String) {
    save()
    originator.updateState(state)
  }

  private fun save() {
    histories.push(originator.saveToMemento())

  }
  fun undoSomething() {
    originator.restoreFromMemento(histories.pop())
  }
}