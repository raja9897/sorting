package sorting;
//
//public class BubbleSort {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}
public class BubbleSort {

	public static void main(String[] args) {
		 int arr[] = {4,7,1,8,9,5,6};
		 int s = arr.length;
		 int temp = 0;  
         for(int i=0; i < s; i++){  
                 for(int j=1; j < (s-i); j++){  
                          if(arr[j-1] > arr[j]){  
                                 //swap elements  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
         }
         for(int i = 0;i<s;i++) {
        	 System.out.println(arr[i]+" ");
         }

	}

}