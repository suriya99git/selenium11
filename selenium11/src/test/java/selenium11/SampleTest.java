package selenium11;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleTest {

	@Test
	public void testCase() throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		Thread.sleep(5000);
		driver.close();
	}
}
