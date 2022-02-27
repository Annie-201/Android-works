package Genpact_Day_2;

public class Items {

	String laptop;
	String jeans;
	String mobile;
	String shoes;
	
	
	public Items(String laptop, String jeans, String mobile, String shoes) {
		super();
		this.laptop = laptop;
		this.jeans = jeans;
		this.mobile = mobile;
		this.shoes = shoes;
	}


	public void display(){
		System.out.println(" Items Catalogue : ");
		System.out.println(" Available Laptops = "+laptop );
		System.out.println(" Available jeans = "+jeans);
		System.out.println(" Available Mobiles = "+mobile);
		System.out.println(" Available Shoes = "+ shoes);
		
		
	}
	
	
}