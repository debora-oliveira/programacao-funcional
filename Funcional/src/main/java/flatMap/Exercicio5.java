/*Objetivo     :Gere uma lista com os nomes não vazios.
Autor          :Débora Oliveira
 */
package flatMap;

import java.util.List;
import java.util.Optional;

public class Exercicio5 {
    public static void main(String[] args) {
        List<Optional<String>> nomes = List.of(
                Optional.of("Ana"),
                Optional.empty(),
                Optional.of("Bruno"),
                Optional.of("Clara"),
                Optional.empty()
        );
        List<String> nomesNaoVazios = nomes.stream()
                .flatMap(Optional::stream)//já remove os Optional.empty()
                //.filter(Objects::nonNull)
                .toList();
        System.out.println(nomesNaoVazios);
    }
}
