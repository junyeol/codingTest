package cote;

public class Meat_drink {
	
	/*
	 * 머쓱이네 양꼬치 가게는 10인분을 먹으면 음료수 하나를 서비스로 줍니다. 
	 * 양꼬치는 1인분에 12,000원, 음료수는 2,000원입니다.
	 * 정수 n과 k가 매개변수로 주어졌을 때, 양꼬치 n인분과 음료수 k개를 먹었다면
	 * 총얼마를 지불해야 하는지 return 하도록 solution 함수를 완성해보세요.
	 */
	    public int solution(int n, int k) {
	        int answer = 0;

	        // 양꼬치 가격 계산
	        int meat = n * 12000;
	        
	        // 음료수 기본 가격 계산
	        int drink = k * 2000;
	        
	        // 양꼬치가 10인분 이상인 경우에만 무료 음료수 적용
	        if (n >= 10) {
	            // 10인분마다 음료수 1개가 무료로 제공
	            int freeDrinks = n / 10;
	            
	            // 음료수 개수 k에서 무료 음료수 수를 뺀 후, 남은 음료수에 대해서만 요금을 부과
	            if (k > freeDrinks) {
	                drink = (k - freeDrinks) * 2000;
	            } else {
	                // 음료수가 무료로 제공되는 개수보다 적으면, 음료수 비용을 0으로 처리
	                drink = 0;
	            }
	        }

	        // 양꼬치와 음료수 가격 합산
	        answer = meat + drink;
	        
	        return answer;
	    }
	}


