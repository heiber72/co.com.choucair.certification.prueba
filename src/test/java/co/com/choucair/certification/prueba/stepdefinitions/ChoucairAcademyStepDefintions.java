package co.com.choucair.certification.prueba.stepdefinitions;

import co.com.choucair.certification.prueba.model.AcademyChoucairData;
import co.com.choucair.certification.prueba.questions.Answer;
import co.com.choucair.certification.prueba.tasks.Login;
import co.com.choucair.certification.prueba.tasks.OpenUp;
import co.com.choucair.certification.prueba.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;


public class ChoucairAcademyStepDefintions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());}

    @Given("^than Luis wants to learn automation at the Academy Choucair$")
    public void thanLuisWantsToLearnAutomationAtTheAcademyChoucair(List<AcademyChoucairData> academyChoucairData) throws Exception {
        OnStage.theActorCalled("Luis").wasAbleTo(OpenUp.thePage(),
                (Login.onThePage(academyChoucairData.get(0).getStrUser(), academyChoucairData.get(0).getStrPassword())));
    }


    @When("^he search for the course Foundation Level on the Choucair Academy platform$")
    public void heSearchForTheCourseFoundationLevelOnTheChoucairAcademyPlatform(List<AcademyChoucairData> academyChoucairData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(academyChoucairData.get(0).getStrCourse()));
    }

    @Then("^he find the course called Foundation Level$")
    public void heFindTheCourseCalledFoundationLevel(List<AcademyChoucairData> academyChoucairData) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(academyChoucairData.get(0).getStrCourse())));
    }

}
