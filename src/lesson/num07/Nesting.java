/**
 * 
 */
package lesson.num07;

/*
 * codility - lesson7 Brackets
 * expected worst-case time complexity is O(N);
 * expected worst-case space complexity is O(1) (not counting the storage required for input arguments).
 */
/**
 * @author tildev
 * @data 2018. 7. 17.
 */
public class Nesting {
	public int solution(String S) {
		int count = 0;
		for (char c : S.toCharArray()) {
			if (c == '(') {
				count += 1;
			} else {
				if (count == 0) {
					return 0;
				}
				count -= 1;
			}
		}
		return count == 0 ? 1 : 0;
	}

	public static void main(String[] args) {
		String s = "(()(())())";
		int result = new Nesting().solution(s);
		System.out.println(result);
	}
}
