import java.util.ArrayList;
import java.util.List;

public class Historico {

    // Lista para armazenar os registros
    private List<String> registros = new ArrayList<>();

    // Adicionar novo registro
    public void adicionar(String registro) {

        registros.add(registro);
    }

    // Exibir histórico
    public void exibir() {

        // Verifica se está vazio
        if (registros.isEmpty()) {

            System.out.println("Nenhum cálculo registrado.");
            return;
        }

        // Loop for-each
        for (String registro : registros) {

            System.out.println("→ " + registro);
        }
    }
}