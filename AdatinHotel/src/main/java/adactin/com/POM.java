package adactin.com;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class POM {
	
	// id ,xpath,names
	
	// pojo class
	@FindBy(id="Username")
	private static WebElement usName;
	
	public static WebElement getusName() {
		return usName;
	}
	public static void setUsName(WebElement usName) {
		POM.usName=usName;
	}
	public static WebElement getPwds() {
		return pwds;
	}
	public static void setPwds(WebElement pwds) {
		POM.pwds=pwds;
	}
	public static WebElement getLog() {
		return log;
	}
	
	public static void setLog(WebElement log) {
		POM.log=log;
	}
	
	
	@FindBy(id="password")
	private static WebElement pwds;
	
	@FindBy(id="login")
	private static WebElement log;

}
