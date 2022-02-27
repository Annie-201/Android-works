package Genpact_Day_2;

class MyProtein{
	MyProtein(){
		System.out.println("Human body requires protein");
	}
	
	MyProtein(String s){
		System.out.println(s+" is necessary for hair, eyes and muscles");
	}
}

class Sources extends MyProtein{
	Sources(){
		System.out.println("Sources of protein are fish, milk and eggs");
		
	}
	Sources(String s){
		super();
		System.out.println(s+" is also a good source of protein");
	}
}
public class Protein {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sources s = new Sources();
		Sources s1 = new Sources("Chicken");
		Protein p1 = new Protein("Bread");
		
	}

}