package lesson.num06;

import java.util.Arrays;

/*
 * codility - lesson6 Triangle
 * expected worst-case time complexity is O(N*log(N));
 * expected worst-case space complexity is O(N) (not counting the storage required for input arguments).
 */
/**
 * @author tildev
 * @data 2018. 6. 24.
 */
public class Triangle {
	public int solution(int[] A) {
		Arrays.sort(A);

		for (int i = 0; i < A.length - 2; i++) {
			if ((long)A[i] + (long)A[i + 1] > A[i + 2]) {
				return 1;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		int A[] = { 10, 50, 5, 1 };
		// int A[] = { 10, 2, 5, 1, 8, 20 };
		int result = new Triangle().solution(A);
		System.out.println(result);
	}
}
