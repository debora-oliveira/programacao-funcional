/*Objetivo     :Para eventos com repeteAnualmente == true, gere uma lista com a mesma data do evento para todos os anos de data.getYear() até o ano atual.
Autor          :Débora Oliveira
 */
package flatMap;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Exercicio6DataRecorrente {
    public static void main(String[] args) {
        List<Evento> eventos = List.of(
                new Evento("Meetup Java", LocalDate.of(2024,07,16),true),
                new Evento("Meetup Java", LocalDate.of(2025,06,25),false),
                new Evento("Meetup Spring", LocalDate.of(2025,05,16),false),
                new Evento("Meetup Engenharia de Software", LocalDate.of(2023,05,10),true),
                new Evento("Refatoração em larga escala", LocalDate.of(2025,04,20),true),
                new Evento("Mulheres no Java", LocalDate.of(2025,03,22),true)

        );
        for (Evento e: eventos ){
            System.out.println(gerarDatasRepetidas(e));
        }
    }

    private static List<LocalDate> gerarDatasRepetidas(Evento evento){
        if(!evento.repeteAnualmente){
            return List.of(evento.getData());
        }

        int anoInicio = evento.getData().getYear();
        int anoAtual = LocalDate.now().getYear();

        return IntStream.rangeClosed(anoInicio, anoAtual)
                .mapToObj(ano -> evento.getData().withYear(ano))
                .collect(Collectors.toList());
    }

}
