import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC17 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/v1/");

        driver.findElement(By.className("form_input")).sendKeys("standard_user");

        driver.findElement(By.name("password")).sendKeys("secret_sauce");

        driver.findElement(By.id("login-button")).click();

        driver.findElement(By.className("btn_inventory")).click();


        driver.findElement(By.xpath("//div[text()='Sauce Labs Bike Light']/ancestor::div[@class='inventory_item']//button")).click();

        driver.findElement(By.className("shopping_cart_link")).click();

        Thread.sleep(3000);

       driver.findElement(By.xpath("//a[@class='btn_action checkout_button']")).click();
    }
}
