package assignment;

import java.util.Scanner;

public class FindMaxMinOfArray {
	 
	 public static void main(String[] args) {
	 
	 //array of 10 numbers
	
	 int arr[] = { 1,3,5,2,0,173,23,47,90,45};
	 
	 
	 //assign first element of an array to largest and smallest
	 int smallest = arr[0];
	 int largest = arr[0];
	 
	 for(int i=1; i< arr.length; i++)
	 {
	 if(arr[i] > largest)
	 largest = arr[i];
	 else if (arr[i] < smallest)
	 smallest = arr[i];
	 
	 }
	 System.out.println("Smallest Number is : " + smallest);
	 System.out.println("Largest Number is : " + largest); 
	 }
	}


