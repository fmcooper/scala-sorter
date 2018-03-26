package sorter

  /**
  * <p> Mergesort algorithm class. Sorts an array of Int. </p>
  */
class MergeSorter(tosort: Array[Int]) {

  /**
  * <p> Runs the mergesort algorithm. </p>
  */
  def run = {
    mergesort(tosort)
  }

  /**
  * <p> Mergesort algorithm. </p>
  */
  def mergesort(array: Array[Int]): Array[Int] = {
    // base cases
    if (array.size == 0 || array.size == 1) {
      array
    }
    
    // standard case 
    else {
      val middle = array.size/2
      merge(mergesort(array.slice(0, middle)), mergesort(array.slice(middle, array.size)), new Array[Int](0))
    }
  }


  /**
  * <p> Merge-ing functionally. </p>
  */
  def merge(a1: Array[Int], a2: Array[Int], acc: Array[Int]): Array[Int] = {
    // base conditions
    if (a1.size == 0 && a2.size == 0) {
      acc
    }
    else if (a1.size == 0) {
      acc ++ a2
    }
    else if (a2.size == 0) {
      acc ++ a1
    }

    // standard condition
    else {
      if (a1(0) < a2(0)) {
        val elemToAdd = a1(0)
        merge(a1.slice(1, a1.size), a2, acc :+ elemToAdd)
      }
      else {
        val elemToAdd = a2(0)
        merge(a1, a2.slice(1, a2.size), acc :+ elemToAdd)
      }
    }
  }
}
