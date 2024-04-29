import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowser {
    public FireFoxBrowser() {
        // Set the system property for geckoDriver
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\FELCY\\Desktop\\geckodriver-v0.34.0-win32\\geckodriver.exe");
    }

    public void launchBrowser() {
        // Initialize the Firefox driver 
        WebDriver driver = new FirefoxDriver();

        // Open Google
        driver.get("http://google.com");

        // Maximize window 
        driver.manage().window().maximize();

        // Get the current URL
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL: " + currentUrl);

        // Reload the page
        driver.navigate().refresh();

        // Close the browser
        driver.quit();
    }

    public static void main(String[] args) {
        FireFoxBrowser firefoxbrowser = new FireFoxBrowser();
        firefoxbrowser.launchBrowser(); 
    }
}
