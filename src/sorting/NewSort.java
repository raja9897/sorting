package sorting;

//public class NewSort {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}
//
public class NewSort {
	public static void main(String[] args) {
		// Selection Sort
		int arr[] = {2,5,1,3,7,4};
		int n = arr.length;
		for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[index]){  
                    index = j;//searching for lowest index  
                }  
            }  
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        }
		
		for(int i = 0 ; i < n ; i++) {
			System.out.println(arr[i]+" ");
		}

	}


}