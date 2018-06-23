package lesson.num06;

import java.util.Arrays;

/*
 * codility - lesson6 MaxProductOfThree
 * expected worst-case time complexity is O(N*log(N));
 * expected worst-case space complexity is O(1) (not counting the storage required for input arguments).
 */
/**
 * @author tildev
 * @data 2018. 6. 23.
 */
public class MaxProductOfThree {
	public int solution(int[] A) {
		Arrays.sort(A);

		int max1 = A[A.length - 1] * A[A.length - 2] * A[A.length - 3];
		int max2 = A[0] * A[1] * A[A.length - 1];
		return max1 < max2 ? max2 : max1;
	}

	public static void main(String[] args) {
		int A[] = { -3, 1, 2, -2, 5, 6 };
		int result = new MaxProductOfThree().solution(A);
		System.out.println(result);
	}
}
