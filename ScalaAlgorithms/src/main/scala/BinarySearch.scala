class BinarySearch {
  def rank(key: Int, a: Array[Int]): Int = {
    def r(key: Int, a: Array[Int], lo: Int, hi: Int): Int = {
      if (lo > hi) -1
      val mid = lo + (hi - lo + 1) / 2
      a match {
        case (array: Array[Int]) if (array(mid) == key) => mid
        case (array: Array[Int]) if (array(mid) > key) => r(list, key, lo, mid - 1)
        case (array: Array[Int]) if (array(mid) < key) => r(list, key, mid + 1, hi)
      }
    }
    r(list, key, 0, list.length - 1)
  }
}
