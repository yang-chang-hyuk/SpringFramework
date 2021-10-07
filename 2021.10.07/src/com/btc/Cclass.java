package com.btc;

import com.btc.hankook.*;

public class Cclass {

	public static void main(String[] args) {
		Aclass a1 = new Aclass();
		a1.output();
//		a1.print();
		a1.outputPrint();
//		a1.defaultPrint();
//		a1.protectedPrint();
		
//		동일한 패키지가 아니기때문에 defaultPrint, protectedPrint 볼 수 없음
		
		System.out.println("---------------------");
		ExtendClass ec = new ExtendClass();
		ec.output();

	}

}
