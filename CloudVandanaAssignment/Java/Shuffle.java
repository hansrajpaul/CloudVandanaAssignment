package util;


import java.util.*;

    
	class Test121
	{
		
		    	// Java Program to shuffle a given array
		    		// A Function to generate a random permutation of arr[]
		    		static void randomize( int arr[], int n)
		    		{
		    			// Creating a object for Random class
		    			Test121 r = new Test121();
		    			
		    			// Start from the last element and swap one by one. We don't
		    			// need to run for the first element that's why i > 0
		    			for (int i = n-1; i > 0; i--) {
		    				
		    				// Pick a random index from 0 to i
		    				int j = r.nextInt(i+1);
		    				
		    				// Swap arr[i] with the element at random index
		    				int temp = arr[i];
		    				arr[i] = arr[j];
		    				arr[j] = temp;
		    			}
		    			// Prints the random array
		    			System.out.println(Arrays.toString(arr));
		    		}
		    		
		    		private int nextInt(int i) {
						// TODO Auto-generated method stub
						return 0;
					}

					// Driver Program to test above function
		    		public static void main(String[] args) 
		    		{
		    			
		    			int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
		    			int n = arr.length;
		    			randomize (arr, n);
		    		}
		    	// This code is contributed by Sumit Ghosh

	}