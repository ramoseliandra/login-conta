package steps;

import driver.DriverFactory;
import elementos.Elementos;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;
import runner.Executa;

public class FazerLoginTeste extends DriverFactory{
	
	Metodos metodos = new Metodos();
	Elementos el = new Elementos();
	
	@Before
	public static void AbrirNavegador() {
		Executa.abrirNvegador();
		
	}
	
	

		@Given("que esteja na tela de login")
		public void queEstejaNaTelaDeLogin() {
			metodos.clicar(el.btnPrivacidade);
			
		  
		}



		@When("digito a agencia e conta")
		public void digitoAAgenciaEConta() {
			metodos.escrever(el.agencia, "");
			metodos.escrever(el.conta, "");
		   
		}
		@Then("login realizado com sucesso")
		public void loginRealizadoComSucesso() {
			metodos.clicar(el.btnEnter);
		    
		}




}
