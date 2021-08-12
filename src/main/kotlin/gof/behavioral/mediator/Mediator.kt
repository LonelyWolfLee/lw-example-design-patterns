package gof.behavioral.mediator

//Abstract Mediator
internal interface Mediator {
  fun book()
  fun view()
  fun search()
  fun registerView(v: BtnView?)
  fun registerSearch(s: BtnSearch?)
  fun registerBook(b: BtnBook?)
  fun registerDisplay(d: LabelDisplay?)
}

//Concrete mediator
internal class ConcreteMediator : Mediator {
  private var btnView: BtnView? = null
  private var btnSearch: BtnSearch? = null
  private var btnBook: BtnBook? = null
  private var show: LabelDisplay? = null

  override fun registerView(v: BtnView?) {
    btnView = v
  }

  override fun registerSearch(s: BtnSearch?) {
    btnSearch = s
  }

  override fun registerBook(b: BtnBook?) {
    btnBook = b
  }

  override fun registerDisplay(d: LabelDisplay?) {
    show = d
  }

  override fun book() {
    btnBook?.isEnabled = false
    btnView?.isEnabled = true
    btnSearch?.isEnabled = true
    show?.text = "booking..."
  }

  override fun view() {
    btnView?.isEnabled = false
    btnSearch?.isEnabled = true
    btnBook?.isEnabled = true
    show?.text = "viewing..."
  }

  override fun search() {
    btnSearch?.isEnabled = false
    btnView?.isEnabled = true
    btnBook?.isEnabled = true
    show?.text = "searching..."
  }
}