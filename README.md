# Calculadora de IMC via CLI

## Descrição

Projeto desenvolvido para a disciplina de Programação Orientada a Objetos.

O sistema calcula o Índice de Massa Corporal (IMC) de pessoas e atletas através de uma interface de linha de comando (CLI), aplicando os principais conceitos de Programação Orientada a Objetos em Java.

---

## Tecnologias Utilizadas

* Java 17
* Maven
* Programação Orientada a Objetos (POO)
* Interface de Linha de Comando (CLI)

---

## Funcionalidades

* Cadastro de Pessoa
* Cadastro de Atleta
* Cálculo de IMC
* Classificação do IMC
* Histórico de cálculos realizados
* Tratamento de entradas inválidas
* Menu interativo via terminal

---

## Conceitos de POO Aplicados

### Interface

* `CalculadoraIMC`

Define os contratos para cálculo e classificação do IMC.

### Classe Abstrata

* `PessoaBase`

Serve como base para as demais classes do sistema.

### Encapsulamento

* Atributos privados com métodos getters e setters.

### Herança

* `Pessoa` herda de `PessoaBase`
* `Atleta` herda de `Pessoa`

### Polimorfismo

* Sobrescrita do método `classificarIMC()` na classe `Atleta`.

### Composição

* `SistemaIMC` possui um objeto `Historico`.

### Recursão

* Classe `CalculadoraRecursiva` utilizada para calcular potência.

### Tratamento de Exceções

* Exceção personalizada `EntradaInvalidaException`.

---

## Estrutura do Projeto

```text
src/main/java

├── CalculadoraIMC.java
├── PessoaBase.java
├── Pessoa.java
├── Atleta.java
├── Historico.java
├── SistemaIMC.java
├── CalculadoraRecursiva.java
├── EntradaInvalidaException.java
└── Main.java
```

---

## Como Compilar

No terminal, execute:

```bash
mvn compile
```

---

## Como Executar

Execute a aplicação pela IDE ou utilizando Maven:

```bash
mvn exec:java -Dexec.mainClass="Main"
```

---

## Exemplo de Uso

```text
===== CALCULADORA IMC =====

1 - Cadastrar Pessoa
2 - Cadastrar Atleta
3 - Calcular IMC
4 - Exibir Histórico
0 - Sair

Escolha uma opção:
```

### Exemplo de Resultado

```text
Nome: Michelle
Idade: 30
Peso: 70
Altura: 1.70

Michelle → IMC: 24.22 (Peso normal)
```

---

## Dependências

* JUnit Jupiter 5.10.2

Gerenciada pelo Maven através do arquivo `pom.xml`.

---

