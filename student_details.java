package My_SQL;

import java.util.Scanner;

public class student_details {

	public static void main(String[] args) {
		 
		Create obj4= new Create();
		obj4.Create_database();
		obj4.Create_table();
		Select_demo obj= new Select_demo();
		insert_demo obj1= new insert_demo();
		update_demo obj2= new update_demo();
		Delete_demo obj3= new Delete_demo();
		
		System.out.println("... Hello Welcome ...");
		int ch;
		  char ans;		 
		  Scanner sc=new Scanner(System.in);			
		
		do 
		{
			System.out.println("Please select one option....");
			System.out.println("\n 1: Select \n 2: Insert \n 3: Update \n 4: Delete ");  
			
			ch = sc.nextInt();					
			
			switch(ch)				
			{
				case 1:
					obj.selectData();
					break;
			
				case 2:
					obj1.insertData();
					break;
		
				case 3:
					obj2.updateData();
					break;
		
				case 4:
					obj3.deleteData();
					break;
	
				default:
			System.out.println("Invalid choice");
			}
			System.out.println("Do you want to continue y/n"); 		
		    ans=sc.next().charAt(0);	
		}
		while(ans=='Y'||ans=='y');
	}
	
}