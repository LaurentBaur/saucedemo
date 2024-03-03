package automacao.sauce.demo.runner;

import org.openqa.selenium.chrome.ChromeDriver;

import automacao.sauce.demo.driver.Driver;

public class Executa extends Driver {

	public static void iniciarTest() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	}
}
