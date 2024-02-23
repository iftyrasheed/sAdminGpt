import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class Login {


    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://chatgptgw-super-admin.web.app/login/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
// login
        driver.findElement(By.id(":r0:")).sendKeys("aminur.ifty@venturas-bd.com");
        driver.findElement(By.id("auth-login-v2-password")).sendKeys("PAss##123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(5000);
        // login complete //

        //user add//
        driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[3]/a[1]/div[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".MuiButtonBase-root.MuiButton-root.MuiButton-contained.MuiButton-containedPrimary.MuiButton-sizeMedium.MuiButton-containedSizeMedium.MuiButton-root.MuiButton-contained.MuiButton-containedPrimary.MuiButton-sizeMedium.MuiButton-containedSizeMedium.css-104g3oh")).click();
        Thread.sleep(3000);
        driver.findElement(By.id(":r1a:")).sendKeys("Ifty Automation test");
        driver.findElement(By.id(":r1b:")).sendKeys("aminur.ifty+6@venturas-bd.com");
        //driver.findElement(By.xpath("//div[contains(text(),'有効')]")).click();
        driver.findElement(By.xpath("//div[@class='MuiFormControl-root MuiFormControl-fullWidth css-m5bgtg'][3]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//li[@role='option'][1]")).click();
        driver.findElement(By.xpath("//div[@class='MuiFormControl-root MuiFormControl-fullWidth css-tzsjye']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//li[@data-value='sc_s_admin']")).click();

        driver.findElement(By.cssSelector(".MuiButtonBase-root.MuiButton-root.MuiButton-contained.MuiButton-containedPrimary.MuiButton-sizeMedium.MuiButton-containedSizeMedium.MuiButton-root.MuiButton-contained.MuiButton-containedPrimary.MuiButton-sizeMedium.MuiButton-containedSizeMedium.css-of5cm7")).click();
        Thread.sleep(5000);
        driver.close();
    }
}
