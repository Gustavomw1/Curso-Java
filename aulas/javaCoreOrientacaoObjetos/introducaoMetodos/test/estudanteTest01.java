package aulas.javaCoreOrientacaoObjetos.introducaoMetodos.test;

import aulas.javaCoreOrientacaoObjetos.introducaoMetodos.dominio.Estudante;
import aulas.javaCoreOrientacaoObjetos.introducaoMetodos.dominio.impressoraEstudante;

public class estudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();
        impressoraEstudante impressora = new impressoraEstudante();

        // ESTUDANTE
        estudante1.nome = "takezo";
        estudante1.idade = 44;
        estudante1.sexo = 'M';

        estudante2.nome = "saku";
        estudante2.idade = 37;
        estudante2.sexo = 'F';

        System.out.println(estudante1.nome);
        System.out.println(estudante1.idade);
        System.out.println(estudante1.sexo);

        System.out.println(estudante2.nome);
        System.out.println(estudante2.idade);
        System.out.println(estudante2.sexo);
        // ESTUDANTE

        impressora.imprime(estudante1);
        impressora.imprime(estudante2);

        System.out.println("##################");

        impressora.imprime(estudante1);
        impressora.imprime(estudante2);
    }
}
