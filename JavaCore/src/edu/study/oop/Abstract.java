package edu.study.oop;


/***
 * 1. Ref of abstract class is allowed (Exp: Abstract abst) But instantiation of it is not allowed
 * 2. A class has at least 1 abstract method. It becomes abstract class.
 * 3. When abstract method is declared, it must be overridden in sub sclasses.
 * 4. Rules of abstract keyword:
 *   - Impossible to have final in abstract class (because its methods need to be overridden)
 *   - Abstract class must not have static
 * */

abstract class Super
{
	Super(){
		System.out.println("[Super] Constructor");
	}
	protected void display() {
		System.out.println("Super->display");
	}
	abstract void method1();
}

class Sub extends Super
{
	Sub(){
		System.out.println("[Sub] Constructor");
	}

	@Override
	protected void method1() {
		// TODO Auto-generated method stub
		System.out.println("Sub->method1");
	}
}

public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ABSTRACT");
		//Super s = new Super(); // Error
		Super s; // OK
		Sub sub = new Sub();
		sub.display();
		s = new Sub();
		s.method1();
	}

}
