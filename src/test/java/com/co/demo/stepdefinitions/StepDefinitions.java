package com.co.demo.stepdefinitions;

import com.co.demo.tasks.Interact;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class StepDefinitions {

    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("el usuario está en la pantalla de inicio")
    public void el_usuario_esta_en_la_pantalla_de_inicio() {
        OnStage.theActorCalled("Miguel").can(BrowseTheWeb.with(DriverBase.initializeDriver()));

    }

    @When("el usuario hace algo")
    public void el_usuario_hace_algo() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Interact.on()
        );
    }

    @Then("debería ocurrir algo")
    public void deberia_ocurrir_algo() {
        // Implementación del paso
    }
}
