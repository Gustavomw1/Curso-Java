package aulas.javaCoreOrientacaoObjetos.Gassociacao.test;

import aulas.javaCoreOrientacaoObjetos.Gassociacao.dominio.Escola;
import aulas.javaCoreOrientacaoObjetos.Gassociacao.dominio.Professor;

public class escolaTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor("Takezo");
        Professor[] professores = { professor };
        Escola escola = new Escola("Dojo", professores);

        escola.imprime();
    }
}
