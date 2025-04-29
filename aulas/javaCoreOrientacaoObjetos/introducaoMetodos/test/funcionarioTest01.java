package aulas.javaCoreOrientacaoObjetos.introducaoMetodos.test;

import aulas.javaCoreOrientacaoObjetos.introducaoMetodos.dominio.Funcionario;

public class funcionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "miyamoto";
        funcionario.idade = 33;
        funcionario.salarios = new double[] { 3000, 1800, 2000 };

        funcionario.imprime();
        funcionario.imprimeMediaSalarial();
    }
}
