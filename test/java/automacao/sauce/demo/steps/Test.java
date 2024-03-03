package automacao.sauce.demo.steps;

import org.openqa.selenium.By;

import automacao.sauce.demo.metodos.Metodos;
import automacao.sauce.demo.runner.Executa;

public class Test {

	By nome = By.id("standard_user");
	By senha = By.id("secret_sauce");
	By btnLogin = By.xpath("//input[@type='submit']");
	
			public void loginComSucesso() {
		Executa.iniciarTest();
	    Metodos.escrever(nome, "standard_user");
	    Metodos.escrever(senha, "secret_sauce");
	    Metodos.clicar(btnLogin);
	}
}
