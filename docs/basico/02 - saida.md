# Java Básico

## Saída
Para a sáida no Java -> impressão de dados
Temos algumas formas principais:
- `print`   -> imprime uma mensagem
  - Exemplo
```java
public class Saida {
    // metodo
    public static void main(String[] args) {
        System.out.print("Sáida de um jeito");
    }
}
```

- `println` -> imprime uma mensagem com quebra de linha => adiciona um \n antes do texto
  - Exemplo
```java
public class Saida {
    // metodo
    public static void main(String[] args) {
        System.out.println("Saida com uma nova linha -> \n no final do texto o que gera uma quebra de linha");
    }
}
```

- `printf`  -> imprime uma mensagem formatada, sem quebra de linha, por padrão
  - para isso devemos passar os valores a serem preenchidos com dentro da mensagem: `%tipoDado`
  - Exemplo:
```java
public class Saida {
    // metodo
    public static void main(String[] args) {
        System.out.printf("Fazer um print com formatação: %s", "Mensagem a ser incluida");
    }
}
```
- Alguns dos tipos de flags => são os indicadores de onde serão colocados os argumentos passados no `printf` e seu tipo:

| Flag | Tipo   |
|------|--------|
| %s   | string |
| %d   | int    |
| %f   | float  |



> Todos esses prints etão dentro do pacote base do Java, chamado: `System` -> que por vez é usado para diversas funções além do print, como entrada de valores


## Código
[02 - saida.md](02%20-%20saida.md)

---

[01 - helloworld.md](01%20-%20helloworld.md) <- Anterior | Próximo -> 