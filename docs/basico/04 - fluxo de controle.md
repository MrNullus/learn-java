# Java

## Indices
<!-- TOC -->
* [Java](#java)
  * [Indices](#indices)
  * [Fluxo de Controle](#fluxo-de-controle)
    * [IF](#if-)
      * [Sintaxe](#sintaxe)
    * [ELSE](#else)
      * [Sintaxe](#sintaxe-1)
    * [ELSE IF](#else-if-)
      * [Sintaxe:](#sintaxe-2)
    * [TERNARIO](#ternario)
      * [Sintaxe:](#sintaxe-3)
    * [SWITCH](#switch)
      * [Sintaxee:](#sintaxee)
  * [Usando as estruturas](#usando-as-estruturas)
<!-- TOC -->

--- 


## Fluxo de Controle
É a parte em que usamos estruturas de decisão, por exemplo `if` para determinar como o programa se comportará

Sua sintaxe se baseia em condições -> as **condições** são testes lógicos feitos com operadores lógicos (WTF?)

<img height="200px" src="../resources/wtf-what.gif" width="200px"/>

> Condição lógica é usar operadores lógicos ">", "<", ">=", "<=", "==", "!=", "!" => usamos para gerar valores booleanos, ou seja, verdadeiro ou falso

> Para saber mais consulte |> [Estruturas de Decisão]()

Podemos dizer, então que usamos condições lógicas para servir como aquilo que eu quero que aconteça para executar determinada ação

**Vamos ao código:**
```java
public class FLuxoDeControle {
    public static void main(String[] args) {
        int idade = 19;
        String nome;
        nome = "Punk da Silva";
                
        if (idade >= 18) {
            System.out.println("Você é maior de idade!");
        }
    }
}
```

- Nesse programa de exemplo vimos como é utilizado uma estrutura, caso a condição `idade >= 18`, ele vai executar tudo o que está dentro do bloco do `if`
- Pensa assim, o "computador" ou até melhor a JVM, vai ler o arquivo de cima para baico (top-down), então:
```
        JVM
   (LENDO ARQUIVO)
   
   ~ lendo a primeira linha
   ~ lendo a segunda linha
   ~ etc...
   ~ lendo a linha do if 
        ~ verifica qual operador
        ~ obtem o valor de `idade`
        ~ verifica se o valor de `idade` é maior que `18`
            ~ se for executa o que está dentro do bloco do `if`
        ~ se não for maior, pode ser igual então ele verifica se é igual a `18`
            ~ em caso verdadeiro ele executa o bloco `if`
        ~ caso a ultima verificação for insatisfazivel (falso) 
            ~ ele não executa o bloco `if`
```

### IF 
- Ele é usado quando se quer uma condição for verdadeira 

> O bloco do `if` somente é executado quando a condição é satisfazível (ou seja verdadeira)

#### Sintaxe
```portugol
if (condição) {
    // bloco de código
}
```

### ELSE
- Ele é usado junto com o `IF` para quando se quer controlar o fluxo caso a  condição que foi testada no `if` for falsa (insatisfazível)

> O `else` só terá seu bloco executado, somente se, a codição testa for falsa => testada tanto no `if`  quanto no `else if`

- Sempre e sempre usamos ele com IF ou ELSE-IF, já que como ele não possui teste de condição **ele é apenas usado para controlar caso o teste da condição resulta em falso**

#### Sintaxe
```portugol
if (condição) {
    // bloco de código
} else {
    // bloco de código
}
```

### ELSE IF 
- Usado para fazer mais de uma condição além do `if`

> Ele é sempre usado depois do `if` e antes do `else` (nesse caso pode se usar ou não else, e ele só vai cair no `else` se os  `if` e `else` forem insatisfazíveis)

#### Sintaxe:
```portugol
if (condição) {
    // bloco de código
} else if (condição) {
    // bloco de código
} 
```

> Pense que é o mesmo que eu dizer: 
> - se for verdade execute; 
> - caso isso for verdade execute;


### TERNARIO
- O operador ternario é usado como um `if` e `else` em uma unica linha
- Feito para operações que requerem um controle de fluxo mais simples

> Indicado apenas para verificar **condições simples**

#### Sintaxe:
```portugol
(condição)? true : false 
```
- Vai testar a condição se: 
  - for verdadeira caí no bloco do `true`
  - caso contrario cai no bloco do `false`
- Os parenteses são opcionais

> Lembre-se que o ternario ele é diferente das outras estruturas além de ser simplificado ele retorna o que está dentro do bloco `true` ou `false`


### SWITCH
- Serve para receber uma `constante de condição` que servirá como valor imutavel para os testes, ou seja, usamos um valor especifico para verificar varios casos na mesma estrutura

> Essa `constante de condição` não significa que é o tipo de variavel e sim que o switch usa um dado em todos os testes do caso

- Ele verifica se aquele caso é satisfazivel e executa o bloco de código do respectivo caso

> Tenha em mente que o `switch` só faz testes de igualdade 

#### Sintaxee:
- O switch precisa de no minimo duas coisas:
  - Uso do `break` 
    - Como o `switch` ele não tem um _"fim"_ assim que termina um `case`, precisamos indicar o fim dele então usamos o `break` para quebrar a verificar dos casos
      - Caso contrario, o `switch` vai testar todos os `cases`
  - Uso de um caso `default` (caso padrão, para caso nenhum dos outros casos forem atendidos)
  
```java
switch (constanteDeCondição) {
    case 1:
        // bloco de codigo
        break;
    case 2:
        // bloco de codigo
        break;    
    case 3:
        // bloco de codigo
        break;
    default:
        // bloco de codigo
        break
}
```


---

## Usando as estruturas
```java
/**
 * Programa básico para uso das estruturas de controle => if, else, else-if
 */
public class FLuxoDeControle {
    public static void main(String[] args) {
        int nota = 5;

        System.out.print("Usando if, else-if, else => ");
        if (nota >= 8 && nota <= 10) {
            System.out.println("Você foi aprovado!");
        } else if (nota >= 5 && nota <= 7) {
            System.out.println("Passou raspando, é bom fazer uma atividade extra");
        } else {
            System.out.println("Você está de recuperação!");
        }
        
        String resultado = (nota >= 8 && nota <= 10)? "Aprovado" : "Reprovado"; 
        System.out.println("Usando ternario => " + resultado);
    
        System.out.print("Usando switch-case => ");
        int posicao = 1;
        switch (posicao) {
            case 1:
                System.out.println("Primeiro Lugar");
                break;
            case 2:
                System.out.println("Segundo Lugar");
                break;
            case 3:
                System.out.println("Terceiro Lugar");
                break;
        }
    }
}
```
