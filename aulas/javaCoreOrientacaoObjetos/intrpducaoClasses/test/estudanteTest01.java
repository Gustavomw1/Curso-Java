package aulas.javaCoreOrientacaoObjetos.intrpducaoClasses.test;

import aulas.javaCoreOrientacaoObjetos.intrpducaoClasses.dominio.Estudante;

public class estudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante.nome = "Miyamoto";
        estudante.idade = 35;
        estudante.sexo = 'M';

        estudante2.nome = "Sasaki";
        estudante2.idade = 36;
        estudante2.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

        System.out.println("---------------------------");

        System.out.println(estudante2.nome);
        System.out.println(estudante2.idade);
        System.out.println(estudante2.sexo);
    }
}
