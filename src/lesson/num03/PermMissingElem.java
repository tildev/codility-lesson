/**
 * 
 */
package lesson.num03;

/*
 * codility - lesson3 PermMissingElem
 * expected worst-case time complexity is O(N);
 * expected worst-case space complexity is O(1) (not counting the storage required for input arguments).
 */
/**
 * @author tildev
 * @data 2018. 6. 17.
 */
public class PermMissingElem {
	public int solution(int[] A) {
		if (A == null || A.length == 0) {
			return 1;
		}
		long aLen = A.length + 1;
		int sum = (int) (aLen * (aLen + 1) / 2);
		int arrSum = 0;
		for (int i = 0; i < A.length; i++) {
			arrSum += A[i];
		}
		return sum - arrSum;
	}

	public int solution1(int[] A) {
		int sum = 0;
		for (int i = 1; i <= A.length; i++) {
			sum += (i - A[i - 1]);
		}
		return sum + A.length + 1;
	}

	public static void main(String[] args) {
		int[] A = { 2, 3, 1, 5 };
		int i = new PermMissingElem().solution1(A);
		System.out.println(i);
	}
}
