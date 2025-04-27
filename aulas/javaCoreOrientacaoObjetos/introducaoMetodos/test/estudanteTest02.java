package aulas.javaCoreOrientacaoObjetos.introducaoMetodos.test;

import aulas.javaCoreOrientacaoObjetos.introducaoMetodos.dominio.Estudante;

public class estudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante1.nome = "takezo";
        estudante1.idade = 33;
        estudante1.sexo = 'M';

        estudante2.nome = "sakura";
        estudante2.idade = 22;
        estudante2.sexo = 'F';

        estudante1.imprime();
        estudante2.imprime();
    }
}
