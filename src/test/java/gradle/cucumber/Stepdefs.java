package gradle.cucumber;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;

public class Stepdefs{
	private Integer puntos;
	private Double respuesta;
	private Double factor;
	private Integer reduccion;
	
	@Given("Puntos son {int}")
	public void puntos_son(Integer int1) {
		puntos=int1;
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
	}

	@When("Edad es {int}")
	public void edad_es(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		factor = 1.5;
		if(int1>=65 && puntos>=26) {
			reduccion = 200;
			respuesta = 500*factor-reduccion;
		}else if (int1>=65 && puntos<26 ) {
			reduccion = 0;
			respuesta = 500*factor-reduccion;
		}
		
	}

	@Then("Prima es igual a {double}")
	public void prima_es_igual_a(Double int1) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		assertEquals(int1, respuesta);
	}
}
