# scala-sorter
A simple program to sort an array of integers, comparing quicksort and mergesort. Outputs the time taken to sort in milliseconds.

# Using this program
You will need Scala installed on your computer to run this program.

After you have downloaded the scala-sorter source code to your computer cd into the scala-sorter directory. To run an example instance type the following into your terminal:

``$ make runexample1``

This will automatically compile the source code and run the first example. To compile the code it is only necessary to run the command: 


``$ make``

Running your own examples after compilation can be easily done without using the make file. The two parameters given to the program are 1) an option value which indicates which algorithm you are wanting to run ('1' for quicksort, '2' for mergesort) and 2) a string (in quotation marks) of integers separated by spaces.

``scala -cp . src.sort 1 "3 6 0 9 1 2 9 1 4 6"``

