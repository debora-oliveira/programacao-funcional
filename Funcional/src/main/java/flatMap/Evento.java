package flatMap;

import java.time.LocalDate;

class Evento {
    String nome;
    LocalDate data;
    boolean repeteAnualmente;

    public Evento(String nome, LocalDate data, boolean repeteAnualmente) {
        this.nome = nome;
        this.data = data;
        this.repeteAnualmente = repeteAnualmente;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getData() {
        return data;
    }

    public boolean isRepeteAnualmente() {
        return repeteAnualmente;
    }
}

