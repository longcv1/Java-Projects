package edu.study.oop;

/*****
 * 1. abstract vs interface
 *   - abstract to archive polymorphism as well as inheritance
 *   - interface is completely used for archiving polymorphism. It does not have anything to give the subclasses
 * 2. final:
 *   - final variable: CAPITAL, like constant
 *   - final method: cannot be overridden in derived classes => cannot apply with abstract methods or interfaces
 *   - final class: cannot be extended
 * */


interface Test{
	void method1();
	void method2();
	public static final int x = 0;
	public static void method3() {
		
	}
	default void method4() {} //=> java 8
	private void method5() {} //=> java 9
}

interface Test1 extends Test{
	
}


interface Test2 extends Test {
	
}

class ConcreteClass implements Test{
	
	static int x = 10;
	ConcreteClass(int val){
		this.x = val;
	}
	
	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}
}

public class Interface {
	public static void main(String[] arg) {
		
	}
}
