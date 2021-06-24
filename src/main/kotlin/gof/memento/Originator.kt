package gof.memento


internal class Originator(private var state: String) {
  // The class could also contain additional data that is not part of the state saved in the memento..
  fun updateState(state: String) {
    this.state = state
    println("Originator: Setting state to $state")
  }

  fun saveToMemento(): Memento {
    println("Originator: Saving to Memento.")
    return Memento(state)
  }

  fun restoreFromMemento(memento: Memento) {
    state = memento.savedState
    println("Originator: State after restoring from Memento: $state")
  }

  internal data class Memento(  // accessible by outer class only
    val savedState: String
  )
}


