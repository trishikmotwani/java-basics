package javabasics;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,3,4,5};
		for(int i= arr.length - 1, j = 0  ; i >= arr.length/2  && j <= arr.length/2 ; i--, j ++) {
			int last = arr[i];
			int first = arr[j];
			
			arr[i] = first;
			arr[j] = last;
		}
		
		for(int i =0; i< arr.length ;i++) {
			System.out.print(arr[i]);
		}
		
		
			
	}

}
