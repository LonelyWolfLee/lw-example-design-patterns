package gof.structural.flyweight

fun main() {
  showLog(ParticleFactory.obtainBullet(1))
  showLog(ParticleFactory.obtainBullet(2))
  showLog(ParticleFactory.obtainBullet(1))
  showLog(ParticleFactory.obtainBarrier(2))
  showLog(ParticleFactory.obtainBarrier(1))
  showLog(ParticleFactory.obtainBarrier(2))
}

fun showLog(particle: Any) {
  println("${particle.hashCode()} $particle")
}