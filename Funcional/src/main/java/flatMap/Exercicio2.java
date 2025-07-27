/*Objetivo     :Use flatMap para gerar uma lista única com números únicos e ordenados.
Autor          :Débora Oliveira
 */
package flatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercicio2 {
    public static void main(String[] args) {
        List<List<Integer>> listas = List.of(
                List.of(1, 2, 3),
                List.of(3, 4, 5),
                List.of(5, 6)
        );
        System.out.println(ordenarNumeros(listas));
    }

    private static List<Integer> ordenarNumeros(List<List<Integer>> listas) {
        return listas.stream()
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }
}
