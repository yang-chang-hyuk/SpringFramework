package java_chap06;

public class PersonEx {

	public static void main(String[] args) {
		Person p1 = new Person("123456 - 1234567", "계백");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
//		p1.nation = "usa";
//		p1.ssn = "987654 - 9876543";
//		final 키워드로 더이상 수정이 불가능 하도록 지정해서 애러뜸
		p1.name = "을지문덕";
		System.out.println(p1.name);
	}

}
