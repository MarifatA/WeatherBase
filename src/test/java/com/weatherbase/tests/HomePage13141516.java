package com.weatherbase.tests;

import com.weatherbase.utilities.TestBase;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import com.weatherbase.pages.HomePage;

public class HomePage13141516 extends TestBase {

	private String expectedTitle = "United States of America Travel Weather Averages (Weatherbase)";
	private String DCTitle = "District of Columbia, United States of America Travel Weather Averages (Weatherbase)";
	private String WashingtonTitle = "Washington, District of Columbia Travel Weather Averages (Weatherbase)";
	private Object expectedWeatherAvgSummary = "MONTHLY - WEATHER AVERAGES SUMMARY ";
	private Object expectedSummary = "Show All Data";
	private String expectedClimateTitle = "Weatherbase Weather Reference and Calculators";
	private String expectedClimateURL = "http://www.weatherbase.com/reference.php3";
	HomePage home = new HomePage();

	//@Test(priority = 12)
	public void groupVerificationTest() throws InterruptedException {

		// Step 1
		assertTrue(home.isAt());
		assertTrue(home.F.isDisplayed());
		System.out.println("the Fahrenheit is selected");
		Thread.sleep(2000);
		// Step 2
		home.unitedStatesLink.click();
		assertEquals(driver.getTitle(), expectedTitle);

		// Step 3
		home.dcLink.click();
		assertEquals(driver.getTitle(), DCTitle);

		// Step 4
		home.washingtonLink.click();
		assertEquals(driver.getTitle(), WashingtonTitle);

		// Step 5
		home.blueImgAvgTemp.click();
		home.changeFrame();
		Thread.sleep(2000);
		assertTrue(home.iframeAvgTemp.isDisplayed());
		assertTrue(home.iframeWashingtonDC.isDisplayed());
		assertTrue(home.iframeFahrenheit.isDisplayed());

	}

	//@Test(priority = 13)
	public void verifyMonthlyAvgTest() throws InterruptedException {
		// Step 1
		assertTrue(home.isAt());
		assertTrue(home.F.isDisplayed());
		System.out.println("the Fahrenheit is selected");
		Thread.sleep(2000);
		// Step 2
		home.unitedStatesLink.click();
		assertEquals(driver.getTitle(), expectedTitle);

		// Step 3
		home.dcLink.click();
		assertEquals(driver.getTitle(), DCTitle);

		// Step 4
		home.washingtonLink.click();
		assertEquals(driver.getTitle(), WashingtonTitle);

		// Step 5
		home.showAllData.click();
		Thread.sleep(2000);
		assertFalse(home.weatherAvgSummary.getText().equals(expectedWeatherAvgSummary));
		assertFalse(home.showSummary.getText().equals(expectedSummary));

	}

	@Test(priority = 14)
	public void verifyShareDataTest() throws InterruptedException {
		// Step 1
		assertTrue(home.isAt());
		assertTrue(home.F.isDisplayed());
		System.out.println("the Fahrenheit is selected");
		Thread.sleep(2000);
		// Step 2
		home.unitedStatesLink.click();
		assertEquals(driver.getTitle(), expectedTitle);

		// Step 3
		home.dcLink.click();
		assertEquals(driver.getTitle(), DCTitle);

		// Step 4
		home.washingtonLink.click();
		assertEquals(driver.getTitle(), WashingtonTitle);

		// Step 5
		assertEquals(driver.getTitle(), WashingtonTitle);
		assertTrue(home.SHARE.isDisplayed());
		assertTrue(home.printThisData.isDisplayed());
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(home.printThisDataButton));
		
		// Step 6-7
		home.printThisDataButton.click();
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
		assertTrue(home.printButton.isDisplayed());
		assertTrue(home.aLLRadioButton.isSelected());
		driver.switchTo().frame("pdf-viewer");
		assertTrue(home.printPage.isDisplayed());
		driver.switchTo().defaultContent();
		home.cancelButton.click();
		Thread.sleep(2000);
		driver.switchTo().window(driver.getWindowHandles().toArray()[0].toString());
	}
	
	@Test(priority = 15)
	public void convertWindSpeedTest() {
		
		// Step 1-2
		assertTrue(home.isAt());
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(home.features));
		home.features.click();
		assertTrue(home.checkElements());
		wait.until(ExpectedConditions.elementToBeClickable(home.climateCalculators));
		
		// Step 3
		home.climateCalculators.click();
		assertEquals(driver.getTitle(), expectedClimateTitle);
		assertEquals(driver.getCurrentUrl(), expectedClimateURL);
		assertTrue(home.checkWeatherElements());
		
		// Step 4
		home.mphInput.sendKeys("14");
		wait.until(ExpectedConditions.elementToBeClickable(home.computeButton));
		Actions action = new Actions(driver);
		action.moveToElement(home.computeButton).perform();
		assertTrue(home.convertWindSpeedCheck());
		
	}
	
	
	

}
