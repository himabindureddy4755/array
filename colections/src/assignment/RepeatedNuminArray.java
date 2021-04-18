package assignment;

public class RepeatedNuminArray {
	
	    void printRepeating(int arr[], int size)
	    {
	        int i, j;
	        System.out.println("Repeated Elements are :");
	        for (i = 0; i < size; i++)
	        {
	            for (j = i + 1; j < size; j++)
	            {
	                if (arr[i] == arr[j])
	                    System.out.print(arr[i] + " ");
	            }
	        }
	    }
	 
	    public static void main(String[] args)
	    {
	        RepeatedNuminArray repeat = new RepeatedNuminArray();
	        int arr[] = {9,4,5,6,7,4,9,5};
	        int arr_size = arr.length;
	        repeat.printRepeating(arr, arr_size);
	    }
	}


