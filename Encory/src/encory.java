import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class encory {
    public static void main(String[] args) {
        
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        
        driver.get("https://dfe-encory-test.azurewebsites.net/#/");

        // Optionally, wait for a few seconds to see the result
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        

        // Close the browser
        //driver.quit();
    }
}
