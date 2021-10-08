package java_chap07;

//	필드 : 이름, 휴대폰번호
//	메서드 : outputPhoneNumber
public class PhoneBook {
	String name;
	String phone;
	
	public void outputPhoneNumber() {
		if (isPhoneNumber()) {
			System.out.println(name + "의 전화 번호 : " + phone);
		}
		else {
			System.out.println(name + "의 전화번호가 없습니다.");
		}
	}

//	접근제한자 private를 사용했으므로 외부 호출 불가 / 객체 내부에서만 사용됨
//	상속도 되지 않음
	private boolean isPhoneNumber() {
		if (phone.equals("") || phone == null) {
//			equals 메소드는 비교하고자 하는 대상의 내용 자체를 비교하지만
//			== 연산자는 비교하고자 하는 대상의 주소값을 비교합니다
			return false;
		}
		else {
			return true;
		}
	}

}
