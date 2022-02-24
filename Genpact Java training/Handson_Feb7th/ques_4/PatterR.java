package Genpact_Day_1;

public class PatterR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int rows,col;
			for(rows=1;rows<=5;rows++)
	   {
		   for(col=1;col<=5;col++)
		   {
			   if(rows==1||rows==(5/2)+1||col==1||col==5)
			  
				   System.out.print("*");
			   
			   else 
				   System.out.print(" ");
			   
			  
		   }
		   System.out.println();
	   }
		}

	}