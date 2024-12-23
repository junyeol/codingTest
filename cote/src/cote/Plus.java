package cote;

public class Plus {
	
	//한 자리 정수로 이루어진 문자열 num_str이 주어질 때, 
	//각 자리수의 합을 return하도록 solution 함수를 완성해주세요.
	
	    public int solution(String num_str) {
	        int answer = 0;

	        // num_str의 길이만큼 돌면서
	        //정수로 변환시킨 후 합 구하기
	        for (int i = 0; i < num_str.length(); i++) {
	            answer += Character.getNumericValue(num_str.charAt(i));
	        }

	        return answer;
	    }
	}


