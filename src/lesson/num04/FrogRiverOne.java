package lesson.num04;

import java.util.HashSet;
import java.util.Set;

/*
 * codility - lesson4 FrogRiverOne
 * expected worst-case time complexity is O(N);
 * expected worst-case space complexity is O(X) (not counting the storage required for input arguments).
 */
/**
 * @author tildev
 * @data 2018. 6. 20.
 */
public class FrogRiverOne {
	public int solution(int X, int[] A) {
		Set<Integer> leaves = new HashSet<>();

		for (int i = 0; i < A.length; i++) {
			if (A[i] <= X) {
				leaves.add(A[i]);

				if (leaves.size() == X) {
					return i;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int X = 5;
		int[] A = { 1, 2, 1, 4, 2, 3, 5, 4 };
		int result = new FrogRiverOne().solution(X, A);
		System.out.println(result);
	}
}
