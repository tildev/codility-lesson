/**
 * 
 */
package lesson.num03;

/*
 * codility - lesson3 TapeEquilibrium
 * expected worst-case time complexity is O(N);
 * expected worst-case space complexity is O(N) (not counting the storage required for input arguments).
 */
/**
 * @author tildev
 * @data 2018. 6. 18.
 */
public class TapeEquilibrium {
	public int solution(int[] A) {
		int aLen = A.length;
		long leftSum = 0;
		long rightSum = 0;

		for (int i = 0; i < aLen; i++) {
			rightSum += A[i];
		}
		long minDiff = Integer.MAX_VALUE;
		long diff = 0;
		for (int i = 0; i < aLen - 1; i++) {
			leftSum += A[i];
			rightSum -= A[i];

			diff = Math.abs(leftSum - rightSum);
			if (diff < minDiff) {
				minDiff = diff;
			}
		}
		return (int) minDiff;
	}

	public static void main(String[] args) {
		int[] A = { -1000, 1000 };
		// int[] A = { 3, 1, 2, 4, 3 };
		int i = new TapeEquilibrium().solution(A);
		System.out.println(i);
	}
}
