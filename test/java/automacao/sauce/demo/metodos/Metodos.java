package automacao.sauce.demo.metodos;

import org.openqa.selenium.By;

import automacao.sauce.demo.driver.Driver;

public class Metodos extends Driver {

	public static void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);

	}

    public static void clicar(By elemento) {
    	driver.findElement(elemento).click();
    	
    }
}
