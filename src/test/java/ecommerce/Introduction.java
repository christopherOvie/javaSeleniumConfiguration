package ecommerce;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Introduction {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String []   productsSelected = {"Cucumber","Brocolli","Beetroot","Tomato"};

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		addItems(driver,productsSelected);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector(".promoBtn")).click();
	
//		//
//		WebDriverWait w= new WebDriverWait(driver, 10);
//		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoInfo")));
		
		
	    System.out.println(driver.findElement(By.cssSelector(".promoInfo")).getText());
		
	
	}
public static void addItems(WebDriver driver,String []   productsSelected) {
	

	int j=0;
	
	//Thread.sleep(5000);

	//it has multiple,
	List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
	
	for(int i=0;i<products.size();i++) {
	
		//check if productsSelected is in the array use arraylist to search easily
		//array takes less memory arraylist is for complicated issues..recommeded hv items to array..then convert to arraylist
		//then check if present
	String[] name =	products.get(i).getText().split("-");
String formattedName=	name[0].trim();
	//format it to get actual veg
	
	List productSelectedList = Arrays.asList(productsSelected);
	
	if(productSelectedList.contains(formattedName)) {
		j++;
		//click on cart
	//	it has multiple
				driver.findElements(By.cssSelector(".product-action")).get(i).click();
			if(j==productsSelected.length) {
				break;
			}
				
	}
	}

	
}
}
