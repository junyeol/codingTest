package cote;

public class Bacteria {

	/*어떤 세균은 1시간에 두배만큼 증식한다고 합니다. 
	 * 처음 세균의 마리수 n과 경과한 시간 t가 매개변수로 주어질 때 t시간 후
	 *  세균의 수를 return하도록 solution 함수를 완성해주세요.
	 * 
	 */
	
	    public int solution(int n, int t) {
	        int answer = 0;
	        //1시간에 2배씩 증식
	        //for문을 t만큼 돌려서
	        //n에 *2
	        
	        for (int i = 0; i < t; i++) {
	            n *= 2;  // 두배 증식
	        }
	        answer = n;
	        
	        return answer;
	    }
	}

