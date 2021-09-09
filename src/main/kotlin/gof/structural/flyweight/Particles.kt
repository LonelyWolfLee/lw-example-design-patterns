package gof.structural.flyweight

object ParticleFactory {
  private val bullets = mutableMapOf<Int, Bullet>()
  private val barriers = mutableMapOf<Int, Barrier>()

  fun obtainBullet(type: Int): Bullet {
    return bullets[type] ?: run {
      val bullet = Bullet("RED", type, 10)
      bullets[type] = bullet
      bullet
    }
  }

  fun obtainBarrier(type: Int): Barrier {
    return barriers[type] ?: run {
      val barrier = Barrier("Gold", type*100)
      barriers[type] = barrier
      barrier
    }
  }

}

data class Bullet(
  val color: String,
  val size: Int,
  val power: Int
)

data class Barrier(
  val color: String,
  val energy: Int
)