package cote;

public class C {

	//정수 num1, num2가 매개변수로 주어질 때, 
	//num1을 num2로 나눈 몫을 return 하도록 solution 함수를 완성해주세요.
	//C++
	
	
	int solution(int num1, int num2) {
	    int answer = num1 / num2;  // num1을 num2로 나눈 몫을 구합니다.
	    return answer;  // 몫을 반환
	}

	int main() {
	    int num1 = 10, num2 = 3;
	    cout << solution(num1, num2) << endl;
	    return 0;
	}
}
