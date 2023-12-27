package org.test;

import org.sample.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HookClass extends BaseClass{

	@Before
	 private void beforeStart() {
		getDriver("Chrome");
		getUrl("https://magento.softwaretestingboard.com/");

	}
	@After
	private void afterclose() {
	screenCapture("Project");
	driver.close();

	}

}
