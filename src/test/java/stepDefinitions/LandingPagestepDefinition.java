package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import utils.Base;

public class LandingPagestepDefinition extends Base {

    public WebDriver driver;
    public LandingPage LP;

    @Given("the user is on greenKart landing page")
    public void user_is_on_greencart_landingpage() throws IOException {

        driver = initializeDriver();
   
        LP = new LandingPage(driver);

        Assert.assertTrue(LP.GetTitleLandingPage().contains("GreenKart"));

        System.out.println("User is on landing page");
    }

    @When("^user search with shortname (.+) and extracted actual name of the product$")
        public void user_is_on_searchingpage(String shortName) throws IOException, InterruptedException{
             
            LP.GetTitleLandingPage();
            LP.searchItem(shortName);
            Thread.sleep(2000);

            
            String fullName = "";

    if(shortName.equalsIgnoreCase("tom")) {
        fullName = LP.getProductName("Tomato");
    }
    else if(shortName.equalsIgnoreCase("beet")) {
        fullName = LP.getProductName("Beetroot");
    }
    else if(shortName.equalsIgnoreCase("car")) {
        fullName = LP.getProductName("Carrot");
    }

    System.out.println(fullName);
            Thread.sleep(2000);


        }

        
    @Then("user clicks on add to cart")
    public void user_clicks_on_add_to_cart(){
        LP.add_to_cart();

    }

    @Then("user clicks on bag")
    public void user_clicks_on_bag(){

        LP.add_to_bag();

    }

    @Then("user clicks proceed to checkout")
    public void user_clicks_on_proceedToCheckout(){

        LP.proceedtoCheckout();
    }

    @Then("user clicks place an order")
    public void placeOrder(){

        LP.placeOrder();
    }

    @Then("user selects on country")
    public void country(){

        LP.country();
       
    }

    @And("user clicks on proceed")
    public void proceed(){

        LP.proceed();
    }
    
         
    }
