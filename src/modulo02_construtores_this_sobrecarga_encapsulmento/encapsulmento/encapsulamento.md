# Encapsulmento

É um princípio que consiste em esconder detalhes de implementação de uma classe, expondo 
apenas operações seguras e que mantenham os objetos em um estado consistente.

## Regra de Ouro

O objeto deve sempre estar em um estado consistente, e a própria classe deve garantir isso.

### Regra geral básica

- Um objeto NÃO deve expor nenhum atributo (modificador de acesso private)

- Atributos devem ser acessados por meio de métodos get e set

Exemplo:

```java
private String name;
private double price;

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public double getPrice() {
    return price;
}

public void setPrice(double price) {
    this.price = price;
}
```