public class SistemaIMC {

    // Composição
    private Historico historico = new Historico();

    // Processar cálculo
    public void processar(Pessoa pessoa) {

        // Calcula IMC
        double imc = pessoa.calcularIMC(
                pessoa.getPeso(),
                pessoa.getAltura()
        );

        // Classificação
        String classificacao =
                pessoa.classificarIMC(imc);

        // Texto formatado
        String resultado =
                pessoa.getNome() +
                " → IMC: " +
                String.format("%.2f", imc) +
                " (" + classificacao + ")";

        // Salva no histórico
        historico.adicionar(resultado);

        // Exibe no console
        System.out.println(resultado);
    }

    // Mostrar histórico
    public void exibirHistorico() {

        historico.exibir();
    }
}