/*Objetivo     :Gere uma lista única com todas as palavras de todas as frases.
Autor          :Débora Oliveira
 */
package flatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercicio1 {
    public static void main(String[] args) {
        List<String> frases = List.of(
                "Spring Boot é poderoso",
                "Java é robusto",
                "Streams são úteis"
        );
        List<String> palavras = gerarLista(frases);
        System.out.println(palavras);
    }

    private static List<String> gerarLista(List<String> frases) {
        return frases.stream()
                .flatMap((String frase) -> Arrays.stream(frase.split(" ")))
                .collect(Collectors.toList());
    }
}
