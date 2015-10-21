/**
* 	@author Rodrigo Galura III
*	@date_created 08-07-15
*/

class InsertionSort extends Sort {
	// Constructor
	public InsertionSort(int size) {
		super(size);
	}

	/**
	* 	This method perform bubble sort algorithm
	* 	that arrange the element in ascending order.
	* 	@param none
	* 	@return none
	*/
	public void sort() {
		/**
		* 	This variable represent as pointer that store the index
		* 	of array everytime the value of 'n' is greater than to 'n+1'
		*/
		int pointer;

		int temp; // it is just a temporary variable	

		for (int i = 1; i < super.SIZE; i++) {
			temp    = super.array[i];
			pointer = i;

			while ( pointer > 0 && super.array[pointer-1] > temp ) {
				super.array[pointer] = super.array[pointer-1];
				pointer--;
			}

			super.array[pointer] = temp;
		}
	}

	/**
	* 	This method perform bubble sort algorithm
	* 	that arrange the element in descending order.
	* 	@param none
	* 	@return none
	*/
	public void rsort() {
		/**
		* 	This variable represent as pointer that store the index
		* 	of array everytime the value of 'n' is greater than to 'n+1'
		*/
		int pointer;

		int temp; // it is just a temporary variable	

		for (int i = 1; i < super.SIZE; i++) {
			temp    = super.array[i];
			pointer = i;

			while ( pointer > 0 && super.array[pointer-1] < temp ) {
				super.array[pointer] = super.array[pointer-1];
				pointer--;
			}

			super.array[pointer] = temp;
		}
	}
}