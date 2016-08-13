// -----------------------------------------------------------------------------------------------------------------------------------------
// Author: Tim Siwula      
// -----------------------------------------------------------------------------------------------------------------------------------------
// File: SparseArray.java
// -----------------------------------------------------------------------------------------------------------------------------------------
// Purpose: SparseArray interface
// -----------------------------------------------------------------------------------------------------------------------------------------
// Abstract Data Type: Two seperate Linked list that make a grid.  
// -----------------------------------------------------------------------------------------------------------------------------------------
// Input: blah.
// -----------------------------------------------------------------------------------------------------------------------------------------
// Output: blah.
// -----------------------------------------------------------------------------------------------------------------------------------------
// Compile: command line here
// -----------------------------------------------------------------------------------------------------------------------------------------
// Run: command line here
// -----------------------------------------------------------------------------------------------------------------------------------------
// Dependencies: 
// -----------------------------------------------------------------------------------------------------------------------------------------
// Interfaces: SparseArray.java
// -----------------------------------------------------------------------------------------------------------------------------------------
// Notes: 
//	1. Both linked lists have dummy elements before the head to eliminate special cases. 
//	2.
//	3.
// -----------------------------------------------------------------------------------------------------------------------------------------

public interface SparseArray
{
	// -----------------------------------------------------------------------------------------------------------------------------------------
	// Public Methods -- SparseArray -- defaultValue() -- 1 of 5.       
	// -----------------------------------------------------------------------------------------------------------------------------------------
	// Returns default value. no implementation
	// -----------------------------------------------------------------------------------------------------------------------------------------
	public Object defaultValue(); 

	// -----------------------------------------------------------------------------------------------------------------------------------------
	// Public Methods -- SparseArray -- iterateRows() -- 2 of 5.       
	// -----------------------------------------------------------------------------------------------------------------------------------------
	// Return an iterator. no implementation
	// -----------------------------------------------------------------------------------------------------------------------------------------
	public RowIterator iterateRows(); 

	// -----------------------------------------------------------------------------------------------------------------------------------------
	// Public Methods -- SparseArray -- iterateColumns() -- 3 of 5.       
	// -----------------------------------------------------------------------------------------------------------------------------------------
	// Returns an iterator. no implementation
	// -----------------------------------------------------------------------------------------------------------------------------------------
	public ColumnIterator iterateColumns(); 

	// -----------------------------------------------------------------------------------------------------------------------------------------
	// Public Methods -- SparseArray -- elementAt() -- 4 of 5.       
	// -----------------------------------------------------------------------------------------------------------------------------------------
	// Returns an object. no implementation
	// -----------------------------------------------------------------------------------------------------------------------------------------
	public Object elementAt(int row, int col); 

	// -----------------------------------------------------------------------------------------------------------------------------------------
	// Public Methods -- SparseArray -- setValue() -- 5 of 5.       
	// -----------------------------------------------------------------------------------------------------------------------------------------
	// Adds new linked list elements as necessary.
	// -----------------------------------------------------------------------------------------------------------------------------------------
	public void setValue(int row, int col, Object value); 
}
