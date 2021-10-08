package java_chap07;

//	필드 : 이메일주소, SNS
//	메서드 : outputAllInfo, outputEmail, outputSns, outputPhoneNumber
public class AddressBook extends PhoneBook {
//	String name;
//	String phone;
	String email;
	String sns;
	
//	public void outputPhoneNumber() {
//	System.out.println(name + "의 휴대폰 번호 : " + phone);
//	}
	
//	void가 앞에 붙은건 메서드다
	
	public void outputEmail() {
		System.out.println(name + "의 이메일 : " + email);
	}
	
	public void outputSns() {
		System.out.println(name + "의 SNS : " + sns);
	}
	
	public void outputAllInfo() {
		outputPhoneNumber();
		outputEmail();
		outputSns();
	}
}
