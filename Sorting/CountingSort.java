package Sorting;

import java.util.*;
import java.lang.*;
import java.io.*;
class CountingSort
 {
	public static void main (String[] args)
	 {
	     Scanner sc = new Scanner(System.in);
	     int t = sc.nextInt();
	     int[] nums;
	     String[] str;
	     int index = 0;
	   //  String[] nums = new String[];
	     int vals;
	     
	     for(int i=0; i< t; i++){
	         sc.skip("(\r\n|[\r\n\u2028\u2029\u0085])?");
	         str = sc.nextLine().replaceAll("\\s+"," ").split(" ");
	         nums = new int[str.length];
	         for(String c: str)
	         nums[index++] = Integer.parseInt(c);
	         
	         for(int val: quickSort(nums))
	         System.out.print(val+" ");
	         System.out.println();
	         index = 0;
	     }
	 //code
	 }
	 
	 
	 static int[] quickSort(int[] arr){
	     int[] count = new int[1000];
	     int[] res = new int[arr.length];
	     int ix = 0;
	     
	     //calculating the number of elements in the count array
	     for(int i: arr)
	     count[i]++;
	     
	     //adding values of previous elements in the count array to find the proper index
	     for(int j= 1; j<count.length; j++)
	     count[j] += count[j-1];
	     
	     //sorting the array according the right indices
	     for(int k=0; k<arr.length; k++){
	         ix = count[arr[k]];
	         res[ix-1] = arr[k];
	         count[arr[k]]--;
	     }
	     
	     return res;
	 }
	 
}
