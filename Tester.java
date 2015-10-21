/**
* 	@author Rodrigo Galura III
*	@date_created 09-27-15
*/

class Tester {
	public static void main(String[] args) {
		// testBubbleSort();
	}

	public static void testBubbleSort() {
		Sort bs = new BubbleSort(10);
		bs.insert(5);
		bs.insert(4);
		bs.insert(6);
		bs.insert(3);
		bs.insert(7);
		bs.insert(2);
		bs.insert(8);
		bs.insert(1);
		bs.insert(9);
		bs.insert(0);

		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("****************************");
		System.out.println("*\tBubble Sort\t   *");
		System.out.println("****************************\n");

		// --------------------------------------------------
		System.out.println("Original Arrangement of array");
		bs.displayArray();

		System.out.println(); // newline

		bs.sort(); // sort the array in ascending order

		System.out.println("Sorting of array as ascending order");
		bs.displayArray();

		System.out.println(); // newline

		bs.rsort(); // sort the array in descending order

		System.out.println("Sorting of array as descending order");
		bs.displayArray();
		// --------------------------------------------------

		System.out.println("\n\n");
	}

	public static void testSelectionSort() {
		Sort ss = new SelectionSort(10);
		ss.insert(5);
		ss.insert(4);
		ss.insert(6);
		ss.insert(3);
		ss.insert(7);
		ss.insert(2);
		ss.insert(8);
		ss.insert(1);
		ss.insert(9);
		ss.insert(0);

		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("****************************");
		System.out.println("*\tSelection Sort\t   *");
		System.out.println("****************************\n");

		// --------------------------------------------------
		System.out.println("Original Arrangement of array");
		ss.displayArray();

		System.out.println(); // newline

		ss.sort(); // sort the array in ascending order

		System.out.println("Sorting of array as ascending order");
		ss.displayArray();

		System.out.println(); // newline

		ss.rsort(); // sort the array in descending order

		System.out.println("Sorting of array as descending order");
		ss.displayArray();
		// --------------------------------------------------

		System.out.println("\n\n");
	}

	public static void testInsertionSort() {
		Sort is = new InsertionSort(10);
		is.insert(9);
		is.insert(8);
		is.insert(7);
		is.insert(6);
		is.insert(5);
		is.insert(4);
		is.insert(3);
		is.insert(2);
		is.insert(1);
		is.insert(0);

		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("****************************");
		System.out.println("*\tInsertion Sort\t   *");
		System.out.println("****************************\n");

		// --------------------------------------------------
		System.out.println("Original Arrangement of array");
		is.displayArray();

		System.out.println(); // newline

		is.sort(); // sort the array in ascending order

		System.out.println("Sorting of array as ascending order");
		is.displayArray();

		System.out.println(); // newline

		is.rsort(); // sort the array in descending order

		System.out.println("Sorting of array as descending order");
		is.displayArray();
		// --------------------------------------------------

		System.out.println("\n\n");
	}
}