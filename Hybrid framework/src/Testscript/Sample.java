package Testscript;

import org.testng.annotations.Test;

import Generic.Generic_class;
import Generic.Generic_data;
import POM.Pom;

public class Sample extends Generic_class

{
   @Test
   public void test()
  
   {
	  String user_name= Generic_data.get_data("Sheet1", 0, 0);
	  String password= Generic_data.get_data("Sheet1", 0, 1);
	  Pom p = new Pom(driver);
	  p.un(user_name);
	  p.pwd(password);
	  p.btn();
	  
	  
   }
   
   
}
