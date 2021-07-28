package Gatling.stepdefinitions;

import io.cucumber.java.en.Given;
import io.gatling.core.scenario.Simulation;

public class GatlingSteps {

    @Given("^I execute the Gatling simulation with \"([^\"]*)\" users and \"([^\"]*)\" second ramp up time$")
    public void executeGatlingSimulation(int users, int rampUp) {
        Gatling.simulation.BasicSimulation.RunSimulation$.MODULE$.runSimulation(users, rampUp);

    }
}

