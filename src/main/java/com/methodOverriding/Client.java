package com.methodOverriding;

public class Client {

	public static void main(String[] args) throws Throwable {
		P p = new P();
		p.m1();
		p.m2();
		p.m3();
		p.m4();
		System.out.println(p.s);		//Parent
		
		System.out.println("----");
		
		C c = new C();
		c.m1();
		c.m2();
		c.m3();
		c.m4(1);
		System.out.println(c.s);		//Child
		
		System.out.println("----");
		
		P p1 = new C();
		p1.m1();	//at compile time compiler check if ref variable class has m1() or not if not gives C.E
					//at runtime JVM calls runtime object method.
		p1.m2();
		p1.m3();
		p1.m4();
		System.out.println(p1.s);		//Parent
		
		//object type casting
		Number o = new Integer(10);
		Object sb = (Object)o;
		
		
//		String s = new String("abc");
//		StringBuffer s1 = (StringBuffer)s;
		System.out.println(o+" "+sb);
	}

}
