#language: pt
Funcionalidade: Comprar Passagem
    Escolher e comprar passagens aereas

    Cenario: Comprar com Sucesso
        Dado que acesso o site "https://blazedemo.com/"
        Quando seleciono a origem "São Paolo" e destino "Cairo"
        E clico no botão Find Flights
        Entao visualiza a lista de voos 