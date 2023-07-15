package marsRover.marsRover.Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Page{
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(@href,'account')]")
	private WebElement sign_in;
	
	@FindBy(xpath="//input[@type='email']")
	private WebElement email;
	
	@FindBy(xpath="//*[text()='Next']")
	private WebElement next;
	
	@FindBy(xpath="//*[text()='Try again']")
	private WebElement try_again;
	
	@FindBy(xpath="//input[@id='search']")
	private WebElement search_box;
	
	@FindBy(xpath="//button[@aria-label='Search']")
	private WebElement search_button;
	
	@FindBy(xpath="//*[text()='Videos']")
	private WebElement videos_tab;
	
	public void login(String un, String pwd) throws InterruptedException
	{
        String title = driver.getTitle();
        System.out.println(title);
        driver.switchTo().frame("passive_signin");
        waitForEle(driver,sign_in);
        sign_in.click();
        email.sendKeys(un);
        next.click();
        
	}
	
	public void search(String keyword) throws InterruptedException
	{
		search_box.sendKeys(keyword);
        waitForEle(driver,search_button);
		search_button.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@href='/@Forty3Stories'])[2]")).click();
		Thread.sleep(2000);
		waitForEle(driver,videos_tab);
		videos_tab.click();
	}
	
	public void clickvideo(String video_keyword) throws InterruptedException
	{
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[contains(@title,'"+video_keyword+"') and @id='video-title-link']")).click();
		if(driver.findElements(By.xpath("//*[text()='Skip Ads']"))!=null)
		{
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[text()='Skip Ads']")).click();
		}
		
	}
	
	public void closedrivers() throws InterruptedException
	{
		Thread.sleep(50000);
		driver.quit();
	}
}
