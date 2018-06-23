package lesson.num06;

import java.util.HashSet;
import java.util.Set;

/*
 * codility - lesson6 Distinct
 * expected worst-case time complexity is O(N*log(N));
 * expected worst-case space complexity is O(N) (not counting the storage required for input arguments).
 */
/**
 * @author tildev
 * @data 2018. 6. 23.
 */
public class Distinct {
	public int solution(int[] A) {
		Set<Integer> set = new HashSet<>();

		for (int a : A) {
			set.add(a);
		}
		return set.size();
	}

	public static void main(String[] args) {
		int A[] = { 2, 1, 1, 2, 3, 1 };
		int result = new Distinct().solution(A);
		System.out.println(result);
	}
}
