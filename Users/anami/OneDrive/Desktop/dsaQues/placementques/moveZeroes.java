import java.util.*;
public class Solution {
	public static void pushZerosAtEnd(ArrayList<Integer> arr){
		// Write your code here.
		int k =0;
		for(int i =0; i < arr.size(); i++){
			if(arr.get(i) != 0){
				arr.set(k++, arr.get(i));
			}
		}
		while(k < arr.size()){
			arr.set(k++, 0);
		}
	}
}