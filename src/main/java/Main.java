import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    // Scanner global
    static Scanner scanner = new Scanner(System.in);

    // Métodos de leitura segura
    public static double lerDouble(String campo) {

        try {

            double valor = scanner.nextDouble();
            scanner.nextLine();

            if (valor <= 0) {

                throw new EntradaInvalidaException(
                        campo + " deve ser positivo!"
                );
            }

            return valor;

        } catch (InputMismatchException e) {

            scanner.nextLine();

            throw new EntradaInvalidaException(
                    "Digite apenas números para " + campo
            );
        }
    }

    public static int lerInt(String campo) {

        try {

            int valor = scanner.nextInt();
            scanner.nextLine();

            if (valor <= 0) {

                throw new EntradaInvalidaException(
                        campo + " deve ser positivo!"
                );
            }

            return valor;

        } catch (InputMismatchException e) {

            scanner.nextLine();

            throw new EntradaInvalidaException(
                    "Digite apenas números inteiros para " + campo
            );
        }
    }

    public static String lerString(String campo) {

        String valor = scanner.nextLine();

        if (valor.isEmpty()) {

            throw new EntradaInvalidaException(
                    campo + " não pode ficar vazio!"
            );
        }

        return valor;
    }

    public static void main(String[] args) {

        SistemaIMC sistema = new SistemaIMC();

        Pessoa pessoaAtual = null;

        boolean ativo = true;

        while (ativo) {

            try {

                CalculadoraRecursiva.linha();

                System.out.println("===== CALCULADORA IMC =====");
                System.out.println("1 - Cadastrar Pessoa");
                System.out.println("2 - Cadastrar Atleta");
                System.out.println("3 - Calcular IMC");
                System.out.println("4 - Exibir Histórico");
                System.out.println("0 - Sair");

                CalculadoraRecursiva.linha();

                System.out.print("Escolha uma opção: ");

                int opcao = lerInt("opção");

                switch (opcao) {

                    case 1:

                        System.out.print("Nome: ");
                        String nome = lerString("Nome");

                        System.out.print("Idade: ");
                        int idade = lerInt("Idade");

                        System.out.print("Peso: ");
                        double peso = lerDouble("Peso");

                        System.out.print("Altura: ");
                        double altura = lerDouble("Altura");

                        pessoaAtual = new Pessoa(
                                nome,
                                idade,
                                peso,
                                altura
                        );

                        System.out.println("Pessoa cadastrada!");
                        break;

                    case 2:

                        System.out.print("Nome: ");
                        String nomeAtleta = lerString("Nome");

                        System.out.print("Idade: ");
                        int idadeAtleta = lerInt("Idade");

                        System.out.print("Peso: ");
                        double pesoAtleta = lerDouble("Peso");

                        System.out.print("Altura: ");
                        double alturaAtleta = lerDouble("Altura");

                        System.out.print("Modalidade: ");
                        String modalidade = lerString("Modalidade");

                        pessoaAtual = new Atleta(
                                nomeAtleta,
                                idadeAtleta,
                                pesoAtleta,
                                alturaAtleta,
                                modalidade
                        );

                        System.out.println("Atleta cadastrado!");
                        break;

                    case 3:

                        if (pessoaAtual == null) {

                            System.out.println(
                                    "Nenhuma pessoa cadastrada!"
                            );

                            break;
                        }

                        // Demonstração da recursão
                        double alturaQuadrado =
                                CalculadoraRecursiva.potencia(
                                        pessoaAtual.getAltura(),
                                        2
                                );

                        System.out.println(
                                "Altura ao quadrado: " +
                                alturaQuadrado
                        );

                        sistema.processar(pessoaAtual);

                        break;

                    case 4:

                        sistema.exibirHistorico();

                        break;

                    case 0:

                        ativo = false;

                        System.out.println("Sistema encerrado!");

                        break;

                    default:

                        throw new EntradaInvalidaException(
                                "Opção inválida!"
                        );
                }

            } catch (EntradaInvalidaException e) {

                System.out.println(
                        "Erro: " + e.getMessage()
                );
            }
        }

        scanner.close();
    }
}