package My_SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class update_demo {
	public void updateData()
	{
		try 
		{
			String Que="update Student_D set city=? where student_id=?";
		
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentDetails","root", "rootpassword@123");
			PreparedStatement st=con.prepareStatement(Que);
			String s_id,fname,lname,dob,city,age,pNo;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Student id to change the City");
			s_id=sc.next();
			System.out.println("Enter new City");
			city=sc.next();
			st.setString(2, s_id);
			st.setString(1, city);
			
			int count=st.executeUpdate();
			
			if(count>0)
			{
				System.out.println("The data has been updated .");
			}
			
			con.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}