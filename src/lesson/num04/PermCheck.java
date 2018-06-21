package lesson.num04;

/*
 * codility - lesson4 PermCheck
 * expected worst-case time complexity is O(N);
 * expected worst-case space complexity is O(N) (not counting the storage required for input arguments).
 */
/**
 * @author tildev
 * @data 2018. 6. 21.
 */
public class PermCheck {
	public int solution(int[] A) {
		int result[] = new int[A.length];
		for (int i = 0; i < A.length; i++) {
			if (A[i] <= A.length) {
				result[A[i] - 1]++;
			}
		}
		for (int i = 0; i < result.length; i++) {
			if (result[i] == 0) {
				return 0;
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		// int[] A = { 4, 1, 3 };
		int[] A = { 4, 1, 3, 2 };
		int result = new PermCheck().solution(A);
		System.out.println(result);
	}
}
