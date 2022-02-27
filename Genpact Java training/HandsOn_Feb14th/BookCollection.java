package Genpact_Day_4;

import java.util.TreeSet;

class Book implements Comparable<Book>{
	int id,price ,quantity;
	String book,author,publisher;
	public Book(int id, int price, int quantity, String book, String author, String publisher) {
		super();
		this.id = id;
		this.price = price;
		this.quantity = quantity;
		this.book = book;
		this.author = author;
		this.publisher = publisher;
	}
	
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		if(price<o.price)
			return 1;
		else if(price>o.price)
			return -1;
		else 
			return 0;
	}
	
}

public class BookCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Book> t =new TreeSet<>();
		
		Book b= new Book(101, 250, 5, "Rich dad poor dad", "Robert kiwoski", "Arya" );
		Book b1= new Book(102, 550, 3, "Operating system", "Galvin", "WILEY INDIA" );
		Book b2= new Book(103, 750, 8, "Thinking in Java", "Bruce Eckel", "Pearson Education" );
		Book b3= new Book(104, 1000, 14, "C++ Primer", "Stanley B. Lippman", "Addison-Wesley Professional" );
		Book b4= new Book(105, 180, 10, "Object-Oriented Programming", "Robert Lafore ", "Que Publishing" );
		t.add(b);t.add(b1);t.add(b2);t.add(b3);t.add(b4);
		for(Book i : t) {
			System.out.println("Highest price book name is : "+i.book+" and Author "+i.author);
			
			
		}
	}

}