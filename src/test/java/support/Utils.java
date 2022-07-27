package support;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import runner.RunCucumberTest;

import java.util.Random;

import static runner.RunCucumberTest.driver;

public class Utils extends RunCucumberTest {

    //Espere a Condição esperada element aparecer na tela
    public void esperarElementoEstarPresente(By element, int tempo) {
        WebDriverWait wait = new WebDriverWait(driver, tempo);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    //Gera e-mails aleatórios para testes
    public String criarEmailRandon () {
        String email_int = "aleatorio_";
        String email_final = "@aleatorio.com.br";

        Random random = new Random();
        int minimo = 1;
        int maximo = 99999999;
        int resultado = random.nextInt(maximo-minimo) + minimo;

        return email_int + resultado + email_final;
    }
}

