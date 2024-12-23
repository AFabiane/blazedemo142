package stepsPO;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.HomePage;
import pages.ReservePage;
import pages.Base;

public class ComprarPassagemPO {
    // Atributos - Ponto Final / Estação Final / Terminal
    final WebDriver driver; // Selenium só pode usar e devolver
                            // 1 - declarar
    private HomePage homePage; // Só eu posso usar a Home (private)
    private ReservePage reservePage; // Só eu posso usar a Reserve (private)

    public String origem;
    public String destino;

    public ComprarPassagemPO(Base base) {
        this.driver = base.driver;
    }

    // As anotações Before e After ficam no Hooks.java

    @Dado("que acesso o site {string} PO")
    public void que_acesso_o_site_po(String url) {
        homePage = new HomePage(driver); // 2 - instanciar
        homePage.acessarHomePage(url); // 3 - usar
        // validar se abriu a página correta através do nome da guia
        assertEquals("BlazeDemo", homePage.lerNomeDaGuia());

    }

    @Quando("seleciono a {string} e {string} PO")
    public void seleciono_a_e_po(String origem, String destino) {
        this.origem = origem;
        this.destino = destino;
        homePage.selecionarOrigemDestino(origem, destino);

        // Ativar a sincronização para o robô executar devar
        // E podermos visualizar o funcionamento
        // Importante: É só como curiosidade ou em caso de problemas
        // O indicado é deixar o robô o mais rápido possível

        synchronized (driver) {
            try {
                driver.wait(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @E("clico no botao Find Flights PO")
    public void clico_no_botao_find_flights_po() {
        homePage.clicarBotaoFindFlights();
        // chama a página seguinte --> Reserve
        reservePage = new ReservePage(driver);

    }

    @Entao("visualiza a lista de voos PO")
    public void visualiza_a_lista_de_voos_po() {
        assertEquals("BlazeDemo - reserve", reservePage.lerNomeDaGuia());
        assertEquals("Flights from " + this.origem + " to " + this.destino + ":",
                reservePage.lerCabecalhoVoos());

        synchronized (driver) {
            try {
                driver.wait(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Quando("clico no {int} PO")
    public void clico_no_po(Integer ordem_do_voo) {
        reservePage.clicarNoVoo(ordem_do_voo);    

        synchronized (driver) {
            try {
                driver.wait(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
