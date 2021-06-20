package MyTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Analyzer.RetriveInteger;

public class TestTask {

	WebDriver driver;
	
	RetriveInteger integer = new RetriveInteger();

	@BeforeMethod
	public void setup() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anand\\Desktop\\Basic\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.amazon.in/Vivo-Y51A-Titanium-Sapphire-Additional/dp/B08LRDP2Q6/ref=sxin_2_hcs-la-in-1?cv_ct_cx=vivo+mobiles&dchild=1&keywords=vivo+mobiles&pd_rd_i=B08LRDP2Q6&pd_rd_r=fd6b104d-ed3a-4bbd-8a2f-1aa935ff88e0&pd_rd_w=kJME5&pd_rd_wg=8aT3g&pf_rd_p=b6d118af-97d2-4a68-bf40-4cd2a7c6b3cd&pf_rd_r=AVHB0WXR9BD7CEC2WRJF&qid=1624095047&sr=1-1-99b054f1-0e42-4e3b-b375-028105b26bc6");
	}

	@Test
	public void Mobile_shopping() {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,3500)", "");

		driver.findElement(By.xpath("//td[@class='customer-rating-column']/span/span[1]/i")).click();
		
		String ratings_1 = driver.findElement(By.xpath("//script[@id='stores']/following-sibling::div[1]/div/div[1]/div/div/div/div/div[2]/span")).getText();
		
		int reviewnum_1 = integer.FetchNum(ratings_1);
		
		String batterypower = driver.findElement(By.xpath("//table[@id='HLCXComparisonTable']/tbody/tr[10]/td[1]")).getText();
		
		int battery_1 = integer.FetchNum(batterypower);

	        driver.findElement(By.xpath("//td[@class='customer-rating-column comparable_item0']/span/span[1]/i")).click();
	      
	        String ratings_2 = driver.findElement(By.xpath("//script[@id='stores']/following-sibling::div[2]/div/div[1]/div/div/div/div/div[2]/span")).getText();
		
	        int reviewnum_2 = integer.FetchNum(ratings_2);
		
		String batterypower_2 = driver.findElement(By.xpath("//table[@id='HLCXComparisonTable']/tbody/tr[10]/td[2]")).getText();
		
		int battery_2 = integer.FetchNum(batterypower_2);
	        
	        driver.findElement(By.xpath("//td[@class='customer-rating-column comparable_item1']/span/span[1]/i")).click();
	 
	        String ratings_3 = driver.findElement(By.xpath("//script[@id='stores']/following-sibling::div[3]/div/div[1]/div/div/div/div/div[2]/span")).getText();
	   
	        int reviewnum_3 = integer.FetchNum(ratings_3);
	    
		String batterypower_3 = driver.findElement(By.xpath("//table[@id='HLCXComparisonTable']/tbody/tr[10]/td[1]")).getText();
		
		int battery_3 = integer.FetchNum(batterypower_3);
      
                driver.findElement(By.xpath("//td[@class='customer-rating-column comparable_item2']/span/span[1]/i")).click();
	 
                String ratings_4 = driver.findElement(By.xpath("//script[@id='stores']/following-sibling::div[4]/div/div[1]/div/div/div/div/div[2]/span")).getText();
	  
	        int reviewnum_4 = integer.FetchNum(ratings_4);
	    
		String batterypower_4 = driver.findElement(By.xpath("//table[@id='HLCXComparisonTable']/tbody/tr[10]/td[1]")).getText();
		
		int battery_4 = integer.FetchNum(batterypower_4);
		
                String mobile_1 = driver.findElement(By.xpath("//table[@id='HLCXComparisonTable']/tbody/tr[1]/th[2]/div[2]/div/span")).getText();
		
		String mobile_2 = driver.findElement(By.xpath("//table[@id='HLCXComparisonTable']/tbody/tr[1]/th[3]/a/div[2]/span")).getText();
		
		String mobile_3 = driver.findElement(By.xpath("//table[@id='HLCXComparisonTable']/tbody/tr[1]/th[4]/a/div[2]/span")).getText();
		
		String mobile_4 = driver.findElement(By.xpath("//table[@id='HLCXComparisonTable']/tbody/tr[1]/th[5]/a/div[2]/span")).getText();
		
		if(reviewnum_1 > reviewnum_2 && reviewnum_1 > reviewnum_3 && reviewnum_1 > reviewnum_4) {
			
			System.out.println("This is the best mobile to buy :"+mobile_1);
			System.out.println(" BatteryPower is:"+battery_1);
			
		}
		
		else if(reviewnum_2 > reviewnum_1 && reviewnum_2 > reviewnum_3 && reviewnum_2 > reviewnum_4) {
			
			System.out.println("This is the best mobile to buy : "+mobile_2);
			System.out.println(" BatteryPower is:"+battery_2);
		}
		
		else if(reviewnum_3 > reviewnum_1 && reviewnum_3 > reviewnum_2 && reviewnum_3 > reviewnum_4) {
			
			System.out.println("This is the best mobile to buy : "+mobile_3);
			System.out.println(" BatteryPower is:"+battery_3);
		}
	    
		else {
			
			System.out.println("This is the best mobile to buy : "+mobile_4);
			
			System.out.println(" BatteryPower is:"+battery_4);
		}
	  
	}
	

	@AfterMethod
	public void quit() {
		
		 driver.quit();
	}

}
