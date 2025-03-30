package cote;

public class Num {

	//정수 num과 n이 매개 변수로 주어질 때,
	//num이 n의 배수이면 1을 return n의 배수가 아니라면 0을 
	//return하도록 solution 함수를 완성해주세요.
	
	 public int solution(int num, int n) {
	        int answer = 0;//기본 0

	        if(num % n == 0){//num을 n으로 나누었을때 0이라면
	            return 1;//1 리턴
	        }

	        return answer;
	    }
}
