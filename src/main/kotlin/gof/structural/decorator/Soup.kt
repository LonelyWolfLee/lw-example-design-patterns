package gof.structural.decorator

interface Soup {
  fun cook()
}

class SoupBase: Soup {
  override fun cook() {
    println("스프 육수를 끓인다")
  }
}

abstract class SoupDecorator(private val soup: Soup): Soup {
  override fun cook() {
    soup.cook()
    decoration()
  }

  protected abstract fun decoration()
}

class MeatSoupDecorator(soup: Soup): SoupDecorator(soup) {
  override fun decoration() {
    println("고기를 넣는다")
  }
}

class VegetableSoupDecorator(soup: Soup): SoupDecorator(soup) {
  override fun decoration() {
    println("야채를 넣는다")
  }
}

class CreamSoupDecorator(soup: Soup): SoupDecorator(soup) {
  override fun decoration() {
    println("크림을 넣는다")
  }
}