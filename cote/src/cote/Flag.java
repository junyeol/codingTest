package cote;

public class Flag {

	/*두 정수 a, b와 boolean 변수 flag가 매개변수로 주어질 때, 
	 * flag가 true면 a + b를 false면 a - b를 return 하는 
	 * solution 함수를 작성해 주세요.
	 */
	
	    public int solution(int a, int b, boolean flag) {

	        int answer = 0;
	        
	        if(flag==true){//flag가 ture라면
	            answer = a+b;//a+b
	        }
	        else{
	            answer = a-b;//false라면 a-b
	        }
	        
	        return answer;
	    }
	}

