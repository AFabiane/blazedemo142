package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReservePage extends CommonPage{
    // constructor
    public ReservePage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
        
    }

    // mapeamento de elementos
    @FindBy(css = "h3")
    WebElement flightsHeader; // cabeçalho dos vôos
    public By byOrder(int ordem_do_voo){
        return By.xpath("//table[@class='table']/tbody/tr[" + ordem_do_voo + "]//input[@type='submit']");       
    }


    // ações
    public String lerCabecalhoVoos(){
        return flightsHeader.getText();
    }

    public void clicarNoVoo(int ordem_do_voo){
        driver.findElement(byOrder(ordem_do_voo)).click();
    }
    
  }
