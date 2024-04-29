import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Wikipedia {
	
	public Wikipedia() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\FELCY\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	}
	
	public void launchBrowser() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		// Find the search input field and enter the search query
		driver.findElement(By.id("searchInput")).sendKeys("Artificial Intelligence");
		 

        // Find and click the search button
        WebElement searchButton = driver.findElement(By.xpath("//button[@type='submit']"));
        searchButton.click();

        // Wait for the search results to load
        try {
            Thread.sleep(2000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Find and click on the "History" section link in the search results
        WebElement historySectionLink = driver.findElement(By.xpath("//li[@id='toc-History']//div[1]"));
        historySectionLink.click();
        
        try {
            Thread.sleep(2000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Get the title of the history section
        String historySectionTitle = driver.getTitle();
        System.out.println("Title of the History Section: " + historySectionTitle);

    }

	public static void main(String[] args) {
		Wikipedia wikipedia = new Wikipedia();
		wikipedia.launchBrowser();

	}

}
