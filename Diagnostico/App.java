import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Integer> miLista = new ArrayList<>();
        miLista.add(27);
        miLista.add(6);
        miLista.add(14);
        miLista.add(8);
        miLista.add(9);
        miLista.add(12);
        miLista.add(13);

        // Contar números impares
        int cantidadImpares = ListAnalyzer.contadorImpares(miLista);
        System.out.println("Cantidad de números impares: " + cantidadImpares);
        // Salida esperada: Cantidad de números impares: 3

        // Encontrar números consecutivos
        List<Integer> numConsecutivos = ListAnalyzer.numerosConsecutivos(miLista);
        System.out.println("Números consecutivos de la lista: " + numConsecutivos);
        // Salida esperada: Números consecutivos de la lista: [8, 9, 12, 13]
    }
}
