package lesson.num03;

/*
 * codility - lesson3 FrogJmp
 * expected worst-case time complexity is O(1);
 * expected worst-case space complexity is O(1).
 */
/**
 * @author tildev
 * @data 2018. 6. 17.
 */
public class FrogJmp {
	public int solution(int X, int Y, int D) {
		int diff = Y - X;

		return diff % D == 0 ? (diff / D) : (diff / D) + 1;
	}

	public static void main(String[] args) {
		int X = 10;
		int Y = 85;
		int D = 30;
		int result = new FrogJmp().solution(X, Y, D);
		System.out.println(result);
	}
}
