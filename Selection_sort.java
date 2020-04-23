package Sorting_program;

public class Selection_sort {

	public static void selection(int[] arr) {
		int index,temp;
		for(int i=0;i<arr.length-1;i++) {
			index=i;
			for(int j=1;j<arr.length;j++) {
				if(arr[j]<arr[i])
				{
					index=j;
				}
			}
			temp=arr[index];
			arr[index]=arr[i];
			arr[i]=temp;
		}
		
	}
	
	public static void main(String a[]) {
		int arr[]= {23,56,32,45,98,2,90,21};
		System.out.print("Enter the array before sorting : ");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		selection(arr);
		System.out.print("Enter the array after sorting : ");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		
	}

}
