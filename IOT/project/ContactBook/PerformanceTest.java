package performanceTest;

/**
 * @author MelissaG
 *1차 수행평가 시험일 : 2018-01-04
실습 예제
다음 조건으로 배열의 숫자를 정렬하여 출력하는 어플리케이션을 작성하세요.
- 1에서 100 사이의 랜덤한 정수 40개를 생성하여 배열에 저장한다.
- 정렬전의 배열과 정렬 후의 배열을 출력한다.
- Call By Reference를 이용하여 배열의 내용을 갱신한다.
평가기준
• 자바 언어의 기본 테이터 타입과 참조 타입 이해도 점검
• Call By Value와 Call By Reference 차이점에 대한 이해도 점검
• 배열 타입의 이용 능력 점검
• 다중 반복문의 활용 능력 점검
 */

public class PrintSortedArray {
	public static void main(String[] args) {
		int num = (int)(Math.random()*101+1);
		System.out.println(num);
	}
}
