package gof.structural.decorator

fun main() {
  val soup = SoupBase()
  val decoratedSoup = CreamSoupDecorator(MeatSoupDecorator(VegetableSoupDecorator(soup)))

  decoratedSoup.cook()
}