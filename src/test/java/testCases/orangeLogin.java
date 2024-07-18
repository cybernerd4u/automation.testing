package orangehrm.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class orangeLogin {

    @Test
    public static void main(String[] args) throws InterruptedException {
        // Setup WebDriver
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            // Successful login scenario
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
            
            // Wait for username field to be present and interact with it
            WebElement usernameField = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("username")));
            usernameField.sendKeys("Admin");
            Thread.sleep(2000);
            
            // Wait for password field to be present and interact with it
            WebElement passwordField = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("password")));
            passwordField.sendKeys("admin123");
            Thread.sleep(2000);
            
            // Wait for login button to be clickable and interact with it
            WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='submit']")));
            loginButton.click();
            Thread.sleep(2000);
            
            // Verify successful login by checking the URL
            wait.until(ExpectedConditions.urlContains("/dashboard/index"));
            if (driver.getCurrentUrl().contains("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index")) {
                System.out.println("Login to the application successful");
            } else {
                System.out.println("Login failed");
            }
            
            driver.close();

            // Failed login scenario
            driver = new ChromeDriver();
            wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
            
            // Wait for username field to be present and interact with it
            usernameField = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("username")));
            usernameField.sendKeys("username123");
            Thread.sleep(2000);
            
            // Wait for password field to be present and interact with it
            passwordField = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("password")));
            passwordField.sendKeys("password123");
            Thread.sleep(2000);
            
            // Wait for login button to be clickable and interact with it
            loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='submit']")));
            loginButton.click();
            Thread.sleep(2000);
            
            // Verify failed login by checking for the error message
            WebElement errorMessage = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".oxd-text.oxd-text--p.oxd-alert-content-text")));
            if (errorMessage.isDisplayed()) {
                System.out.println("Login failed with error message: Invalid credentials");
            } else {
                System.out.println("Unexpected result");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            if (driver != null) {
                driver.quit();
            }
        }
    }
}
