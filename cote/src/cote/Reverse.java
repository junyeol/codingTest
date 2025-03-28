package cote;

public class Reverse {

	/*
	 * 문자열 my_string이 매개변수로 주어집니다. 
	 * my_string을 거꾸로 뒤집은 문자열을 return하도록
	 * solution 함수를 완성해주세요.
	 */
	
	public String solution(String my_string) {
        // StringBuilder는 문자열을 효율적으로 조작할 수 있는 클래스입니다.
        StringBuilder sb = new StringBuilder();
        
        // 매개변수로 전달받은 문자열 my_string을 StringBuilder에 추가합니다.
        // 이 단계에서 my_string의 모든 문자가 sb에 저장됩니다.
        sb.append(my_string);
        
        // reverse() 메서드를 사용하여 StringBuilder 내부의 문자열 순서를 역순으로 뒤집습니다.
        // 이 메서드는 내부에서 문자열의 문자들을 뒤집어 새로운 순서로 재배열합니다.
        sb.reverse();
        
        // toString() 메서드를 호출하여, StringBuilder에 저장된 역순 문자열을 String 타입으로 반환합니다.
        return sb.toString();
    }
}