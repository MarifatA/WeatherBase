package com.weatherbase.pages;

/*
 * @Author:Crazy Hackers
 * Please guys when adding elements try to give name with small letter:
 * ex: public WebElement clickButton; ( NOT public WebElement ClickButton) :=)
 */
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.weatherbase.utilities.Driver;

public class HomePage {
	private WebDriver driver;

	public HomePage() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}

	public boolean isAt(){
		System.out.println("Current title is: " + driver.getTitle());
		return driver.getTitle().equals("Travel Weather Averages (Weatherbase)");
	}

	@FindBy(xpath = "//table//tbody//tr//img[@src='/gr/f-head-blue.png']")
	public WebElement setUnits;

	@FindBy(linkText = "United States")
	public WebElement unitedStatesLink;

	@FindBy(linkText = "District of Columbia")
	public WebElement dcLink;

	@FindBy(linkText = "Washington")
	public WebElement washingtonLink;

	@FindBy(linkText = "Daily Averages")
	public WebElement dailyAveragesLink;

	@FindBy(xpath = "//div//table//td[.='1']")
	public WebElement march1;

	@FindBy(xpath = "//div[@id='left1']//table//thead//td[1]")
	public WebElement tableDailyWeather;

	@FindBy(xpath = "(//div[@id='left1']//table//thead//tr[@class='bb'])[1]")
	public WebElement temperature;// *[@id=\"left1\"]/table/thead/tr[2]/td[2]/b

	@FindBy(xpath = "(//div[@id='left1']//table//thead//tr[@class='bb'])[2]")
	public WebElement dewpoint;

	@FindBy(xpath = "//*[@id='left-170']/ul/li[11]/a")
	public WebElement northAmerica;

	@FindBy(xpath = "//*[@id='header-block']/table/tbody/tr[2]/td[6]/table/tbody/tr[2]/td/img")
	public WebElement F;

	@FindBy(linkText = "United States of America")
	public WebElement unitedStatesOfAmerica;

	@FindBy(xpath = "//*[@id='left-content']/table/tbody/tr[2]/td[1]")
	public WebElement averageTemperature;

	@FindBy(xpath = "//*[@id='left-content']/table/tbody/tr[3]/td[1]")
	public WebElement averageHighTemperature;

	@FindBy(xpath = "//*[@id='left-content']/table/tbody/tr[4]/td[1]")
	public WebElement averageLowTemperature;

	@FindBy(xpath = "//*[@id='left-weather-content']/div/table[2]/tbody/tr[2]/td[1]")
	public WebElement AverageTemperatureF;

	@FindBy(xpath = "//*[@id='left-weather-content']/div/table[4]/tbody/tr[2]/td[1]")
	public WebElement AverageHighTemperatureF;

	@FindBy(xpath = "//*[@id='left-weather-content']/div/table[6]/tbody/tr[2]/td[1]")
	public WebElement AverageLowTemperatureF;

	@FindBy(xpath = "//*[@id='header-block']/table/tbody/tr[2]/td[6]/table/tbody/tr[2]/td/a/img")
	public WebElement C;

	@FindBy(xpath = "//*[@id='left-weather-content']/div/table[2]/tbody/tr[2]")
	public WebElement annual;

	public void containsFahrengeit() {
		assertTrue(temperature.getText().contains("°F"));
		assertTrue(dewpoint.getText().contains("°F"));
	}

	public void containsCelcius() {
		assertTrue(temperature.getText().contains("°C"));
		assertTrue(dewpoint.getText().contains("°C"));
	}

	@FindBy(xpath = "(//div//table//tr//div//font//a[@class='grayglow'])[2]")
	public WebElement celciusNearTable;

	@FindBy(xpath = "//*[@id=\"left-170\"]/ul/li[1]/a")
	public WebElement Africa;

	@FindBy(xpath = "//*[@id=\"left-170\"]/ul/li[4]/a")
	public WebElement Asia;

	@FindBy(xpath = "//*[@id=\"left-170\"]/ul/li[5]/a")
	public WebElement Australia;
	@FindBy(xpath = "//*[@id=\"left-170\"]/ul/li[6]/a")
	public WebElement Caribbean;

	@FindBy(xpath = "//*[@id=\"left-170\"]/ul/li[7]/a")
	public WebElement CentralAmerica;

	@FindBy(xpath = "//*[@id=\"left-170\"]/ul/li[13]/a")
	public WebElement SouthAmerica;

	@FindBy(xpath = "//*[@id=\"left-170\"]/ul/li[15]/a")
	public WebElement ShowAll;

	@FindBy(xpath = "//*[@id=\"left-170\"]/ul/li[11]/a")
	public WebElement NorthAmerica;

	@FindBy(xpath = "//*[@id=\"cell300left\"]/ul/li[3]/a")
	public WebElement Usa;
	@FindBy(xpath = "//*[@id=\"cell300left\"]/ul/li[10]/a")
	public WebElement Columbia;

	@FindBy(xpath = "//*[@id=\"cell300left\"]/ul/li[1]/a")
	public WebElement Washington2;

	@FindBy(id = "headerfront")
	public WebElement CurrentConditions;

	@FindBy(xpath = "//*[@id=\"condition-table\"]/tbody/tr[1]/td[2]/span[1]")
	public WebElement Temperature;

	@FindBy(xpath = "//*[@id=\"condition-table\"]/tbody/tr[1]/td[3]/span[1]")
	public WebElement Humidity;

	@FindBy(xpath = "//*[@id=\"condition-table\"]/tbody/tr[1]/td[4]/span[1]")
	public WebElement Wind;

	@FindBy(xpath = "//*[@id=\"condition-table\"]/tbody/tr[1]/td[5]/span[1]")
	public WebElement Sunset;

	@FindBy(xpath = "//*[@id=\"condition-sub-table\"]/tbody/tr[2]/td/span/b")
	public WebElement cloud;
	@FindBy(xpath = "//*[@id=\"condition-table\"]/tbody/tr[2]/td[1]/span[1]")
	public WebElement Visibility;
	@FindBy(xpath = "//*[@id=\"condition-table\"]/tbody/tr[2]/td[2]/span[1]")
	public WebElement Dew;
	@FindBy(xpath = "//*[@id=\"condition-table\"]/tbody/tr[2]/td[3]/span[1]")
	public WebElement Preassure;
	@FindBy(xpath = "//*[@id=\"condition-table\"]/tbody/tr[2]/td[4]/span[1]")
	public WebElement LocalTime;
	
	@FindBy ( xpath = "(//img[@align='right'])[1]")
	public WebElement blueImgAvgTemp;
	@FindBy ( xpath = "//iframe[@class='fancybox-iframe']")
	public WebElement iframe;
	@FindBy ( xpath = "//*[@text-anchor='middle'][@class='highcharts-title']")
	public WebElement iframeAvgTemp;
	@FindBy ( xpath = "//*[@text-anchor='middle'][@class='highcharts-subtitle']")
	public WebElement iframeWashingtonDC;
	@FindBy ( xpath = "//*[@text-anchor='middle'][@class=' highcharts-yaxis-title']")
	public WebElement iframeFahrenheit;
	@FindBy ( xpath = "//a[@href='/weather/weatherall.php3?s=50427&units=']")
	public WebElement showAllData;
	@FindBy( xpath = "(//div[@id='headerfont'])[5]")
	public WebElement weatherAvgSummary;
	@FindBy ( xpath = "//a[.='Show Summary']")
	public WebElement showSummary;
	@FindBy ( xpath = "//div[.='SHARE']")
	public WebElement SHARE;
	@FindBy ( xpath = "//div[.='PRINT THIS DATA']")
	public WebElement printThisData;
	@FindBy ( xpath = "//a[@id='print-icon']")
	public WebElement printThisDataButton;
	@FindBy ( id = "plugin")
	public WebElement printPage;
	@FindBy ( className = "cancel")
	public WebElement cancelButton;
	@FindBy ( xpath = "//button[.='Print']")
	public WebElement printButton;
	@FindBy ( xpath = "//input[@class='page-settings-all-radio']")
	public WebElement aLLRadioButton;
	@FindBy ( xpath = "(//a[@style='color:#bbbbbb;'])[2]")
	public WebElement features;
	@FindBy( xpath = "(//*[@id=\"header-nav\"])[2] //a")
	public List<WebElement> elements;
	@FindBy ( xpath = "(//*[@id=\"header-nav\"])[2] //a[5]")
	public WebElement climateCalculators;
	@FindBy ( xpath = "//div[@id='subsubheaderfont']")
	public List<WebElement> weatherCalculatorsHeaders;
	@FindBy ( xpath = "//input[@name='mph']")
	public WebElement mphInput;
	@FindBy ( xpath = "//input[@name='kmh']")
	public WebElement kmhInput;
	@FindBy ( xpath = "//input[@name='knots']")
	public WebElement knotsInput;
	@FindBy ( xpath = "//input[@name='meters']")
	public WebElement metersInput;
	@FindBy ( xpath = "(//input[@type='image']) [7]")
	public WebElement computeButton;
	
	public boolean convertWindSpeedCheck() {
		int kmh = Integer.parseInt(kmhInput.getAttribute("value"));
		int knots = Integer.parseInt(knotsInput.getAttribute("value"));
		int meters = Integer.parseInt(metersInput.getAttribute("value"));
		if(kmh==23 && knots==12 && meters==6 ) {
			return true;
		}
		return false;
	}
	
	public boolean checkWeatherElements() {
		if(weatherCalculatorsHeaders.size()==7) {
			return true;
			}
			return false;
	}
	
	public boolean checkElements() {
		if(elements.size()==6) {
		return true;
		}
		return false;
	}
	
	public void changeFrame() {
		driver.switchTo().frame(iframe);
	}
	@FindBy(xpath = "//*[@id=\"header-block\"]/table/tbody/tr[2]/td[6]/table/tbody/tr[2]/td/img")
	public WebElement Farenheit;
	@FindBy(xpath = "//*[@id=\"header-browse-features\"]/a[1]")
	public WebElement Browser;
	@FindBy(xpath = "//*[@id=\"header-nav\"]/a[1]")
	public WebElement Af;
	@FindBy(xpath = "//*[@id=\"header-nav\"]/a[2]")
	public WebElement As;
	@FindBy(xpath = "//*[@id=\"header-nav\"]/a[3]")
	public WebElement Au;
	@FindBy(xpath = "//*[@id=\"header-nav\"]/a[4]")
	public WebElement Car;
	@FindBy(xpath = "//*[@id=\"header-nav\"]/a[5]")
	public WebElement CA;
	@FindBy(xpath = "//*[@id=\"header-nav\"]/a[6]")
	public WebElement Eu;
	@FindBy(xpath = "//*[@id=\"header-nav\"]/a[7]")
	public WebElement ME;
	@FindBy(xpath = "//*[@id=\"header-nav\"]/a[8]")
	public WebElement NA;
	@FindBy(xpath = "//*[@id=\"header-nav\"]/a[9]")
	public WebElement Sa;
	@FindBy(xpath = "//*[@id=\"header-nav\"]/a[10]")
	public WebElement Showa;
	@FindBy(css = "<div id=\"subheaderfont\" style=\"color:#ffffff; text-shadow:none;\">FEATURES</div>")
	public WebElement Features;
	@FindBy(xpath = "//*[@id=\"footer\"]/center/table/tbody/tr[1]/td[2]/ul/li[1]/a")
	public WebElement CompareCities;
	@FindBy(xpath = "//*[@id=\"footer\"]/center/table/tbody/tr[1]/td[2]/ul/li[2]/a")
	public WebElement VacationF;
	@FindBy(xpath = "//*[@id=\"footer\"]/center/table/tbody/tr[1]/td[2]/ul/li[3]/a")
	public WebElement WeatherR;
	@FindBy(xpath = "//*[@id=\"footer\"]/center/table/tbody/tr[1]/td[2]/ul/li[4]/a")
	public WebElement WeatherGlo;
	@FindBy(xpath = "//*[@id=\"footer\"]/center/table/tbody/tr[1]/td[2]/ul/li[5]/a")
	public WebElement ClimateCal;

	@FindBy(css = "<div id=\"subsubheaderfont\">CONVERT TEMPERATURE&nbsp;</div>")
	public WebElement convertT;
	@FindBy(css = "<div id=\"subsubheaderfont\">COMPUTE WIND CHILL&nbsp;</div>")
	public WebElement computeWind;
	@FindBy(css = "<div id=\"subsubheaderfont\">COMPUTE HEAT INDEX&nbsp;</div>")
	public WebElement CompH;
	@FindBy(css = "<div id=\"subsubheaderfont\">CONVERT WIND SPEED&nbsp;</div>")
	public WebElement convertWind;
	@FindBy(css = "<div id=\"subsubheaderfont\">COMPUTE RELATIVE HUMIDITY&nbsp;</div>")
	public WebElement reHumidity;
	@FindBy(css = "<div id=\"subsubheaderfont\">CONVERT PRESSURE&nbsp;</div>")
	public WebElement ConPressure;
	@FindBy(css = "<div id=\"subsubheaderfont\">CONVERT PRECIPITATION&nbsp;</div>")
	public WebElement Precip;

	public void containsFarenheit() {

		assertTrue(Farenheit.isDisplayed());
		assertTrue(Farenheit.getText().contains("F"));
		assertTrue(Farenheit.isSelected());


	}

	public double extractNumberFromString(String targetString) {

		String onlyNum = "";
		for (int i = 0; i < targetString.length(); i++) {

			char eachChar = targetString.charAt(i);

			if (Character.isDigit(eachChar)) {

				onlyNum += eachChar;
			}
		}
		System.out.println(Double.parseDouble(onlyNum));

		return Double.parseDouble(onlyNum);
	}

	public double convertFahToCel() {
		double fah = Math.round(extractNumberFromString(temperature.getText()));

		double result = (fah - 32) * 5 / 9;
		System.out.println(result);
		return result;

	}
}
