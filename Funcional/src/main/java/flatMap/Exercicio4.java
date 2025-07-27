/*Objetivo     :Conte quantas vezes cada palavra aparece nas frases.
Autor          :Débora Oliveira
 */
package flatMap;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Exercicio4 {
    public static void main(String[] args) {
        List<String> frases = List.of(
                "java spring boot",
                "spring data jpa",
                "java streams flatmap"
        );
        Map<String, Long> palavraContada = frases.stream()
                .flatMap((String palavra) -> Arrays.stream(palavra.split(" ")))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(palavraContada);
    }
}
