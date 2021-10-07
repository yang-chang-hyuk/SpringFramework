package com.btc.hankook;

public class DefaultClass {

	public static void main(String[] args) {
			Aclass a1 = new Aclass();
			a1.output();
//			a1.print();
			a1.outputPrint();
	//	동일한 패키지에서만 default, protected 메서드를 볼 수 있음
			a1.defaultPrint();
			a1.protectedPrint();

	}

}
