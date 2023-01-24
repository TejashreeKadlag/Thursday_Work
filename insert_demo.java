package My_SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class insert_demo {
	
	public void insertData()
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentDetails","root", "rootpassword@123");
			
			String query="insert into Student_D (student_id ,fName ,lName ,DOB ,city ,age ,phone_no) values(?,?,?,?,?,?,?)";
			PreparedStatement st=con.prepareStatement(query); 
			Scanner sc=new Scanner(System.in);
			String s_id,fname,lname,dob,city,age,pNo;
			System.out.println("Entre your Student id");
			s_id=sc.next();
			System.out.println("Enter your Student first name");
			fname=sc.next();
			System.out.println("Enter your Student last name");
			lname=sc.next();
			System.out.println("Enter your Date Of Birth");
			dob=sc.next();
			System.out.println("Enter your City");
			city=sc.next();
			System.out.println("Enter your Age");
			age=sc.next();
			System.out.println("Enter your Phone Number");
			pNo=sc.next();
			
			st.setString(1, s_id);
			st.setString(2, fname);
			st.setString(3, lname);
			st.setString(4, dob);
			st.setString(5, city);
			st.setString(6, age);
			st.setString(7, pNo);
			int count=st.executeUpdate();
			
			if(count>0)
			{
				System.out.println("Data inserted");
			}
			else
			{
				System.out.println("Error in the Query");
			}
			con.close();
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}