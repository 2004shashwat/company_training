package shashwat;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class practical
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://sahayog.uknowva.com/login?return=L3Byb2ZpbGU=");
        //Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("8154");
        //Thread.sleep(3000);
 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Shashwat29$");
 driver.findElement(By.xpath("//button[@type='submit']")).click();
    Thread.sleep(3000);
    System.out.println("I AM Shashwat");
    }
}
