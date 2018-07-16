/**
 * 
 */
package lesson.num05;

/*
 * codility - lesson5 PassingCars
 * expected worst-case time complexity is O(N);
 * expected worst-case space complexity is O(1) (not counting the storage required for input arguments).
 */
/**
 * @author tildev
 * @data 2018. 7. 16.
 */
public class PassingCars {
	public int solution(int[] A) {
		int result = 0;
		int count = 0;
		for (int i = A.length - 1; i >= 0; i--) {
			if (A[i] == 0) {
				result += count;
			} else {
				count += 1;
			}
			if (result > 1000000000) {
				return -1;
			}
		}

		return result;
	}

	public static void main(String[] args) {
		int[] A = { 0, 1, 0, 1, 1 };
		int result = new PassingCars().solution(A);
		System.out.println(result);
	}
}
