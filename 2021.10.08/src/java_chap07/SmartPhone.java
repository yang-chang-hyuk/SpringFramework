package java_chap07;

public class SmartPhone extends Phone {
	public SmartPhone(String owner) {
		super(owner);
	}
	
	public void intermetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
}
