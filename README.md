# 🧮 Calculadora de IMC via CLI

---

## 1. Descrição

Projeto desenvolvido para a disciplina de Programação Orientada a Objetos.

O sistema calcula o Índice de Massa Corporal (IMC) de pessoas e atletas por meio de uma interface de linha de comando (CLI), aplicando conceitos fundamentais de Programação Orientada a Objetos como herança, polimorfismo, encapsulamento, composição e recursão.

---

## 2. Pré-requisitos

- Java JDK 17 ou superior instalado  
- Terminal (CMD, PowerShell ou VS Code Terminal)

---

## 3. Como Compilar

Dentro da pasta raiz do projeto, execute:

```bash
javac -d out src/main/java/*.java

4. Como Executar

Após compilar, execute:

java -cp out Main

5. Demonstração de Uso

Ao iniciar o sistema, será exibido o menu:

===== CALCULADORA IMC =====

1 - Cadastrar Pessoa
2 - Cadastrar Atleta
3 - Calcular IMC
4 - Exibir Histórico
0 - Sair

Escolha uma opção:
Exemplo de saída:
Nome: Michelle  
Idade: 30  
Peso: 70  
Altura: 1.70  

Michelle → IMC: 24.22 (Peso normal)
6. Estrutura do Projeto
src/main/java/

├── Atleta.java
├── CalculadoraIMC.java
├── CalculadoraRecursiva.java
├── EntradaInvalidaException.java
├── Historico.java
├── Main.java
├── Pessoa.java
├── PessoaBase.java
├── SistemaIMC.java

out/ (gerado após compilação)
📌 Responsabilidade das Classes
Main.java → Menu principal e execução do sistema (CLI)
PessoaBase.java → Classe abstrata com nome e idade
Pessoa.java → Implementa cálculo de IMC e encapsulamento
Atleta.java → Herança e polimorfismo no cálculo do IMC
SistemaIMC.java → Orquestra o sistema e controla o histórico
Historico.java → Armazena os cálculos realizados
CalculadoraIMC.java → Interface com contrato de cálculo
CalculadoraRecursiva.java → Implementa recursão (potência)
EntradaInvalidaException.java → Tratamento de erros de entrada
7. Conceitos de POO Aplicados

Este projeto aplica os principais conceitos de Programação Orientada a Objetos:

Encapsulamento → atributos privados com getters e setters validados
Herança → Atleta herda de Pessoa, que herda de PessoaBase
Polimorfismo → sobrescrita do método classificarIMC() na classe Atleta
Interface → definição de contrato em CalculadoraIMC
Classe Abstrata → PessoaBase como modelo base
Composição → SistemaIMC possui um objeto Historico
Recursão → cálculo de potência em CalculadoraRecursiva
Tratamento de Exceções → EntradaInvalidaException para validações