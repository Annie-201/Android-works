package Bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Get_Connection{

public static Connection getConnection() {

Connection con =null;{

try {

//step 1

Class.forName("com.mysql.cj.jdbc.Driver");


System.out.println("Connection..");
//step 2

con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank_Details", "root", "Anni201"); 
System.out.println("Connection established");

//step 3


}catch(ClassNotFoundException e) {

e.printStackTrace();

} catch (SQLException e) {
}
return con;
}
}
}