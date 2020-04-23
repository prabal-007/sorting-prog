package Sorting_program;

import java.util.*;

public class Selection_sort_2 {

	public static void selection(int[] arr) {
		int temp;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[i])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int size;
		int arr[]= new int[40];
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		size=s.nextInt();
		System.out.println();
		System.out.print("Enter the elements of array before sorting : ");
		for(int i=0;i<size;i++) {
			arr[i]=s.nextInt();
		}
		System.out.println();
		selection(arr);
		System.out.print("The elements of array after sorting : ");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
