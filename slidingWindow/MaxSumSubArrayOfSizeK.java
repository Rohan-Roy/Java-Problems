package slidingWindow;

public class MaxSumSubArrayOfSizeK {
  public static int findMaxSumSubArray(int k, int[] arr) {
    int maxSum = 0;
    int runningSum = 0;

    for (int i = 0; i < arr.length; i++) {
      runningSum += arr[i];
      if (i >= k - 1) {
        maxSum = Math.max(maxSum, runningSum);
        runningSum -= arr[i - k + 1];
      }
    }
    return maxSum;
  }

  public static void main(String... args){
    System.out.println(findMaxSumSubArray(3, new int[]{2,1,5,1,3,2}));//9
    System.out.println(findMaxSumSubArray(2, new int[]{2,3,4,1,5}));//7
  }
}