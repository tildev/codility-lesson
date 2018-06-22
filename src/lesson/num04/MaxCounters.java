package lesson.num04;

import java.util.Arrays;

/*
 * codility - lesson4 MaxCounters
 * expected worst-case time complexity is O(N+M);
 * expected worst-case space complexity is O(N) (not counting the storage required for input arguments).
 */
/**
 * @author tildev
 * @data 2018. 6. 22.
 */
public class MaxCounters {
	public int[] solution(int N, int[] A) {
		int[] result = new int[N];

		return result;
	}
	
	/**
	 *  TIMEOUT ERROR 
	 * 
	 * @param N
	 * @param A
	 * @return
	 */
	public int[] solutionTimeOut(int N, int[] A) {
		int[] result = new int[N];
		int maxValue = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] >= 1 && A[i] <= N) {
				result[A[i] - 1]++;
				if (maxValue < result[A[i] - 1]) {
					maxValue = result[A[i] - 1];
				}
			} else if (A[i] == N + 1) {
				Arrays.fill(result, maxValue);
			}
		}
		
		return result;
	}

	public static void main(String[] args) {
		// int[] A = { 4, 1, 3 };
		int N = 5;
		int[] A = { 3, 4, 4, 6, 1, 4, 4 };
		int[] result = new MaxCounters().solution(N, A);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}
