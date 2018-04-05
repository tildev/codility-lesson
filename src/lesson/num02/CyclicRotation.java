package lesson.num02;

/*
 * codility - lesson2 CyclicRotation
 */
/**
 * @author tildev
 * @data 2018. 4. 5.
 */
public class CyclicRotation {
	public int[] solution(int[] A, int K) {
		int arrLength = A.length;
		int[] result = new int[arrLength];

		if (arrLength == K)
			return A;

		for (int i = 0; i < arrLength; i++) {
			result[(i + K) % arrLength] = A[i];

		}
		return result;
	}

	public static void main(String[] args) {
		int A[] = { 2, 3, 4, 5, 7 };
		int k[] = new CyclicRotation().solution(A, 3);
		for (int i = 0; i < k.length; i++) {
			System.out.println(k[i]);
		}
	}
}
