package Genpact_Day_2;

class Parent{
	void imple()
	{
		System.out.println("This is parent class");
	}
}
 class Child extends Parent{
	 void defini()
	 {
		 System.out.println("this is child class");
	 }
	 
 }



public class inheritance{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p1=new Parent();
		p1.imple();
		
		Child c=new Child();
		c.imple();
		c.defini();
		
		Parent p=new Child();
		p.imple();
	}

}