package src

/**
  * <p> Main class for the sorter. Controls which algorithms to invoke. </p>
  */
object sort {

  /**
  * <p> Main method. </p>
  */
  def main(args: Array[String]) = {

    // input parameters
    val option = args(0).toInt
    val tosort = args(1).split(" ").map(_.toInt).toArray

    println("----------")
    //println("array pre-sorting: " + tosort.mkString(" "))

    val timebefore = System.currentTimeMillis()
    // choose the algorithm and collect the result
    val result = option match {
      case 1  => processQuickSort(tosort)
      case 2  => processMergeSort(tosort)
      case _ => throw new IllegalArgumentException
    }
    val timeafter = System.currentTimeMillis()
    val duration = timeafter - timebefore

    println("array post-sorting: " + result.mkString(" ")) 
    println("time taken: " + duration) 

    // correctness test the result
    val tester = new Tester(result, tosort.size)
    println("correctness tests passed: " + tester.run) 
    
  }


  // method to use the quicksort algorithm
  def processQuickSort(tosort: Array[Int]): Array[Int] = {
    println("Quicksort chosen")
    val sorter = new QuickSorter(tosort)
    sorter.run
  }

  // method to use the mergesort algorithm
  def processMergeSort(tosort: Array[Int]): Array[Int] = {
    println("Mergesort chosen")
    val sorter = new MergeSorter(tosort)
    sorter.run
  }
}



