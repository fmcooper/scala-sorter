package sorter

  /**
  * <p> Quicksort algorithm class. Sorts an array of Int. </p>
  */
class QuickSorter(tosort: Array[Int]) {

  /**
  * <p> Runs the quicksort algorithm. </p>
  */
  def run = {
    quicksort(tosort)
  }

  /**
  * <p> Quicksort algorithm. </p>
  */
  def quicksort(array: Array[Int]): Array[Int] = {
    // base cases 
    if (array.size == 0 || array.size == 1) {
      array
    }

    // standard case 
    else {
      // choose first element as pivot and partition
      val pivot = array(0)
      val partition = array.slice(1, array.size).partition(_ < pivot)

      // return the sorted left array plus the pivot plus the sorted right array
      (quicksort(partition._1) :+ pivot) ++ quicksort(partition._2)
    }
  }
}
