package My_SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Delete_demo {
	
	public void deleteData()
	{
		try 
		{
			String Que="delete from Student_D where student_id=?";
		
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentDetails","root", "rootpassword@123");

			PreparedStatement st=con.prepareStatement(Que);
			String s_id;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter th Student id to delete the data .");
			s_id=sc.next();
			
			
			st.setString(1, s_id);
			
			int count=st.executeUpdate();
			
			if(count>0)
			{
				System.out.println("The data has been deleted .");
			}
			
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}