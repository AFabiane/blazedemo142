package pages;

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

    // ações
    public String lerCabecalhoVoos(){
        return flightsHeader.getText();
    }
    
  }
