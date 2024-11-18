package pages;

import org.openqa.selenium.WebDriver;

public class CommonPage{

    public WebDriver driver ; // bola quando ele recebe o passe

    // construtor - conecta o exterior com o interior da classe
    public CommonPage(WebDriver driver){
        this.driver = driver;
    }

    public String lerNomeDaGuia(){
        return driver.getTitle(); // lê titulo da guia / página
    }
    
}