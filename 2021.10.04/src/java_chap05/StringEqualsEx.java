package java_chap05;

public class StringEqualsEx {
	
// equals 메소드는 비교하고자 하는 대상의 내용 자체를 비교하지만, == 연산자는 비교하고자 하는 대상의 주소값을 비교합니다.



	public static void main(String[] args) {
		String strVal1 = "홍길동";
		String strVal2 = "홍길동";
		
		if (strVal1 == strVal2) {
			System.out.println("strVal1과 strVal2는 참조가 같음");
		}
		else {
			System.out.println("strVal1과 strVal2는 참조가 다름");
		}
		
		if (strVal1.equals(strVal2)) {
			System.out.println("strVal1과 strVal2는 문자열이 같음");
		}
		
		String strVal3 = new String("홍길동");
		String strVal4 = new String("홍길동");
		
		if (strVal3 == strVal4) {
			System.out.println("strVal3과 strVal4는 참조가 같음");
		}
		else {
			System.out.println("strVal3과 strVal4는 참조가 다름");
		}
		
		if (strVal3.equals(strVal4)) {
			System.out.println("strVal3과 strVal4는 문자열이 같음");
		}

	}

}
