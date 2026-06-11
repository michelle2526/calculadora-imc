#  Calculadora de IMC via CLI

##  1. Descrição

Projeto desenvolvido para a disciplina de Programação Orientada a Objetos.

O sistema calcula o Índice de Massa Corporal (IMC) de pessoas e atletas através de uma interface de linha de comando (CLI), aplicando conceitos fundamentais de Programação Orientada a Objetos como herança, polimorfismo, encapsulamento, composição e recursão.

---

##  2. Pré-requisitos

Para executar o projeto, é necessário:

- Java JDK 17 ou superior instalado
- Terminal (CMD, PowerShell ou VS Code Terminal)

---

##  3. Como Compilar

Dentro da pasta raiz do projeto, execute:

```bash
javac -d out src/main/java/*.java


4. Como Executar

Após compilar, execute o sistema com: java -cp out Main

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


📁 6. Estrutura do Projeto
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

