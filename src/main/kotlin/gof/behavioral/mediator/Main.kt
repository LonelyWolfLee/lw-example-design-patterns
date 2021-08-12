package gof.behavioral.mediator

import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import javax.swing.JFrame
import javax.swing.JPanel


internal interface Command {
  fun execute()
}



internal class MediatorDemo : JFrame(), ActionListener {
  private var mediator: Mediator = ConcreteMediator()
  override fun actionPerformed(ae: ActionEvent) {
    val command = ae.source as Command
    command.execute()
  }

  init {
    val labelDisplay = LabelDisplay(mediator)
    val panelButtons = JPanel()
    panelButtons.add(BtnView(this, mediator))
    panelButtons.add(BtnBook(this, mediator))
    panelButtons.add(BtnSearch(this, mediator))

    contentPane.add(labelDisplay, "North")
    contentPane.add(panelButtons, "South")

    setSize(400, 200)
    isVisible = true
  }
}

fun main() {
  MediatorDemo()
}