import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ChromeBrowser {
	
	public ChromeBrowser() {
		//set system property for the chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\FELCY\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	}
	
	public void launchBrowser() {
		//initialize chrome driver 
		WebDriver driver = new ChromeDriver();
		//open demoblaze url
		driver.get("https://www.demoblaze.com");
		// maximize the window 
		driver.manage().window().maximize();
		//get the title
		String title = driver.getTitle();
		System.out.println("the title of the page is: "+title);
		//check if the title of the page is STORE
		if (title.equals("STORE")) {
			System.out.println("Page landed on correct Website");
		}
		else {
			System.out.println("Page not landed on correct Website");
			
		}
		
	}

	public static void main(String[] args) {
		ChromeBrowser chromebrowser = new ChromeBrowser();
		chromebrowser.launchBrowser();

	}

}
