package lesson.num01;

/*
 * 연속적인 0 의 최대 갯수 구하라. 갭이 포함되어 있지 않을 경우 0을 반환
 * 최악 시간 복잡도 O(log(N)) 최악 공간 복잡도 O(1)
 */
/**
 * @author tildev
 * @data 2018. 4. 2.
 */
public class BinaryGap {
	public int solution(int N) {
		String bi = Integer.toBinaryString(N);
		int maxCount = 0;
		int count = 0;
		for (int i = 0; i < bi.length(); i++) {
			if (bi.charAt(i) == '0') {
				count++;
			} else {
				if (maxCount < count) {
					maxCount = count;
				}
				count = 0;
			}
		}
		return maxCount;
	}

	public int solution0(int N) {
		int maxCount = 0;
		int count = 0;
		boolean status = false;
		while (N > 0) {
			if (N % 2 == 0) {
				if (status)
					count++;
			} else {
				status = true;
				if (maxCount < count) {
					maxCount = count;
				}
				count = 0;
			}
			N = N / 2;
		}
		return maxCount;
	}

	public static void main(String[] args) {
		int N = 1041;
		System.out.println(new BinaryGap().solution0(N));
	}
}
