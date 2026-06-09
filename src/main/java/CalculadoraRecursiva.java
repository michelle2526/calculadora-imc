public class CalculadoraRecursiva {

    // Método recursivo para potência
    public static double potencia(double base, int expoente) {

        // Caso-base
        if (expoente == 0) {

            return 1;
        }

        // Chamada recursiva
        return base * potencia(base, expoente - 1);
    }

    // Método auxiliar
    public static double arredondar(double valor) {

        return Math.round(valor * 100.0) / 100.0;
    }

    // Método simples extra
    public static void linha() {

        System.out.println("--------------------------------");
    }
}