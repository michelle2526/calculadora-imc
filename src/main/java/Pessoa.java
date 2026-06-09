public class Pessoa extends PessoaBase implements CalculadoraIMC {

    // Atributos privados (encapsulamento)
    private double peso;
    private double altura;
    private boolean ativo;

    // Construtor
    public Pessoa(String nome, int idade, double peso, double altura) {
        super(nome, idade);

        this.peso = peso;
        this.altura = altura;
        this.ativo = true;
    }

    // Getters
    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public boolean isAtivo() {
        return ativo;
    }

    // Setter com validação
    public void setPeso(double peso) {

        if (peso <= 0) {
            throw new IllegalArgumentException("Peso deve ser positivo!");
        }

        this.peso = peso;
    }

    // Implementação do cálculo do IMC
    @Override
    public double calcularIMC(double peso, double altura) {

        return peso / (altura * altura);
    }

    // Implementação da classificação
    @Override
    public String classificarIMC(double imc) {

        if (imc < 18.5) {
            return "Abaixo do peso";
        }

        else if (imc < 25.0) {
            return "Peso normal";
        }

        else if (imc < 30.0) {
            return "Sobrepeso";
        }

        else if (imc < 35.0) {
            return "Obesidade grau I";
        }

        else if (imc < 40.0) {
            return "Obesidade grau II";
        }

        else {
            return "Obesidade grau III";
        }
    }

    // Método herdado da classe abstrata
    @Override
    public String exibirPerfil() {

        return "Nome: " + nome +
               " | Idade: " + idade +
               " | Peso: " + peso +
               "kg | Altura: " + altura + "m";
    }
}