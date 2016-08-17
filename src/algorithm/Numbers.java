package algorithm;
import java.util.Random;


public class Numbers {

	/*
	 * Show all the different kind of sorting algorithm by applying into (num array).
	 * Display the execution time for each sorting.Example in below.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 */

	public static void main(String[] args) {
		
		int [] num = new int[10000];

		Random rand = new Random();
		for(int i=0; i<num.length; i++){

		num[i] = rand.nextInt(1000000);

		}

		//Selection Sort
		Sort algo = new Sort();
		algo.selectionSort(num);
		long selectionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of "+ num.length + " numbers in Selection Sort take: " + selectionSortExecutionTime + " milli sec");
		//Insertion Sort
		algo.insertionSort(num);
		long insertionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + insertionSortExecutionTime + " milli sec");

		//Continue for rest of the Sorting Algorithm....
		algo.mergeSort(num);
		long mergeSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of "+ num.length + " numbers in mergeSort  take: " + selectionSortExecutionTime + " milli sec");

		algo.bubbleSort(num);
		long  bubbleSortExecutionTime= algo.executionTime;
		System.out.println("Total Execution Time of "+ num.length + " numbers in bubbleSort take: " + selectionSortExecutionTime + " milli sec");

		algo.quickSort(num);
		long quickSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of "+ num.length + " numbers in quickSort  take: " + selectionSortExecutionTime + " milli sec");

		algo.heapsort(num);
		long  heapSortExecutionTime= algo.executionTime;
		System.out.println("Total Execution Time of "+ num.length + " numbers in heapSort take: " + selectionSortExecutionTime + " milli sec");

		algo.bucketSort(num);
		long bucketSortExecutionTime= algo.executionTime;
		System.out.println("Total Execution Time of "+ num.length + " numbers in bucketSort take: " + selectionSortExecutionTime + " milli sec");

		algo.shellSort(num);
		long shellSortExecutionTime= algo.executionTime;
		System.out.println("Total Execution Time of "+ num.length + " numbers in shellSort take: " + selectionSortExecutionTime + " milli sec");

	}

}
