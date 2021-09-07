package j;
import java.sql.*;
public class jd {
public static void main(String[] args) throws ClassNotFoundException, SQLException
{
	//org.h2.Driver
	//jdbc:h2:tcp://localhost/d:/new
Class.forName("org.h2.Driver");	
Connection c = DriverManager.getConnection("jdbc:h2:tcp://localhost/d:/new","sa","");
/*String sql = "insert INTO emp Values (?,?)";
PreparedStatement p =  c.prepareStatement(sql);
p.setInt(1, 1);
p.setString(2, "Shub");
p.setInt(1, 2);
p.setString(2, "asd");
p.executeUpdate();
String s = "Delete From emp where name = ?";

p=c.prepareStatement(s);
p.setString(1, "asd");
int i = p.executeUpdate();
System.out.println(i);
*/

PreparedStatement p = c.prepareStatement("Insert INTO  emp values (1,'shub')");
p.executeUpdate();
p = c.prepareStatement("Update  emp SET id = ?  where id =?");
p.setInt(1,5000);
p.setInt(2, 1);
String s = "";
p=c.prepareStatement("Select * from emp where id > ?");
p.setInt(1, 55);
ResultSet rs = p.executeQuery();
//int i = p.executeUpdate();
//System.out.println(i);
while(rs.next())
{
	System.out.println(rs.getInt(1)+" "+rs.getString(2));
}

}
}
