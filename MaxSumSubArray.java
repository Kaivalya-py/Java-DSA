import java.util.*;
class MaxSumSubArray {
	static int maxSumSubArray(int[] nums) {
		int maxTillNow = nums[0];
		int maxEnd = 0;
        int n = nums.length;
        if(n==1)
            return (nums[0]);
		for (int i = 0; i < nums.length; i++) {
			maxEnd += nums[i];
            if (maxEnd < 0)
				maxEnd = 0;
            else if (maxTillNow<maxEnd)
				maxTillNow = maxEnd;
		}
		Arrays.sort(nums);
        if(nums[n-1]<0)
            return(nums[n-1]);
        return(maxTillNow);  
	}

	static int maxSubArrayOpt(int[] nums) {
        int sum = 0;
        int max_sum = nums[0];
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            max_sum = sum > max_sum ? sum : max_sum;
            if(sum < 0)
                sum = 0;
        }

        return max_sum;
    }

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = inp.nextInt();
		}
		System.out.println(maxSumSubArray(arr));
		inp.close();
	}
}