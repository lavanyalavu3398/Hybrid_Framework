package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom
{
  @FindBy(id="email")
  private WebElement un_ele;
  @FindBy(id="pass")
  private WebElement un_pwd;
  @FindBy(name="login")
  private WebElement un_btn;
  public Pom(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
	  
  }
  public void un(String u)
  {
	  un_ele.sendKeys(u);
  }
  public void pwd(String p)
  {
	  un_ele.sendKeys(p);
	 
  }
  public void btn()
  {
	  un_btn.click();
  }
}
