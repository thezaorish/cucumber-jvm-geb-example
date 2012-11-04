import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.remote.RemoteWebDriver
import java.util.logging.Level

driver = {	
	RemoteWebDriver driver = new FirefoxDriver()
	driver.setLogLevel(Level.WARNING)
	driver
}