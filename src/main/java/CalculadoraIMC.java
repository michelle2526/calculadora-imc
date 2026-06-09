public interface CalculadoraIMC {

    // Método para calcular o IMC
    double calcularIMC(double peso, double altura);

    // Método para classificar o IMC
    String classificarIMC(double imc);
}