package cote;

public class Sum {
	/*
	테스트 내용
	아래 요구 사항에 따라 1에서 n까지 합을 구하는 서로 다른 알고리즘을 3가지 작성하세요.

	조건
	solution1, solution2, solution3 함수를 작성하면 됩니다.
	답안 중, 한 가지는 재귀호출을 적용해주세요.

	
	* 자바 문법으로 답안 작성
	* 함수 인자와 반환 값은 문제에 따라 적절하게 수정하여 제출
	*/
	
	/*
	 * 1부터 n까지 합을 구하는 3가지 방법
	 * 
	 * solution1: 반복문 사용 (O(n))
	 * solution2: 재귀 함수 사용 (O(n))
	 * solution3: 공식 사용 (O(1)) - 가우스 덧셈 공식 활용
	 */


	    // [방법 1] 반복문을 이용한 합산 (O(n))
	    public int solution1(int n) {
	        int sum = 0;
	        for (int i = 1; i <= n; i++) {
	            sum += i;
	        }
	        return sum;
	    }

	    // [방법 2] 재귀 호출을 이용한 합산 (O(n))
	    public int solution2(int n) {
	        if (n == 1) {
	            return 1; // 기저 조건 (Base Case)
	        }
	        return n + solution2(n - 1); // 재귀 호출
	    }

	    // [방법 3] 가우스 공식 활용 (O(1))
	    public int solution3(int n) {
	        return (n * (n + 1)) / 2;
	    }

	    public static void main(String[] args) {
	        Sum sol = new Sum();
	        int n = 10; // 테스트 값

	        // 각 솔루션 실행 및 출력
	        System.out.println("반복문 사용: " + sol.solution1(n));
	        System.out.println("재귀 호출 사용: " + sol.solution2(n));
	        System.out.println("공식 사용: " + sol.solution3(n));
	    
	}

}
