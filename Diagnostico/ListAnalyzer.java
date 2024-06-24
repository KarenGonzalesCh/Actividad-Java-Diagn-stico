import java.util.ArrayList;
import java.util.List;

public class ListAnalyzer {
    
    // Método estático para contar números impares en una lista
    public static int contadorImpares(List<Integer> lista) {
        int count = 0;
        for (Integer num : lista) {
            if (num % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    // Método estático para encontrar números consecutivos en una lista
    public static List<Integer> numerosConsecutivos(List<Integer> lista) {
        List<Integer> consecutivos = new ArrayList<>();
        for (int i = 0; i < lista.size() - 1; i++) {
            // Verifica si el siguiente número es consecutivo al actual
            if (lista.get(i) + 1 == lista.get(i + 1)) {
                consecutivos.add(lista.get(i));
                consecutivos.add(lista.get(i + 1));
            }
        }
        return consecutivos;
    }
}
