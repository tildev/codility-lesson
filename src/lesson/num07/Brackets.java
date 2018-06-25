package lesson.num07;

import java.util.Stack;

/*
 * codility - lesson7 Brackets
 * expected worst-case time complexity is O(N);
 * expected worst-case space complexity is O(N) (not counting the storage required for input arguments).
 */
/**
 * @author tildev
 * @data 2018. 6. 25.
 */
public class Brackets {
	public int solution(String S) {
		Stack<Character> st = new Stack<>();
		char impPeek;
		for (char c : S.toCharArray()) {
			if (c == '(' || c == '[' || c == '{') {
				st.push(c);
			} else {
				if (st.empty()) {
					return 0;
				}
				impPeek = st.pop();
				if (c == ')' && impPeek == '(') {
					continue;
				} else if (c == ']' && impPeek == '[') {
					continue;
				} else if (c == '}' && impPeek == '{') {
					continue;
				} else {
					return 0;
				}
			}
		}
		if (st.isEmpty()) {
			return 1;
		}
		return 0;
	}

	public static void main(String[] args) {
		String s = "([)()]";
		// String s = "{[()()]}";
		int result = new Brackets().solution(s);
		System.out.println(result);
	}
}
