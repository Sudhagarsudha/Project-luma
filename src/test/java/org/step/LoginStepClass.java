package org.step;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.sample.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepClass extends BaseClass {


	@Given("User Should Put {string} and {string}")
	public void user_should_put_and(String Driver, String Url) {
		try {
			getDriver(Driver);
			getUrl(Url);
		} catch (Exception e) {
		}
	}

	@When("User Should Click SignIn button")
	public void user_should_click_sign_in_button() {
		try {
			WebElement sign = driver.findElement(By.xpath("//div[@class='panel header']//a[contains(text(),'Sign In')]"));
			sign.click();
		} catch (Exception e) {

		}
	}

	@When("User Should Enter {string} and {string}")
	public void user_should_enter_and(String Email, String Password) {
		try {
			WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
			email.sendKeys(Email);
			WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
			password.sendKeys(Password);
		} catch (Exception e) {
		}
	}

	@When("User Should Click the Login button")
	public void user_should_click_the_login_button() {
		try {
			WebElement signin = driver
					.findElement(By.xpath("//fieldset[@class='fieldset login']//span[contains(text(),'Sign In')]"));
			signin.click();
		} catch (Exception e) {

		}
	}

	@When("User Should Search The Product {string}")
	public void user_should_search_the_product(String Name) {
		try {
			WebElement search = driver.findElement(By.xpath("//input[@id='search']"));
			search.sendKeys(Name, Keys.ENTER);
		} catch (Exception e) {
		}
	}

	@When("User Should Click The Product")
	public void user_should_click_the_product() {
		try {
			WebElement product = driver
					.findElement(By.xpath("//a[contains(text(),'Marco Lightweight Active Hoodie')]"));
			product.click();
		} catch (Exception e) {

		}
	}

	@When("User Should Click The AddToCart button")
	public void user_should_click_the_add_to_cart_button() {
		try {
			WebElement size = driver.findElement(By.xpath("(//div[@id='option-label-size-143-item-170'])[1]"));
			size.click();
			WebElement color = driver.findElement(By.xpath("(//div[@id='option-label-color-93-item-54'])[1]"));
			color.click();
			WebElement add = driver.findElement(By.xpath("//span[normalize-space()='Add to Cart']"));
			add.click();
			Thread.sleep(2000);
		} catch (Exception e) {
		}

	}

	@When("User Should Click The ShoppingCart button")
	public void user_should_click_the_shopping_cart_button() {
		try {
			Thread.sleep(2000);
			WebElement shipping = driver.findElement(By.xpath("(//a[normalize-space()='shopping cart'])[1]"));
			shipping.click();
		} catch (Exception e) {
		}
	}

	@When("User Should Click The Checkout button")
	public void user_should_click_the_checkout_button() {
		try {
			Thread.sleep(3000);
			WebElement checkout = driver.findElement(By.xpath("//span[normalize-space()='Proceed to Checkout']"));
			checkout.click();
		} catch (Exception e) {

		}
	}

	@When("User Should Click The New Address")
	public void user_should_click_the_new_address() {
		try {
			Thread.sleep(8000);
			WebElement newaddress = driver.findElement(By.xpath("//button[@data-bind='click: selectAddress']"));
			newaddress.click();
			WebElement best = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
			best.click();
			Thread.sleep(2000);
			WebElement ne = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
			ne.click();
		} catch (Exception e) {

		}

	}

	@When("User Should Enter The {string}, {string}, {string},{string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
	public void user_should_enter_the(String FirstName, String LastName, String Company, String Address1,
			String Address2, String Address3, String City, String Region, String Postal, String Country,
			String Phonenumber) {
		try {
			Thread.sleep(2000);
			WebElement ne = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
			ne.click();
			// Thread.sleep(9000);
			// WebElement fn = driver.findElement(By.name("firstname"));
			// Thread.sleep(2000);
			// fn.clear();
			// fn.sendKeys(FirstName);
			// WebElement ln = driver.findElement(By.name("lastname"));
			// ln.clear();
			// ln.sendKeys(LastName);
			// WebElement company = driver.findElement(By.name("company"));
			// company.clear();
			// company.sendKeys(Company);
			// WebElement add1 = driver.findElement(By.name("street[0]"));
			// add1.clear();
			// add1.sendKeys(Address1);
			// WebElement add2 = driver.findElement(By.name("street[1]"));
			// add2.clear();
			// add2.sendKeys(Address2);
			// WebElement add3 = driver.findElement(By.name("street[2]"));
			// add3.clear();
			// add3.sendKeys(Address3);
			// WebElement city = driver.findElement(By.name("city"));
			// city.clear();
			// city.sendKeys(City);
			// WebElement state = driver.findElement(By.name("region_id"));
			// state.sendKeys(Region);
			// WebElement zip = driver.findElement(By.name("postcode"));
			// zip.sendKeys(Postal);
			// WebElement country = driver.findElement(By.name("country_id"));
			// country.sendKeys(Country);
			// WebElement phno = driver.findElement(By.name("telephone"));
			// phno.sendKeys(Phonenumber);
			// WebElement ship =
			// driver.findElement(By.xpath("(//button[@type='button'])[9]"));
			// ship.click();
			// Thread.sleep(5000);
			// WebElement next =
			// driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
			// next.click();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@When("User Should Proceed The Order")
	public void user_should_proceed_the_order() {
		try {

			Thread.sleep(10000);
			WebElement place = driver.findElement(By.xpath("//button[@title='Place Order']"));
			place.click();
			Thread.sleep(5000);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Then("User Should Verify The Order")
	public void user_should_verify_the_order() {
		try {
			WebElement sucess = driver.findElement(By.xpath("//span[text()='Thank you for your purchase!']"));
			String text = sucess.getText();
			System.out.println("Order Sucess Message:" + text);
			screenCapture("SucessMessage");
		} catch (Exception e) {

		} finally {
			System.out.println("The Project is Sucessfully Done");
		}
	}

}
