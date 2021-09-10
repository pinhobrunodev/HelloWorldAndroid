# Exercício 1 - Alô, Mundo!

## REGRAS

A avaliação será realizada por meio de testes automatizados. Os casos de teste estão implementados na classe `CorrecaoTest`. Para obter a nota máxima, seu código deve passar em todos os casos de teste.

Para executar os casos de teste através do Android Studio, clique com o botão direito sobre a classe `CorrecaoTest` e escolha a opção `Run 'CorrecaoTest'`. Aguarde o final da execução.

A entrega dos exercícios será feita através do [GitHub Classroom](https://classroom.github.com/) (não confundir com Google Classroom). Confira abaixo o link para a página do exercício no GitHub Classroom, que inclui informações como o prazo de entrega.

Você precisará usar o sistema de controle de versão Git para submeter o seu código como resposta dos exercícios.

## ESPECIFICAÇÃO

<!-- http://asciiflow.com/ -->

```
+---------------------+
|                     |
|    Fulano           |
|  +---------------+  |
|                     |
|  +---------------+  |
|  | Cumprimentar  |  |
|  +---------------+  |
|                     |
|    Alô, Fulano!     |
|                     |
+---------------------+

```

Voce deve começar seu app a partir da Activity, `br.com.mariojp.exercise1.MainActivity`.

Seu App deve deve conter os três elementos a seguir:

- uma caixa de texto, inicialmente vazia, com id `editNome`
- um botão, com id `btnCumprimentar` e texto `Cumprimentar`
- um rótulo, com id `labelMensagem` e texto inicial "Alô, Mundo!"

Comportamento esperado:

- Ao digitar um texto na caixa de texto e clicar no botão, o texto do rótulo deve mudar para "Alô, X!", trocando X pelo texto digitado na caixa de texto.
- O texto do rótulo e da caixa de texto não deve se alterar quando a tela é rotacionada.