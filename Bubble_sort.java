package Sorting_program;

public class Bubble_sort {

	public static void bubble(int[] arr) {
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length-i;j++) {
				if(arr[j-1]>arr[j]) {
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {54,21,67,90,67,40,5};
		System.out.println("Enter the array before sorting : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		bubble(arr);
		
		System.out.println("Enter the array after sorting : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
