package My_SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Select_demo 
{
	
	public void selectData()
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentDetails","root", "rootpassword@123");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from Student_D");
			
			while(rs.next())
			{
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)
				+"\t"+rs.getString(5)+"\t"+rs.getString(6)+"\t"+rs.getString(7));
			}
			
			con.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}