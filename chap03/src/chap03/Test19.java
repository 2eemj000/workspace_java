package chap03;

public class Test19 {

	public static void main(String[] args) {
		// 점수 초기값을 입력한다.
		int score = 90;
		// 결과 문자열을 초기화한다.
		String result ="";
		
		// 점수가 60점 이상인지 비교한다.
		if(score>=60) {
			//점수가 60점 이상이면 합격 문자열을 변수에 저장한다.
			result="합격";
		} else {
			result="불합격";
		}
		//결과 문자열을 화면에 출력한다.
		System.out.println(result);
	}

}
