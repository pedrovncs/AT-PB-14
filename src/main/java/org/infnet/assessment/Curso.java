package org.infnet.assessment;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private int codigo;
    private String nome;

    private List<Aluno> alunos;
    private Grade grade;

    public Curso(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        this.alunos = new ArrayList<>();
    }

    public void addAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public String exibirAlunos() {
        StringBuilder sb = new StringBuilder();
        for (Aluno aluno : alunos) {
            sb.append(aluno.getNome());
            sb.append("\n");
        }
        return sb.toString();
    }

    public String exibirGrade() {
        StringBuilder sb = new StringBuilder();
        sb.append(grade.getNome());
        sb.append("\n");
        for (Disciplina disciplina : grade.getDisciplinas()) {
            sb.append(disciplina.getNome());
            sb.append("\n");
        }
        return sb.toString();
    }

    public void addGrade(Grade grade) {
        this.grade = grade;
    }
}
