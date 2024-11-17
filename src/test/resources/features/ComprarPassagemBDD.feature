#language: pt
Funcionalidade: Comprar Passagem
    Escolher e comprar passagens aereas

    Cenario: Comprar com Sucesso
        Dado que acesso o site "https://blazedemo.com/"
        Quando seleciono a origem "São Paolo" e destino "Cairo"
        E clico no botao Find Flights
        Entao visualiza a lista de voos

    Esquema do Cenario: Comprar com Sucesso DDT
        Dado que acesso o site "https://blazedemo.com/"
        Quando seleciono a <origem> e <destino>
        E clico no botao Find Flights
        Entao visualiza a lista de voos
    Exemplos:
    | origem      | destino    |
    | "São Paolo" | "Cairo"    |
    | "Boston"    | "London"   |

# QUando houver um OU é melhor separar em 2 ou mais Cenario
#    Cenario: Cadastro Cliente
#        Dado que acesso a pagina de cdastro de Cliente
#        Entao escolho entre PF ou PJ
#       E preencho os dados cadastrais
#        Quando clico em Salvar
#        Entao exibe a mensagem de Cadastrado com Sucesso!

#    Cenario: Cadastro Cliente PF
#        Dado que acesso a pagina de cdastro de Cliente
#        Entao escolho entre "PF"
#        E preencho o Nome, CPF, e data de nascimento
#        E preencho o telefpne e o email
#        Quando clico em Salvar
#        Entao exibe a mensagem de Cadastrado com Sucesso!
#
#    Cenario: Cadastro Cliente PJ
#        Dado que acesso a pagina de cdastro de Cliente
#        Entao escolho entre "PJ"
#        E preencho o Razao Social, CNPJ, e data de fundacao
#        E preencho o telefpne e o email
#        Quando clico em Salvar
#        Entao exibe a mensagem de Cadastrado com Sucesso!

# Testes Nagativos

    Esquema do Cenario: Login Positivo
        Dado que acesso a pagina de Login
        Quando preencho o <email> e a <senha> corretos
        E clico no botao Login
        Entao exibe a mensagem de Login com Sucesso
        Exemplos:
        | email                   | senha      |
        | cliente@iterasys.com.br | Laranja25  | #1 VV

    Esquema do Cenario: Login Negativo
        Dado que acesso a pagina de Login
        Quando preencho o <email> e a <senha> 
        E clico no botao Login
        Entao exibe a mensagem de email ou senha incorretos
        Exemplos:
        | email                   | senha      |
        | cliente@iterasys.com.br | Laranja24  | #2 VF
        | aluno@iterasys.com.br   | Laranja25  | #3 FV
        | aluno@iterasys.com.br   | Laranja24  | #4 FF

    Esquema do Cenario: Login 
        Dado que acesso a pagina de Login
        Quando preencho o <email> e a <senha> 
        E clico no botao Login
        Entao exibe a <mensagem>
        Exemplos:
        | email                   | senha      | tipo | mensagem                  |
        | cliente@iterasys.com.br | Laranja25  | P    | Login com Sucesso         | #1 VV Positivo
        | cliente@iterasys.com.br | Laranja24  | N    | email ou senha incorretos | #2 VF Negativo
        | aluno@iterasys.com.br   | Laranja25  | N    | email ou senha incorretos | #3 FV Negativo
        | aluno@iterasys.com.br   | Laranja24  | N    | email ou senha incorretos | #4 FF Negativo


