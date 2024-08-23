# Java

<!-- TOC -->
* [Java](#java)
  * [Variáveis](#variáveis)
    * [Declaração:](#declaração)
  * [Constantes](#constantes)
<!-- TOC -->

## Variáveis

No Java como é uma **linguagem fortemente tipada**, devemos **definir os tipos das variáveis logo em sua criação**, e ela
sempre será assim.

### Declaração:

Devemos seguir o padrão:

```java
// classe
public class Saida {
    // metodo
    public static void main(String[] args) {
        // Declarando variaveis
        int idade = 19;
        String nome;
        nome = "Punk da Silva";
    }
}
```

- Possuimos algumas maneiras de declarar variaveis:
    - Criando apenas:
        - Como não é passado nenhum valor a JVM preenche essa [variavel]() com um valor base
        - Exemplo:

```java
public class Saida {
    public static void main(String[] args) {
        // DECLARANDO A VARIAVEL
        // tipo   nomeVariavel
        String nome;

        // ATRIBUINDO VALOR A VARIAVEL
        //variavel = valor
        nome = "Punk da Silva";
    }
}
```

- Criando e atribuindo valor:
  - Exemplo:
```java
public class Saida {
    public static void main(String[] args) {
        // DECLARANDO A VARIAVEL
        // tipo   nomeVariavel  =   valor     
           int    idade         =   19;
    }
}
```


- Criando variaveis inline -> nele se pode atribuir valores e declarar na mesma linha -> valendo apenas para variaveis do mesmo tipo:
  - Exemplo:
```java
public class Saida {
    public static void main(String[] args) {
        // DECLARANDO A VARIAVEL
        // tipo   nomeVariavel  =   valor     
           int    idade         =   19, 
                  idade2        =   19;
    }
}
```

## Constantes
As constantes são um tipo de dado que não vai ser mudado durante todo o programa, então se foi definido um valor para ela este valor será constante durante todo o programa
- Em Java usa-se a palavra-chave `final` para definir as constantes

> Durante todo o programa esse valor de `nome` não poderá mudar

```java
final String nome = "Punk Da Silva"; 
```
