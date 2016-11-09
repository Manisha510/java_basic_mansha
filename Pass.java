import java.util.Scanner; 
public class Pass{ 
public static void main(String[] args) 
{ 

String username1 = "mansha"; 
String username2; 
String password1 = "abc123"; 
String password2="0"; 


Scanner scan = new Scanner (System.in); 


System.out.print ("Enter Username: "); 
username2 = scan.nextLine(); 

if (username1.equals(username2))
{ 
	System.out.print("Enter Password: "); 
	password2 = scan.nextLine(); 
}
if(password2.equals(password1))
{ 
	System.out.println("Welcome!"); 
} 
else{ 
System.out.println("Incorrect entry. Please try again."); 
} 

System.exit(0); 
} 
}