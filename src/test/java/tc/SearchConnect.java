package tc;

import java.awt.AWTException;
import java.net.MalformedURLException;
import org.openqa.selenium.WebDriver;

import feature.FileManager;
import feature.WebMobnew;

public class SearchConnect {

	public static void main(String[] args) throws InterruptedException, MalformedURLException, AWTException {
		WebDriver driver = WebMobnew.searchConnect("https://qars-gm.ent.aetherpal.com/wbc");
		FileManager FM = new FileManager(driver);
		FM.FMUpload();

	}

}
