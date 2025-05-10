package aulas.javaCoreOrientacaoObjetos.Gassociacao.test;

import aulas.javaCoreOrientacaoObjetos.Gassociacao.dominio.Aluno;
import aulas.javaCoreOrientacaoObjetos.Gassociacao.dominio.Local;
import aulas.javaCoreOrientacaoObjetos.Gassociacao.dominio.Professor;
import aulas.javaCoreOrientacaoObjetos.Gassociacao.dominio.Seminario;

public class associacaoTest01 {
    public static void main(String[] args) {
        Local local = new Local("Rua das laranjeiras");
        Aluno aluno = new Aluno("Takezo", 33);
        Professor professor = new Professor("Monge", "Mestre");
        Aluno[] alunosParaSeminario = { aluno };
        Seminario seminario = new Seminario("Caminho da espdada", alunosParaSeminario, local);
        Seminario[] seminariosDisponiveis = { seminario };
        professor.setSemiario(seminariosDisponiveis);

        professor.imprime();
    }
}
