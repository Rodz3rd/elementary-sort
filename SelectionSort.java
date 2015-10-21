/**
* 	@author Rodrigo Galura III
*	@date_created 08-07-15
*/

class SelectionSort extends Sort {
	// Constructor
	public SelectionSort(int size) {
		super(size);
	}
	
	/**
	* 	This method perform selection sort algorithm
	* 	that arrange the element in ascending order.
	* 	@param none
	* 	@return none
	*/
	public void sort() {
		int min;
		for ( int i = 0; i < super.SIZE - 1; i++ ) {
			min = i;
			for ( int j = i; j < super.SIZE - 1; j++ ) {
				if ( super.array[min] > super.array[j+1] ) {
					min = j+1;
				}
			}
			swap(i, min);
		}
	}

	/**
	* 	This method perform selection sort algorithm
	* 	that arrange the element in descending order.
	* 	@param none
	* 	@return none
	*/
	public void rsort() {
		int min;
		for ( int i = 0; i < super.SIZE - 1; i++ ) {
			min = i;
			for ( int j = i; j < super.SIZE - 1; j++ ) {
				if ( super.array[min] < super.array[j+1] ) {
					min = j+1;
				}
			}
			swap(i, min);
		}
	}
}