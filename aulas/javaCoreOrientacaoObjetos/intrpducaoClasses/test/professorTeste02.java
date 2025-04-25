package aulas.javaCoreOrientacaoObjetos.intrpducaoClasses.test;

import aulas.javaCoreOrientacaoObjetos.intrpducaoClasses.dominio.Professor;

public class professorTeste02 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Monge";
        professor.idade = 56;
        professor.sexo = 'M';

        System.out
                .println("Nome é: " + professor.nome + ", idade é: " + professor.idade + ", Sexo é: " + professor.sexo);
    }
}
