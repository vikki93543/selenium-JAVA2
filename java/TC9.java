import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC9 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //navigate website
        driver.get("https://www.saucedemo.com/v1/");

        //provide valid data
        WebElement userfeild = driver.findElement(By.name("user-name"));
        userfeild.sendKeys("standard_user");

        WebElement passfeild = driver.findElement(By.name("password"));
        passfeild.sendKeys("secret_sauce");

        //click on login button
        WebElement loginbutton = driver.findElement(By.className("btn_action"));
        loginbutton.click();

        // click hanburger button
        WebElement hamburger = driver.findElement(By.className("bm-burger-button"));
        hamburger.click();

        //logout
        WebElement logout = driver.findElement(By.id("logout_sidebar_link"));
        logout.click();


    }
}
