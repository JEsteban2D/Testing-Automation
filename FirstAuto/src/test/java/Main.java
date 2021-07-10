import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("Youtube");
        driver.findElement(By.name("btnK")).submit();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//*[@class='LC20lb DKV0Md'])[1]")).click();
        driver.findElement(By.name("search_query")).sendKeys("la capital");
        driver.findElement(By.id("search-icon-legacy")).click();
        driver.findElement(By.xpath("//a[@id='video-title' and @title='Alitas tipo comida China | La Capital']")).click();
        Thread.sleep(10000);
        driver.quit();
    }
}
