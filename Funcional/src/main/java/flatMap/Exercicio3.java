/*Objetivo     :Obtenha uma lista única com todos os cursos sem repetições.
Autor          :Débora Oliveira
 */
package flatMap;

import java.util.List;

public class Exercicio3 {
    public static void main(String[] args) {
        List<Aluno> alunos = List.of(
                new Aluno("Ana", List.of("Java", "Spring")),
                new Aluno("Bruno", List.of("Spring", "Docker")),
                new Aluno("Clara", List.of("Java", "SQL"))
        );
        List<String> cursosUnicos = alunos.stream()
                .flatMap(aluno -> aluno.getCursos().stream())
                .distinct()
                .toList();
        System.out.println(cursosUnicos);
    }
}
