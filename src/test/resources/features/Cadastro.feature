#Escrita de Casos de Testes em Gherkin

#Responsável - Silas Emanuel

# language: pt

  @cadastro
  Funcionalidade: Cadastar um novo usuário na plataforma
    Eu como novo usuário
    quero me cadastrar na aplicação
    para conseguir realizar compras

  @cadastro-sucesso
  Cenario: Registrar um novo usuário com sucesso
    Dado que estou na tela de login
    E acesso o cadastro de usuário
    Quando eu preencho o formulário de cadastro
    E clico em registrar
    Entao vejo a mensagem de cadastro realizado com sucesso

