/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
	    
	    int arr[] = new int[]{1, 1, 3, 1, 1, 1};
	    int i, j=arr.length - 1;
	    int res1 = 0, res2 = 0;
	    
	    for(i = 0; i != j; i++){
	        if(arr[i]!=arr[j]){
	        res1 = j-i;
	        break;
	        }
	    }
	    i = 0;
	    for(j = arr.length-1; j != i; j--){
	        if(arr[i]!=arr[j]){
	        res2 = j-i;
	        break;
	        }
	    }
	    
	    System.out.println(res1>res2?res1:res2);

	    
	    
// 	    int maxL = 0, maxS = 0;
// 	    maxL = arr[0];
// 	    for(int i=1; i<arr.length; i++)
// 	    {
// 	        if(arr[i]>maxL){
// 	            maxS = maxL;
// 	            maxL = arr[i];
// 	        }
	        
// 	    }
	    
// 		System.out.println(maxS);
	}
}
