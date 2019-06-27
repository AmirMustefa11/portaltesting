package autotest;

//*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
import java.io.FileWriter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/**
 *
 * @author Amimu
 */

public class Autotest {
    

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) throws InterruptedException {
       
// Create a new instance of the Firefox driver
System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
WebDriver driver;
driver = new ChromeDriver();
//Launch the some site
driver.get("http://portal.aait.edu.et");
driver.findElement(By.name("UserName")).sendKeys("ATR/6830/09");
driver.findElement(By.name("Password")).sendKeys("9763");
driver.findElement(By.className("btn-success")).click();
driver.navigate().to("https://portal.aait.edu.et/Grade/GradeReport");

//Wait for 5 Sec
Thread.sleep(5);
// Close the driver
driver.get("https://portal.aait.edu.et/Grade/GradeReport");
String Grade = driver.findElement(By.className("table")).getText();
   try{    
           FileWriter fw = new FileWriter("E:\\myGrade.txt");    
           fw.write(Grade);    
           fw.close();    
          }catch(Exception e){System.out.println(e);}    
          System.out.println("Success...");    
     }    

}
   
    


