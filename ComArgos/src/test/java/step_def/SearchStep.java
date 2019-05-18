package step_def;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HeaderPage;
import pages.ResultPage;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class SearchStep {
HeaderPage headerPage=new HeaderPage ();
ResultPage  resultPage=new ResultPage ();
    @Given("^i am on homepage$")
    public void i_am_on_homepage()  {
       String actual   = headerPage.getCurrentUrl ();
       assertThat(actual,endsWith(".co.uk/"));

    }

    @When ("^i search for product \"([^\"]*)\"$")
    public void i_search_for_product(String product) {
        headerPage.doSearch (product);


    }

    @Then("^i should be able to see the result$")
    public void i_should_be_able_to_see_the_result() {
        String actul =resultPage.headerText ();
        assertThat(actul,is(equalTo (HeaderPage.searchProduct)));



    }



}
