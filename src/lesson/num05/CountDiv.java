package lesson.num05;

/*
 * codility - lesson5 CountDiv
 * expected worst-case time complexity is O(1);
 * expected worst-case space complexity is O(1).
 */
/**
 * @author tildev
 * @data 2018. 6. 22.
 */
public class CountDiv {
	/**
	 * Time Out Error...
	 * @param A
	 * @param B
	 * @param K
	 * @return
	 */
	public int solution(int A, int B, int K) {
		int cnt = 0;
		
		for(int i =A; i<=B; i++) {
			if(i%K==0) {
				cnt ++;
			}
		}
		return cnt;
	}

	public static void main(String[] args) {
		int A = 11;
		int B = 345;
		int K = 17;
		int result = new CountDiv().solution(A, B, K);
		System.out.println(result);
	}
}
