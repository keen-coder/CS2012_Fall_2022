
public class ArrayCopyExample {

	public static void main(String[] args) {
		/*System.arraycopy(source_arr, 
		                   source_start_index, 
		                   target_arr, 
		                   target_start_index, 
		                   num_elements_to_copy)*/
		
		int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] arr2 = new int[5];
		
//		for(int i = 0 ; i < arr1.length ; i++) {
//			arr2[i] = arr1[i];
//		}
		
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);

		for (int i = 0 ; i < arr2.length ; i++) {
			System.out.print(arr2[i] + " ");
		}
		

	}

}
