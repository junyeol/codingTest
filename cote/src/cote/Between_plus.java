package cote;

public class Between_plus {

	
	/*
	 * 두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수,
	 *  solution을 완성하세요.
		예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다
	 */
	
	    public long solution(int a, int b) {
	        long answer = 0;

	        // 작은 값을 start, 큰 값을 end로 설정
	        // 작은 값이 a가 될 수 있고 b도 될 수 있음
	        int start, end;
	        if (a < b) {
	            start = a;
	            end = b;
	        } else {
	            start = b;
	            end = a;
	        }

	        //작은 값부터 시작해서 큰값까지의 for문
	        //총합을 구함
	        for (int i = start; i <= end; i++) {
	            answer += i;
	        }

	        return answer;
	    }
	}

	

