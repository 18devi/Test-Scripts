package scripts;

import org.testng.annotations.Test;

public class ExampleScript {
@Test(priority=1)
public void signup()
{
	System.out.println("create a account");
}
@Test(priority=2)
public void login()
{
	System.out.println("Please login in your account");
}
@Test(priority=3)
public void destination()
{
   System.out.println("select destination");	
}
@Test(priority=4)
public void flightbook()
{
	System.out.println("Book a flight");
}
 @Test(priority=4)
 public void hotelbook()
 {
	 System.out.println("Book a hotel");
 }
 @Test(priority=5)
 public void logout()
 {
	 System.out.println("logout from your account");
 }
	

}
