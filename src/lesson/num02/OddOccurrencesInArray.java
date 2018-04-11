/**
 * 
 */
package lesson.num02;

import java.util.HashSet;
import java.util.Set;

/*
 * codility - lesson2 OddOccurrencesInArray
 * 최악 시간 복잡도 O(N) 최악 공간 복잡도 O(1)
 */
/**
 * @author tildev
 * @data 2018. 4. 11.
 */
public class OddOccurrencesInArray {
	public int solution(int[] A) {
		Set<Integer> setV = new HashSet<>();

		for (int i : A) {
			if (setV.contains(i)) {
				setV.remove(i);
			} else {
				setV.add(i);
			}
		}
		return setV.iterator().next();
	}
	
	public int solution1(int[] A) {
		int result = 0;
		for (int i : A) {
			result = result ^ i;
		}
		return result;
	}
	
	public static void main(String[] args) {
		int []A = {3,9,3,9,7};
		int i  = new OddOccurrencesInArray().solution(A);
		System.out.println(i);
	}
}
