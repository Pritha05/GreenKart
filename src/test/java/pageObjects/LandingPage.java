package pageObjects;

import org.jspecify.annotations.NonNull;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementUtil;

public class LandingPage {
    public WebDriver driver;
    public ElementUtil elementUtil;

  
    public LandingPage(WebDriver driver){
    this.driver = driver;
    this.elementUtil = new ElementUtil(driver);
}

    public String GetTitleLandingPage(){
        
        return driver.getTitle();   


    }

    By search = By.xpath("//input[@type='search']");
    
    By firstproductName = By.xpath("(//h4[contains(text(),'Tomato')])");
    By secondproductName = By.xpath("//h4[contains(text(),'Beetroot')]");
    By thirdproductName =By.xpath("//h4[contains(text(),'Carrot')]");
    By quantity =By.xpath("//h4[contains(text(),'Tomato')]//following::input[@class='quantity'][1]");
    By addtocart =By.xpath("//h4[contains(text(),'Tomato')]//following::button[1]");
    By addtoBag =By.xpath("//a[@class='cart-icon']");
    By proceedtoCheck= By.xpath("//button[text()='PROCEED TO CHECKOUT']");
    By placeOrder =By.xpath("//button[text()='Place Order']");
    By country =By.xpath("//option[text()='India']");
    By agreeandcondition =By.xpath("//input[@type='checkbox'and @class='chkAgree']");
    By proceed =By.xpath("//button[text()='Proceed']");

    


    public void searchItem(String name){
        driver.findElement(search).sendKeys(name);

    }

   public String getProductName(String product) {
    return driver.findElement(
        By.xpath("//h4[contains(text(),'" + product + "')]")
    ).getText();
}
    
    public void add_to_cart(){

       elementUtil.type(quantity,"3");
       elementUtil.click(addtocart);
    }

    public void add_to_bag(){

        elementUtil.click(addtoBag);
    }

    public void proceedtoCheckout(){

        elementUtil.click(proceedtoCheck);

    }

    public void placeOrder(){

        elementUtil.click(placeOrder);
    }

    public void country(){

        elementUtil.click(country);
        elementUtil.click(agreeandcondition);
    }

    public void proceed(){
        elementUtil.click(proceed);
    }


    
}

