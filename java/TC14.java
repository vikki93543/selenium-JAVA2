import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC14 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/v1/");

        driver.findElement(By.className("form_input")).sendKeys("standard_user");

        driver.findElement(By.name("password")).sendKeys("secret_sauce");

        driver.findElement(By.id("login-button")).click();

        driver.findElement(By.className("btn_inventory")).click();

        driver.findElement(By.className("inventory_item_img")).click();

        Thread.sleep(3000);

        driver.findElement(By.className("inventory_details_back_button")).click();
    }
}
