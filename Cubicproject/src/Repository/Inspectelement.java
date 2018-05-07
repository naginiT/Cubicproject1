package Repository;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Inspectelement extends Openbrowser {
	static By signin=By.cssSelector(".w3layouts_header_left > ul:nth-child(1) > li:nth-child(1) > a:nth-child(1)");
	static By email=By.name("email");
	static By password=By.name("password");
	static By signin1=By.cssSelector(".tp > input:nth-child(1)");
	static By login=By.cssSelector("#reg_form > fieldset > div:nth-child(3) > div > button.btn.btn-success.btn-lg");
	static By reset=By.xpath("//*[@id=\"reg_form\"]/fieldset/div[3]/div/button[2]");
	static By clickhere=By.cssSelector("#reg_form > fieldset:nth-child(3) > h2:nth-child(4) > a:nth-child(1)");
	//static By email1=By.name("email");
	static By technology=By.name("technology");
	//static WebElement element1=driver.findElement(By.name("technology"));
	//static By technology=By.xpath("//*[@id=\"reg_form\"]/fieldset/div[2]/div/div/select");
	static By sendpassword=By.cssSelector("button.btn:nth-child(1)");
	//static By reset1=By.cssSelector("button.btn:nth-child(2)");
	
	static WebElement element=null;
	public static WebElement signin() throws Exception
	{
	element=driver.findElement(signin);
	Thread.sleep(3000);
	return element;
	}
	public static WebElement email() throws Exception
	{
	element=driver.findElement(email);
	Thread.sleep(3000);
	return element;
	}
	public static WebElement  password() throws Exception {
		element=driver.findElement(password);
	Thread.sleep(3000);
	return element;
	}
	public static WebElement  signin1() throws Exception {

		element=driver.findElement(signin1);
Thread.sleep(3000);
return element;
	}
	public static WebElement  login() throws Exception {

		element=driver.findElement(login);
Thread.sleep(3000);
return element;
	}
	public static WebElement reset() throws Exception {
		element=driver.findElement(reset);
Thread.sleep(3000);
return element;
	}
	public static WebElement  clickhere() throws Exception {
		element=driver.findElement(clickhere);
	Thread.sleep(3000);
	return element;
	}
	/*public static WebElement email() throws Exception
	{
	element=driver.findElement(email);
	Thread.sleep(3000);
	return element;
	}*/
	public static WebElement technology() throws Exception
	{
	element=driver.findElement(technology);
	Thread.sleep(3000);
	return element;
	}
	public static WebElement sendpassword() throws Exception
	{
	element=driver.findElement(sendpassword);
	Thread.sleep(3000);
	return element;
	}
	/*public static WebElement reset1() throws Exception {
		element=driver.findElement(reset1);
Thread.sleep(3000);
return element;
	}
	*/

}
