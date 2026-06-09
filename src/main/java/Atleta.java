public class Atleta extends Pessoa {

    // Atributo privado
    private String modalidade;

    // Construtor
    public Atleta(String nome,
                   int idade,
                   double peso,
                   double altura,
                   String modalidade) {

        super(nome, idade, peso, altura);

        this.modalidade = modalidade;
    }

    // Getter
    public String getModalidade() {
        return modalidade;
    }

    // Polimorfismo
    @Override
    public String classificarIMC(double imc) {

        if (imc < 20.0) {
            return "Abaixo do ideal para atleta";
        }

        else if (imc < 27.0) {
            return "Ideal para atleta";
        }

        else {
            return "Acima do ideal para atleta";
        }
    }

    // Sobrescrita do perfil
    @Override
    public String exibirPerfil() {

        return super.exibirPerfil() +
               " | Modalidade: " + modalidade;
    }
}