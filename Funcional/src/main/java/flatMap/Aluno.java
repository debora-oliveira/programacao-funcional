package flatMap;

import java.util.List;

class Aluno {
    String nome;
    List<String> cursos;

    public Aluno(String nome, List<String> cursos) {
        this.nome = nome;
        this.cursos = cursos;
    }

    public String getNome() {
        return nome;
    }

    public List<String> getCursos() {
        return cursos;
    }
}
