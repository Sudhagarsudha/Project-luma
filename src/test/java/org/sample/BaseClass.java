package org.sample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
	public static WebDriver driver;

	public static void getDriver(String browserType) {

		switch (browserType) {
		case "Chrome":
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Sudhagar\\eclipse-workspace\\DecCucum\\driver\\chromedriver.exe");

			driver = new ChromeDriver();

			break;
		case "Edge":
			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\Sudhagar\\eclipse-workspace\\DecCucum\\driver\\msedgedriver.exe");

			driver = new EdgeDriver();
			break;
			
		case "Firefox":
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sudhagar\\eclipse-workspace\\DecCucum\\driver\\geckodriver.exe");
			
			driver = new FirefoxDriver();

		default:
			break;
		}

	}

	public static void getUrl(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	public static void gettitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	public static void getcurrenturl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}

	public static void close() {
		driver.close();
	}

	public static void quit() {
		driver.quit();
	}

	public void click(WebElement element) {
		element.click();
	}

	public static void clear(WebElement element) {
		element.clear();
	}

	public static void sendkeys(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void gettext(WebElement element, String value) {
		String text = element.getText();
		System.out.println(text);
	}

	public static void getattribute(WebElement element, String value) {
		String attribute = element.getAttribute(value);
		System.out.println(value);
	}

	// Navigation Commands
	public static void back() {
		Navigation nav = driver.navigate();
		nav.back();
	}

	public static void forward() {
		Navigation nav = driver.navigate();
		nav.forward();
	}

	public static void refresh() {
		Navigation nav = driver.navigate();
		nav.refresh();
	}

	public static void to(String url) {
		Navigation nav = driver.navigate();
		nav.to(url);
	}

	// Alert Commands
	public static void simplealert(WebElement element) {
		element.click();
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
	}

	public static void confirmalert(WebElement element) {
		element.click();
		Alert alert2 = driver.switchTo().alert();
		alert2.dismiss();
	}

	public static void promptalert(WebElement element, String value) {
		element.click();
		Alert alert3 = driver.switchTo().alert();
		alert3.sendKeys(value);
		alert3.accept();
	}

	// Action Commands
	public static void mouseoveraction(WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).build().perform();
	}

	public static void DoubleClick(WebElement element) {
		Actions act = new Actions(driver);
		act.doubleClick(element).build().perform();
	}

	public static void Rightclick(WebElement element) {
		Actions act = new Actions(driver);
		act.contextClick(element).build().perform();
	}

	public static void enter(WebElement element) {
		Actions act = new Actions(driver);
		act.sendKeys(element, Keys.ENTER);
	}

	public static void DragandDrop(WebElement element, WebElement element1, String value, String value1) {
		Actions act = new Actions(driver);
		act.dragAndDrop(element, element1).build().perform();
	}

	public static void ClickandHold(WebElement element, WebElement element1, String value, String value1) {
		Actions act = new Actions(driver);
		act.clickAndHold(element).moveToElement(element1).release().build().perform();
	}

	// Robot Commands
	public static void robot(WebElement element) {
		Robot r;
		try {
			r = new Robot();
			r.keyPress(KeyEvent.VK_SHIFT);
			r.keyPress(KeyEvent.VK_S);
			r.keyRelease(KeyEvent.VK_SHIFT);
			r.keyRelease(KeyEvent.VK_S);
			r.keyPress(KeyEvent.VK_U);
			r.keyRelease(KeyEvent.VK_U);
			r.keyPress(KeyEvent.VK_D);
			r.keyRelease(KeyEvent.VK_D);
			r.keyPress(KeyEvent.VK_H);
			r.keyRelease(KeyEvent.VK_H);
			r.keyPress(KeyEvent.VK_A);
			r.keyRelease(KeyEvent.VK_A);
			r.keyPress(KeyEvent.VK_G);
			r.keyRelease(KeyEvent.VK_G);
			r.keyPress(KeyEvent.VK_A);
			r.keyRelease(KeyEvent.VK_A);
			r.keyPress(KeyEvent.VK_R);
			r.keyRelease(KeyEvent.VK_R);
		} catch (AWTException e) {
			e.printStackTrace();
		}

	}

	public static void robotkeypress(int keycode) {
		Robot r;
		try {
			r = new Robot();
			r.keyPress(keycode);
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}

	public static void robotkeyrelease(int keycode) {
		Robot r;
		try {
			r = new Robot();
			r.keyRelease(keycode);
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}

	// Select Commands
	public static void selectByValue(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);
	}

	public static void selectByvisibletext(WebElement element, String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}

	public static void selectByIndex(WebElement element, int index) {
		Select s = new Select(element);
		s.selectByIndex(index);
	}

	public static void getallselectedoptions(WebElement element) {
		Select s = new Select(element);
		List<WebElement> selectedOptions = s.getAllSelectedOptions();
		for (int i = 0; i < selectedOptions.size(); i++) {
			WebElement webElement1 = selectedOptions.get(i);
			String text1 = webElement1.getText();
			System.out.println(text1);
		}
	}

	public static void getoptions(WebElement element) {
		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
		for (int i = 0; i < options.size(); i++) {
			WebElement webElement = options.get(i);
			String text = webElement.getText();
			System.out.println(text);
		}
	}

	public static void firstselectedoptions(WebElement element) {
		Select s = new Select(element);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		String text = firstSelectedOption.getText();
		System.out.println(text);
	}

	public static void isMultiple(WebElement element) {
		Select s = new Select(element);
		boolean multiple = s.isMultiple();
		if (multiple == true) {
			System.out.println("Perform MultiSelect");
		} else {
			System.out.println("Cannot Perform MultiSelect ");

		}

	}

	// TakesScreenShot Command
	public static void screenCapture(String name) {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		File targetFile = new File("C:\\Users\\Sudhagar\\Pictures\\sc\\" + name + ".png");
		try {
			FileUtils.copyFile(sourceFile, targetFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// JavaScript Command
	public static void textSendByJS(String keysToSend, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','" + keysToSend + "')", element);
	}

	// Windows Handling
	public static void windowhandle(WebElement element, WebElement element1) {
		String windowHandle = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		for (String x : windowHandles) {
			if (!windowHandle.equals(x)) {

			}
			driver.switchTo().window(x);
		}

	}

	// Frame
	public static void frame(WebElement element) {
		driver.switchTo().frame(element);

	}

	// DataDriven Read Command
	public static String excelread(int rownum, int cellnum) throws IOException {
		File filePath = new File("C:\\Users\\Sudhagar\\Desktop\\my excel\\project Luma.xlsx");
		FileInputStream stream = new FileInputStream(filePath);
		Workbook book = new XSSFWorkbook(stream);
		Sheet sheet = book.getSheet("Sheet1");
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		CellType cellType = cell.getCellType();
		String value = null;
		switch (cellType) {
		case STRING:
			value = cell.getStringCellValue();
			break;
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat simple = new SimpleDateFormat("dd/MM/yyyy");
				value = simple.format(dateCellValue);
			} else {
				double numericCellValue = cell.getNumericCellValue();
				BigDecimal valueOf = BigDecimal.valueOf(numericCellValue);
				value = valueOf.toString();
			}
			break;

		default:
			System.out.println("None");
			break;
		}
		return value;

	}



}
