package cote;

public class Age {
	
	//머쓱이는 선생님이 몇 년도에 태어났는지 궁금해졌습니다.
	//2022년 기준 선생님의 나이 age가 주어질 때, 
	//선생님의 출생 연도를 return 하는 solution 함수를 완성해주세요
	
	
	    public int solution(int age) {
	       //수학적으로 생각했을 때
	    	//먼저 나를 기준으로 2025년에 25살인 나는 2001년생
	    	//2025에서 내 나이를 빼고 1을 더하면 출생연도 구하기 가능
	        return 2022 - age + 1;
	    }
	}
