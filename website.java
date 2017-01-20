import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Website {
	public static void main(String[] args) throws Exception {
		for (int i = 1; i <= 5; i++)
		{
			System.setProperty("webdriver.gecko.driver", "/opt/Geckodriver/geckodriver");
			WebDriver driver = new FirefoxDriver()
			driver.get("https://accounts.google.com/ServiceLogin?service=mail&continue=https://mail.google.com/mail/#identifier");
			driver.findElement(By.id("Email")).sendKeys("waynerooney36k@gmail.com");
			driver.findElement(By.id("next")).click();
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("Passwd")));
			driver.findElement(By.id("Passwd")).sendKeys("messivsronaldo");
			driver.findElement(By.id("PersistentCookie")).click();
			driver.findElement(By.id("signIn")).click();
			Thread.sleep(7000);
			driver.findElement(By.xpath("//div[contains(text(),'COMPOSE')]")).click();
			String[] IDs = { "shujaatphyrose@gmail.com ", "ankit.gawande@gmail.com ", "coolfankyom@gmail.com ",
					"waynerooney36k@gmail.com ", };
			driver.findElement(By.xpath("//textarea[@name='to']")).sendKeys(IDs);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("Awesome");
			driver.findElement(By.xpath("(.//*[@aria-label='Message Body'])[2]")).click();
			driver.findElement(By.xpath("(.//*[@aria-label='Message Body'])[2]")).sendKeys("Hey Doll, Understand!");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[contains(text(),'Send')]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//span[@class='gb_8a gbii']")).click();
			driver.findElement(By.xpath("//a[contains(text(),'Sign out')]")).click();
			Thread.sleep(3000);
			driver.quit();
			System.out.println("Email has been sent successfully" + i);
			Thread.sleep(3000);
		}
		
	}
	
}
