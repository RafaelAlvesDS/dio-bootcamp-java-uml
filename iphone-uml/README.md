# iPhone UML - Bootcamp Java DIO

Este projeto representa a modelagem UML de um iPhone com suas principais funcionalidades.

## Diagrama de Classes

```mermaid
classDiagram
    direction RL

    class Iphone {
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    class ReprodutorMusical {
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
    }

    class AparelhoTelefonico {
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }

    class NavegadorInternet {
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    Iphone ..|> ReprodutorMusical
    Iphone ..|> AparelhoTelefonico
    Iphone ..|> NavegadorInternet
```

## Descrição

O diagrama acima mostra a estrutura do iPhone implementando três interfaces principais:

- **ReprodutorMusical**: Responsável pelas funcionalidades de reprodução de música
- **AparelhoTelefonico**: Responsável pelas funcionalidades de telefone
- **NavegadorInternet**: Responsável pelas funcionalidades de navegação web

A classe `Iphone` implementa todas essas interfaces, demonstrando o conceito de herança múltipla por meio de interfaces em Java.