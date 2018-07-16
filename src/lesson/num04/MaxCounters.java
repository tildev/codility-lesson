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

		int max = 0;
		int maxValue = 0;

		for (int i = 0; i < A.length; i++) {
			if (A[i] >= 1 && A[i] <= N) {
				// max가 result[i] 값 이상이라는 것은 max 값이 정해졌다는 것.
				// (A[i] == N + 1 조건이 통과되었다는 것.)
				// A[i] == N + 1 이면, A[i] = max counter 라는 조건에 따라
				// result[i] 의 값을 max 값으로 맞춰줌과 동시에 +1 을 해주자.
				if (result[A[i] - 1] < max) {
					result[A[i] - 1] = max + 1;
				} else {
					result[A[i] - 1]++;
				}
				if (maxValue < result[A[i] - 1]) {
					maxValue = result[A[i] - 1];
				}
			} else if (A[i] == N + 1) {
				max = maxValue;
			}
		}

		// A[i] = N + 1 이면, A[i] 값은 max counter.
		// result[i] 가 max 값 미만 이라는 것은 위에서 해당 index 에 max값 반영을 해주지 않았음을 알려준다.
		for (int i = 0; i < N; i++) {
			if (result[i] < max) {
				result[i] = max;
			}
		}

		return result;
	}

	/**
	 * TIMEOUT ERROR
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
