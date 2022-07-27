package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import support.Utils;

public class CadastroPage extends Utils {

    WebDriver driver;

    private By titleF = By.id("id_gender2");
    private By titleM = By.id("id_gender1");
    private By nome = By.id("customer_firstname");
    private By sobrenome = By.id("customer_lastname");
    private By senha = By.id("passwd");
    private By selecionarDia = By.id("days");
    private By selecionarMes = By.id("months");
    private By selecionarAno = By.name("years");
    private By endereco = By.id("address1");
    private By cidade = By.id("city");
    private By estado = By.id("id_state");
    private By cep = By.id("postcode");
    private By telefoneCelular = By.id("phone_mobile");
    private By registrar = By.id("submitAccount");

    public CadastroPage(WebDriver driver){
        this.driver = driver;
    }

    public void title(Integer type) {
        esperarElementoEstarPresente(titleM, 20);
        if (type ==1)
            driver.findElement(titleM).click();
        else
            driver.findElement(titleF).click();

    }

    public void preencherNome (String nome1){
        driver.findElement(nome).sendKeys(nome1);
    }

    public void preencherSobrenome (String sobrenome1){
        driver.findElement(sobrenome).sendKeys(sobrenome1);
    }

    public void preencherSenha (String senha1){
        driver.findElement(senha).sendKeys(senha1);
    }

    public void dataNascimento (Integer dia, Integer mes, String ano) {
        Select selecionaDia = new Select(driver.findElement(selecionarDia));
        selecionaDia.selectByIndex(dia);

        Select selecionaMes = new Select(driver.findElement(selecionarMes));
        selecionaMes.selectByIndex(mes);

        Select selecionaAno = new Select(driver.findElement(selecionarAno));
        selecionaAno.selectByValue(ano);
    }

    public void preencherEndereco(String endereco1) {
        driver.findElement(endereco).sendKeys(endereco1);
    }

    public void preencherCidade(String cidade1) {
        driver.findElement(cidade).sendKeys(cidade1);
    }

    public void preencherEstado(String estado1) {
        Select selecionarEstado = new Select(driver.findElement(estado));
        selecionarEstado.selectByVisibleText(estado1);
    }

    public void preencherCep(String cep1) {
        driver.findElement(cep).sendKeys(cep1);
    }

    public void preencherTelefone(String telefoneCelular2) {
        driver.findElement(telefoneCelular).sendKeys(telefoneCelular2);
    }

    public void clicarEmRegistrar() {
        driver.findElement(registrar).click();
    }

    public void validarCadastro () {
        esperarElementoEstarPresente(By.className("button-search"), 20);
        String resultadoAtual = driver.findElement(By.cssSelector("#header > div.nav > div > div > nav > div:nth-child(1) > a > span")).getText();
        Assert.assertEquals("Silas Sousa", resultadoAtual);
    }
}
