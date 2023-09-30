package runner;

import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import driver.DriverFactory;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src/test/resources/features",
		glue = "",
		tags = "@positivo",
		monochrome = true,
		dryRun = false,
		plugin = {"pretty","html:target/cucumber-report.html"},
		snippets = SnippetType.CAMELCASE
		)

public class Executa extends DriverFactory{
	
	public static void abrirNvegador() {
		
		String url = "https://www.itau.com.br/";
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new  ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
		driver = new ChromeDriver(chromeOptions);
		driver.get(url);
		
		
		
		
		
		
		
		
		
	}

}
