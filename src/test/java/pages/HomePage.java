package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends CommonPage{

    // constructor
    public HomePage(WebDriver driver) {
        super(driver); //driver herdado do CommonPage - super classe
        PageFactory.initElements(driver, this);
    }
    
    // elementos mapeados
    //mapeamento para os combos Origem e Destino
    public By byLocal(String local){
        return By.cssSelector("option[value=\"" + local + "\"]");
        //  toda vez que tem \" a " vai ser ignorada na 1a vez 
        // mas a " vai ser usada na 2a vez
        // fica assim na execução: option[vakue="Rome"]
    }    

    @FindBy(css = ".btn-primary")
    // @FindBy(css = "input[value]")
    WebElement btnFindFlights;

    // ações com os elementos mapeados
}
