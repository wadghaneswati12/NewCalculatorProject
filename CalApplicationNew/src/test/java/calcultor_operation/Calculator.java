package calcultor_operation;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.mustache.Value;

public class Calculator {
	
	public WebDriver driver;
	@Test(priority = 0)
  public void OpenCrome() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.calculator.net");
		System.out.println("Crome Open Sucessfully");
		System.out.println("----------------------------------------------------------------------------------------");
		//System.out.println(driver.getTitle());	
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Calculator.net: Free Online Calculators - Math, Fitness, Finance, Science";
		Assert.assertEquals(ExpectedTitle, ActualTitle);
		System.out.println("Expected Title:"+ "\n" +  ActualTitle);
		System.out.println("----------------------------------------------------------------------------------------");
  }
  
 @Test(priority = 1)
  public void Addition() throws Exception  {
	  System.out.println("We are Using Math Function from Above Application Title");
	  
	  WebElement subtraction = driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[4]"));
		 subtraction.click();
		 Thread.sleep(2000);
		 
		 
	  	 WebElement add1 = driver.findElement(By.xpath("//span[@onclick='r(2)'] "));
		 add1.click();
		 WebElement add2 = driver.findElement(By.xpath("//span[@onclick='r(3)'] "));
		 add2.click();
		 WebElement add3 = driver.findElement(By.xpath("//span[@onclick='r(4)'] "));
		 add3.click();
		 WebElement add4 = driver.findElement(By.xpath("//span[@onclick='r(2)'] "));
		 add4.click();
		 WebElement add5 = driver.findElement(By.xpath("//span[@onclick='r(3)'] "));
		 add5.click();
		 WebElement add6 = driver.findElement(By.xpath("//span[@onclick='r(4)'] "));
		 add6.click();
		 Thread.sleep(2000);
		 
		 
		 WebElement plus = driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[4] "));
		 plus.click();
		 Thread.sleep(2000);
		 
		 WebElement add7 = driver.findElement(By.xpath("//span[@onclick='r(3)'] "));
		 add7.click();
		 WebElement add8 = driver.findElement(By.xpath("//span[@onclick='r(4)'] "));
		 add8.click();
		 WebElement add9 = driver.findElement(By.xpath("//span[@onclick='r(5)'] "));
		 add9.click();
		 WebElement add10 = driver.findElement(By.xpath("//span[@onclick='r(3)'] "));
		 add10.click();
		 WebElement add11 = driver.findElement(By.xpath("//span[@onclick='r(4)'] "));
		 add11.click();
		 WebElement add12 = driver.findElement(By.xpath("//span[@onclick='r(5)'] "));
		 add12.click();
		 Thread.sleep(2000);
		 
		 
		 System.out.println("----------------------------------------------------------------------------------------");
		 System.out.println("Addition calculate is Successfully");
		 WebElement input = driver.findElement(By.xpath("//div[@id='sciInPut']"));
		 System.out.println("Addition Input is"+input.getText());
		 WebElement result = driver.findElement(By.xpath("//div[@id='sciOutPut']"));
	   	 System.out.println("Addition Result is"+result.getText());
	   	 WebElement clrResult = driver.findElement(By.xpath("//span[text()='AC']"));
	     clrResult.click();
	     Thread.sleep(5000);
	     System.out.println("----------------------------------------------------------------------------------------");
	     //driver.close();
	     
  } 
 
 
  @Test(priority = 2)
  public void Multiplication() throws Exception   {
	  
	  WebElement Mul1 = driver.findElement(By.xpath("//span[@onclick='r(4)'] "));
		 Mul1.click();
		 WebElement Mul2 = driver.findElement(By.xpath("//span[@onclick='r(2)'] "));
		 Mul2.click();
		 WebElement Mul3 = driver.findElement(By.xpath("//span[@onclick='r(3)'] "));
		 Mul3.click();
		 Thread.sleep(2000);
		 WebElement muliplication = driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[4]"));
		 muliplication.click();
		 Thread.sleep(2000);
		 WebElement Mul4 = driver.findElement(By.xpath("//span[@onclick='r(5)'] ")); 
		 Mul4.click();
		 WebElement Mul5 = driver.findElement(By.xpath("//span[@onclick='r(2)'] "));
		 Mul5.click();
		 WebElement Mul6 = driver.findElement(By.xpath("//span[@onclick='r(5)'] "));
		 Mul6.click();
		 System.out.println("----------------------------------------------------------------------------------------");
		 System.out.println("muliplication calculate is Successfully");
		 WebElement input = driver.findElement(By.xpath("//div[@id='sciInPut']"));
		 System.out.println("Muliplication Input is"+input.getText());
		 WebElement result = driver.findElement(By.xpath("//div[@id='sciOutPut']"));
	   	 System.out.println("Muliplication Result is"+result.getText()); 
	   	 WebElement clrResult = driver.findElement(By.xpath("//span[text()='AC']"));
	     clrResult.click();
	     System.out.println("----------------------------------------------------------------------------------------");
	   	 //driver.close();
  }
  
  @Test(priority = 3)
  public void Division() throws Exception  {
	  	 WebElement div1 = driver.findElement(By.xpath("//span[@onclick='r(4)'] "));
	  	 div1.click();
		 WebElement div2 = driver.findElement(By.xpath("//span[@onclick='r(0)'] "));
		 div2.click();
		 WebElement div3 = driver.findElement(By.xpath("//span[@onclick='r(0)'] "));
		 div3.click();
		 WebElement div4 = driver.findElement(By.xpath("//span[@onclick='r(0)'] "));
		 div4.click();
		 
		 WebElement division = driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[4]/span[4] "));
		 division.click();
		 Thread.sleep(2000);
		 
		 WebElement div5 = driver.findElement(By.xpath("//span[@onclick='r(2)'] "));
		 div5.click();
		 WebElement div6 = driver.findElement(By.xpath("//span[@onclick='r(0)'] "));
		 div6.click();
		 WebElement div7 = driver.findElement(By.xpath("//span[@onclick='r(0)'] "));
		 div7.click();
		 System.out.println("----------------------------------------------------------------------------------------");
		 System.out.println("Division calculate is Successfully");
		 WebElement input = driver.findElement(By.xpath("//div[@id='sciInPut']"));
		 System.out.println("Division Input is"+input.getText());
		 WebElement result = driver.findElement(By.xpath("//div[@id='sciOutPut']"));
	   	 System.out.println("Division Result is"+result.getText()); 
	   	 WebElement clrResult = driver.findElement(By.xpath("//span[text()='AC']"));
	     clrResult.click();
	     System.out.println("----------------------------------------------------------------------------------------");
	   	// driver.close();
  } 
	
	@Test(priority = 4)
	  public void subtraction() throws Exception {
		 WebElement sub1 = driver.findElement(By.xpath("//span[@onclick='r(2)'] "));
	  	 sub1.click();
		 WebElement sub2 = driver.findElement(By.xpath("//span[@onclick='r(3)'] "));
		 sub2.click();
		 WebElement sub3 = driver.findElement(By.xpath("//span[@onclick='r(4)'] "));
		 sub3.click();
		 WebElement sub4 = driver.findElement(By.xpath("//span[@onclick='r(8)'] "));
		 sub4.click();
		 WebElement sub5 = driver.findElement(By.xpath("//span[@onclick='r(2)'] "));
		 sub5.click();
		 WebElement sub6 = driver.findElement(By.xpath("//span[@onclick='r(3)'] "));
		 sub6.click();
		 
		 
		 WebElement subtraction = driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[4]"));
		 subtraction.click();
		 //Thread.sleep(2000);
		 
		 WebElement subtraction1 = driver.findElement(By.xpath("//span[text()='–']"));
		 subtraction1.click();
		// Thread.sleep(2000);
		
		 WebElement sub7 = driver.findElement(By.xpath("//span[@onclick='r(2)'] "));
	  	 sub7.click();
		 WebElement sub8 = driver.findElement(By.xpath("//span[@onclick='r(3)'] "));
		 sub8.click();
		 WebElement sub9 = driver.findElement(By.xpath("//span[@onclick='r(0)'] "));
		 sub9.click();
		 WebElement sub10 = driver.findElement(By.xpath("//span[@onclick='r(9)'] "));
		 sub10.click();
		 WebElement sub11 = driver.findElement(By.xpath("//span[@onclick='r(4)'] "));
		 sub11.click();
		 WebElement sub12 = driver.findElement(By.xpath("//span[@onclick='r(8)'] "));
		 sub12.click();
		 WebElement sub13 = driver.findElement(By.xpath("//span[@onclick='r(2)'] "));
		 sub13.click();
		 WebElement sub14 = driver.findElement(By.xpath("//span[@onclick='r(3)'] "));
		 sub14.click();
		 System.out.println("----------------------------------------------------------------------------------------");
		 System.out.println("Subtraction calculate is Successfully");
		 WebElement input = driver.findElement(By.xpath("//div[@id='sciInPut']"));
		 System.out.println("Subtraction Input is"+input.getText());
		
		 WebElement result = driver.findElement(By.xpath("//div[@id='sciOutPut']"));
	   	 System.out.println("Subtraction Result is"+result.getText()); 
	   	 System.out.println("----------------------------------------------------------------------------------------");
	   	try{
	   	 String ActualValue=result.getText(); 
	   	 int A=Integer.parseInt(ActualValue);  
	   	 String ExpectedValues = "23329646";
	     int B =Integer.parseInt(ExpectedValues);
	     System.out.println(B);
	     Assert.assertEquals(A,B);
	     if(A==B) {
	    	 System.out.println("Test Assert Passs");
	    	 
	     }else {
	    	 System.out.println("Test Aseert Fail");
	     }
	     
         } catch(NumberFormatException ex){ // handle your exception
        	 
	   	}
	     
		 WebElement clrResult = driver.findElement(By.xpath("//span[text()='AC']"));
		 clrResult.click();
		 driver.close();
		 
		 
	} 
  
}
