import java.util.Scanner;

class MaxSumSubArray {
	static int maxSumSubArray(int[] arr, int n) {
		int maxTillNow = arr[0];
		int maxEnd = 0;
		for (int i = 0; i < n; i++) {
			maxEnd += arr[i];
			if (maxEnd < 0)
				maxEnd = 0;
			else if (maxTillNow < maxEnd)
				maxTillNow = maxEnd;
		}
		return maxTillNow;
	}

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = inp.nextInt();
		}
		System.out.println(maxSumSubArray(arr, n));
		inp.close();
	}
}