package org.infnet.assessment;

import java.util.ArrayList;
import java.util.List;

public class Grade {
    private int codigo;
    private String nome;

    private List<Disciplina> disciplinas;

    public Grade(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        this.disciplinas = new ArrayList<>();
    }

    public void addDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public String getNome() {
        return nome;
    }
}
