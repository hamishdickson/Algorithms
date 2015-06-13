class Gcd {
  def gcd(p: Int, q: Int): Int = {
    if (q == 0) p.abs
    else gcd(q, p % q)
  }
}
