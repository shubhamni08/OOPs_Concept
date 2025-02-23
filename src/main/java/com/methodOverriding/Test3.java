package com.methodOverriding;

class P12{
	void m1() throws Exception{
		
	}
	
	void m2() {
		
	}
}

class C12 extends P12{
	void m1() throws Exception{
		
	}
	
//	void m2() throws Exception{			//if child class method throws Exception compulsory parent class method should throw
//										//same checked exception or parent exception else you'll get C.E
//		
//	}
}


public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
