package sorter

// cd ..
// scalac -cp . -d . sorter/*.scala
// scala -cp . sorter.sort 1 "4 5 6 1 2"

object sort {
  def main(args: Array[String]) = {

    //val option :Either[String, Int] = try {Right(args(0).toInt)} catch {case e : Exception => Left("option failed")}
    //val tosort :Either[String, Array[Int]] = try {Right(args(1).split(" ").map(_.toInt).toArray)} catch {case e : Exception => Left("thing to sort failed")}

    // val option: Option = args(0).toInt match {
    //   case None => -1
    //   case Some(i: Int) => i
    // }
      // println("option " + option.getOrElse("error"))
      // println("tosort " + tosort.getOrElse("error").mkString(" "))


    val option = args(0).toInt
    val tosort = args(1).split(" ").map(_.toInt).toArray


    println("option " + option)
    println("tosort " + tosort.mkString(" "))

    val result = option match {
      case 1  => processQuickSort(tosort)
      case 2  => processMergeSort(tosort)
      case _ => throw new IllegalArgumentException
    }

    println("sorted " + result.mkString(" "))
    
    
  }

  def processQuickSort(tosort: Array[Int]): Array[Int] = {
    println("Quicksort")
    val sorter = new QuickSorter(tosort)
    sorter.run
  }

  def processMergeSort(tosort: Array[Int]): Array[Int] = {
    println("Mergesort")
    val sorter = new MergeSorter(tosort)
    sorter.run
  }







}