package org.infnet.assessment;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(001, "Aluno 1" );
        Aluno aluno2 = new Aluno(002, "Aluno 2" );
        Aluno aluno3 = new Aluno(003, "Aluno 3" );
        Aluno aluno4 = new Aluno(004, "Aluno 4" );
        Aluno aluno5 = new Aluno(005, "Aluno 5" );


        Grade grade = new Grade(1, "Grade ENG. SOFTWARE");
        Disciplina disciplina = new Disciplina(1, "Projeto de Bloco");
        grade.addDisciplina(disciplina);
        Disciplina disciplina2 = new Disciplina(2, "Java");
        grade.addDisciplina(disciplina2);
        Disciplina disciplina3 = new Disciplina(3, ".NET");
        grade.addDisciplina(disciplina3);

        Curso curso = new Curso(1, "Engenharia de Software");
        curso.addAluno(aluno);
        curso.addAluno(aluno2);
        curso.addAluno(aluno3);
        curso.addAluno(aluno4);
        curso.addAluno(aluno5);
        curso.addGrade(grade);

        System.out.println("Alunos:");
        System.out.println(curso.exibirAlunos());
        System.out.println("Grade:");
        System.out.println(curso.exibirGrade());
    }
}