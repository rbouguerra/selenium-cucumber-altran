package com.e2eTest.altran.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//import com.e2eTest.altran.util.AbstractPage;
//import com.e2eTest.altran.util.Setup;

public class CommonMethods {

	public static WebDriver driver;
	public static Properties prop;

	protected static final Logger logger = LoggerFactory.getLogger(AbstractPage.class);

	public CommonMethods() {

		driver = Setup.driver;
	}

	public void refresh() {

		driver.navigate().refresh();
	}

	public void back() {

		driver.navigate().back();
	}

	public void forward() {

		driver.navigate().forward();
	}

	public void scrollerBottom() {

		for (int second = 0;; second++) {
			if (second >= 60) {
				break;
			}
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0,400)", "");
		}

	}

	public void readUrlFromConfigFile() throws IOException {

		prop = new Properties();
		FileInputStream fis = new FileInputStream("src/test/resources/configs/config.properties");
		prop.load(fis);
		driver.get(prop.getProperty("url1"));
	}

	public void readURLFromConfigFile(String text) throws IOException {

		prop = new Properties();
		FileInputStream fis = new FileInputStream("src/test/resources/configs/config.properties");
		prop.load(fis);
		driver.get(prop.getProperty(text));
	}

	public void readTextFromConfigFile() throws IOException {

		prop = new Properties();
		FileInputStream fis = new FileInputStream("src/test/resources/configs/config.properties");
		prop.load(fis);
		prop.getProperty("sign_out");
	}

	public String readConfigFile(String text) throws IOException {

		prop = new Properties();
		FileInputStream fis = new FileInputStream("src/test/resources/configs/config.properties");
		prop.load(fis);
		return prop.getProperty(text);
	}

	public void mouse(WebElement element) {

		Actions actions = new Actions(driver);
		WebElement mouseHover = element;
		actions.moveToElement(mouseHover).perform();
		mouseHover.click();
	}

	public void click(WebElement element) {

		WebElement clickButton = element;
		clickButton.click();
	}

	public void sendKeysText(WebElement element, String text) {

		WebElement sendText = element;
		sendText.sendKeys(text);
	}

	public void selectText(WebElement element, String text) {

		Select selectBox = new Select(element);
		selectBox.selectByVisibleText(text);
	}
	
	public void selectValue(WebElement element, String value) {

		Select selectBox = new Select(element);
		selectBox.selectByVisibleText(value);
	}

	// Handle new window // Transfert controle (driver) dans une nouvelle fenetre
	public void windowHandle() {

		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
	}

	public void asserTrueGetTitle(String text) {

		String pageHome = driver.getTitle();
		Assert.assertTrue(pageHome.contains(text));
	}

	public void assertFalseGetPageSource(String text) {

		boolean pageSource = driver.getPageSource().contains(text);
		Assert.assertFalse(pageSource);
	}

	public void windowScroll(String text) {

		// text = "window.scrollBy(0,200)"
		((JavascriptExecutor) driver).executeScript(text, "");
	}

}
