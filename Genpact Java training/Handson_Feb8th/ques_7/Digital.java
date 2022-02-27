package Genpact_Day_2;

class DigitalDemo{
	public void power(String p) {
		System.out.println("Power is "+p);
	}
	
	public void memory(String m) {
		System.out.println("Memory is "+m);
	}
}
class Laptop extends DigitalDemo{
	public void screensize(double s) {
		System.out.println("Screensize is "+s);
	}
	
	public void displayquality(String dq) {
		System.out.println("Display Quality is "+dq);
	}
}

class Ipad extends Laptop{
	public void color(String c) {
		System.out.println("Color is "+c);
	}
	
	public void model(String mo) {
		System.out.println("Model is "+mo);
	}
}

class ChromeBook extends Ipad{
	public void no_of_keys(int n) {
		System.out.println("Number of keys is "+n);
	}
}
	
public class Digital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeBook c1 = new ChromeBook();
		c1.power("5000mAh");
		c1.memory("1TB");
		c1.screensize(15.50);
		c1.displayquality("HD");
		c1.color("Black");
		c1.model("Dell Latitude 3420");
		c1.no_of_keys(5);
		

	}

}
