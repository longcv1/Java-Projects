package edu.study.oop;

/*
 * this -> current obj
 * super -> previous obj
 * They common used in inheritance (constructor)
 * 
 * 2. Dynamic Method Dispatch:
 *  Exp: Super s = new Sub();
 *       -> s: ref to obj
 *       -> new Sub() : obj
 *  It means that ref "s" can only access methods belongs to Super class and methods overridden in Sub class.
 *  Because application decides which methods called at run-time
 * */

class Rectangle{
	private int length;
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	private int breadth;
	public Rectangle(int length, int breadth) {
		super();
		System.out.println("[Rectangle] Constructor...!");
		this.length = length;
		this.breadth = breadth;
	}
}

class Cuboid extends Rectangle{

	int height;
	public Cuboid(int length, int breadth, int height) {
		super(length, breadth);
		System.out.println("[Cuboid] Constructor...!");
		this.height = height;
		// TODO Auto-generated constructor stub
	}
	void Display() {
		System.out.println(super.getLength() + super.getBreadth() + this.height);
	}
}

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Rectangle rec = new Rectangle(10,20);
		Cuboid cu = new Cuboid(1, 2, 3);
		cu.Display();
	}

}
