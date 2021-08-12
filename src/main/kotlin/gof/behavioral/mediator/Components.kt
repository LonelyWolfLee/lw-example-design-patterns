package gof.behavioral.mediator

import java.awt.Font
import java.awt.event.ActionListener
import javax.swing.JButton
import javax.swing.JLabel

//A concrete colleague
internal class BtnView(al: ActionListener, m: Mediator) : JButton("View"), Command {
  private var mediator: Mediator
  override fun execute() {
    mediator.view()
  }

  init {
    addActionListener(al)
    mediator = m
    mediator.registerView(this)
  }
}

//A concrete colleague
internal class BtnSearch(al: ActionListener, m: Mediator) : JButton("Search"), Command {
  private var mediator: Mediator
  override fun execute() {
    mediator.search()
  }

  init {
    addActionListener(al)
    mediator = m
    mediator.registerSearch(this)
  }
}

//A concrete colleague
internal class BtnBook(al: ActionListener, m: Mediator) : JButton("Book"), Command {
  private var mediator: Mediator
  override fun execute() {
    mediator.book()
  }

  init {
    addActionListener(al)
    mediator = m
    mediator.registerBook(this)
  }
}

internal class LabelDisplay(mediator: Mediator) : JLabel("Just start...") {
  init {
    mediator.registerDisplay(this)
    font = Font("Arial", Font.BOLD, 24)
  }
}