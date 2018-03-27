package src

/**
  * <p> Tests whether an Int array is the correct length and is sorted. </p>
  */
class Tester(array: Array[Int], supposedLength: Int) {

  /**
  * <p> Runs the correctness tests. </p>
  */
  def run = {
    val sorted = isSorted(array)
    val correctL = if (supposedLength == array.size) true else false
    sorted && correctL
  }

  /**
  * <p> Returns whether the given array is sorted. </p>
  */
  def isSorted(array: Array[Int]): Boolean = {
    // base case
    if (array.size == 0 || array.size == 1) {
      true
    }

    // standard case
    else  {
      // slice array in half
      val midIndex = array.size/2
      val leftSlice = array.slice(0, midIndex)
      val rightSlice = array.slice(midIndex, array.size)

      // check the mid element and its predecessor are in order
      if (array(midIndex - 1) <= array(midIndex)) {
        // recursive call to check the left and right halves of the array are sorted
        isSorted(leftSlice) && isSorted(rightSlice)
      }
      else {
        false
      }
    }
  }
}


