package pages;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.Utils;

public class LoginPage extends Utils {

    WebDriver driver;
    private By create_email_field = By.id("email_create");
    private By create_email_button = By.id("SubmitCreate");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void acessarTelaLogin() {
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        esperarElementoEstarPresente(create_email_field, 15); //Espere o elemento estar presente na tela
        Assert.assertEquals("Não acessou o site",true, driver.findElement(By.id("center_column")).isDisplayed());
    }

    public void preencherEmailCriado() {
        driver.findElement(create_email_field).sendKeys(criarEmailRandon());

    }

    public void clicarEmCriarConta() {

        driver.findElement(create_email_button).click();
    }
}
