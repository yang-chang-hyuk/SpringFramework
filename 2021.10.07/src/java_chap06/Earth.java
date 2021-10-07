package java_chap06;

public class Earth {
//	final 필드에 값 대입하는 방법
//		필드를 선언과 동시에 데이터 초기화
//		생성자에서 데이터 초기화
	static final double EARTH_RADIUS = 6400;
	final static double EARTH_SURFACE_AREA;
	
//	정적블럭(static 블럭) : 정적 멤버를 초기화하기 위한 일종의 생성자
//	상수를 초기화 하는 방법
//		상수를 선언과 동시에 데이터 초기화
//		정적 블럭을 사용하여 상수의 데이터 초기화
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
		//  Math.PI는 원의 원주를 지름으로 나눈 비율(원주율) 값으로 약 3.14159를 의미
	}
}
