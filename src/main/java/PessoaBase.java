public abstract class PessoaBase {

    // Atributos protegidos
    protected String nome;
    protected int idade;

    // Construtor
    public PessoaBase(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método abstrato
    public abstract String exibirPerfil();

    // Getters
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}