/**
* 	@author Rodrigo Galura III
*	@date_created 08-07-15
*/

abstract class Sort {
	/**
	* 	This variable contain constant number
	*	that once you assign it a number
	* 	it will never be change, unless this
	* 	program take some error
	*/
	protected final int SIZE;

	protected int[] array; // This will contain poly number

	protected int nElem; // This will be index of array

	// Constructor
	public Sort (int size) {
		this.array = new int[size];
		SIZE 	   = size;

		this.nElem = 0;
	}

	/**
	* 	Insert some value in incrementing index
	* 	@param  value - to be value of array at nElem index
	* 	@return none
	*/
	protected void insert(int value) {
		this.array[nElem] = value;

		this.nElem++;
	}

	// swap the element from index n to n+1
	protected void swap(int n, int nPlus1) {
		int temp 			= this.array[n];
		this.array[n] 		= this.array[nPlus1];
		this.array[nPlus1]  = temp;
	}

	// Display the element of array
	protected void displayArray() {
		for ( int element : this.array ) {
			System.out.print(element + " ");
		}
	}

	/**
	* 	The body of these two methods are
	* 	in the childclass of this class
	*/
	abstract void sort();
	abstract void rsort();
}