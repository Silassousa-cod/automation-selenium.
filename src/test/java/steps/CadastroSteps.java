package steps;


import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

import org.junit.Assert;
import org.openqa.selenium.By;
import pages.CadastroPage;
import pages.LoginPage;
import runner.RunCucumberTest;



public class CadastroSteps extends RunCucumberTest {

    CadastroPage cadastroPage = new CadastroPage(driver);

    @Quando("eu preencho o formulário de cadastro")
    public void eu_preencho_o_formulário_de_cadastro() {
        cadastroPage.title(1);
        cadastroPage.preencherNome("Silas");
        cadastroPage.preencherSobrenome("Sousa");
        cadastroPage.preencherSenha("fsalfaskfla@1.");
        cadastroPage.dataNascimento(22, 9, "1991");
        cadastroPage.preencherEndereco("AV. Visconde de Suassuna 540");
        cadastroPage.preencherCidade("Recife");
        cadastroPage.preencherEstado("Colorado");
        cadastroPage.preencherCep("50050");
        cadastroPage.preencherTelefone("+550819971966771");
    }

    @Quando("clico em registrar")
    public void clico_em_registrar() {
        cadastroPage.clicarEmRegistrar();
    }

    @Entao("vejo a mensagem de cadastro realizado com sucesso")
    public void vejo_a_mensagem_de_cadastro_realizado_com_sucesso() {
        cadastroPage.validarCadastro();

    }
}
