package lesson.num04;

/*
 * codility - lesson4 MissingInteger
 * expected worst-case time complexity is O(N);
 * expected worst-case space complexity is O(N) (not counting the storage required for input arguments).
 */
/**
 * @author tildev
 * @data 2018. 6. 20.
 */
public class MissingInteger {
	public int solution(int[] A) {

		int[] result = new int[A.length + 1];
		for (int i = 0; i < A.length; i++) {
			if (A[i] > 0 && A[i] <= A.length) {
				result[A[i] - 1]++;
			}
		}
		for (int i = 0; i < result.length; i++) {
			if(result[i]==0) {
				return i+1;
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		int[] A = { -1,-3 };
//		int[] A = { 1, 3, 6, 4, 1, 2 };
		int result = new MissingInteger().solution(A);
		System.out.println(result);
	}
}
