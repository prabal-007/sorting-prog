package Sorting_program;

public class Insertion_sort {

	public static void insertion(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			int key = arr[i];
			int j=i-1;
			while((j>-1) && arr[j]>key)
			{
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1]=key;
		}
	}
	
	public static void main(String a[]) {
		int arr[]= {23,56,32,45,98,2,90,21};
		System.out.print("Enter the array before sorting : ");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		insertion(arr);
		System.out.print("Enter the array after sorting : ");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		
	}

}
