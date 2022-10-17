package slidingWindow;

public class MinSizeSubArraySum {
    public static int findMinSubArray(int S, int[] arr) {
      int minSize = Integer.MAX_VALUE;
      int start = 0;
      int sum = 0;
      for(int i = 0; i < arr.length; i++){
        sum += arr[i];
        while(sum >= S){
          minSize = Math.min(minSize, i - start + 1);
          sum -= arr[start];
          start++;
        }
      }
  
      return minSize;
    }

    public static void main(String... args){
        System.out.println(findMinSubArray(7, new int[]{2,1,5,2,3,2}));//2
        System.out.println(findMinSubArray(7, new int[]{2,1,5,2,8}));//1
        System.out.println(findMinSubArray(8, new int[]{3,4,1,1,6}));//3
    }
  }
  