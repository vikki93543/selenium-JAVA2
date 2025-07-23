import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC4 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //navigate website
        driver.get("https://www.saucedemo.com/v1/");

        //provide invalid data
        WebElement userfeild = driver.findElement(By.name("user-name"));
        userfeild.sendKeys("standargd_user");

        WebElement passfeild = driver.findElement(By.name("password"));
        passfeild.sendKeys("secret_sauhjce");

        //click on login button
        WebElement loginbutton = driver.findElement(By.className("btn_action"));
        loginbutton.click();

        System.out.println("test case sucessfukky ");

        driver.quit();
    }
}
