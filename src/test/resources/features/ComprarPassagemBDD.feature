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