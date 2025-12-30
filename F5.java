package Day1;
import java.util.Arrays;
public class F5 {
public static void main(String args[]) {
	
	int[] arr = {1,2,3,4,5,6};
	
	int n = arr.length;
	
	int k = 2;
	
	int[] reversed = new int[n];
	
	int j = 0 ;
	for (int i =n-1;i >= 0 ;i--) {
		reversed[j] = arr[i];
		
		++j;
		
		
	}
	System.out.println(Arrays.toString(arr));
	System.out.println(Arrays.toString(reversed));
}
}
