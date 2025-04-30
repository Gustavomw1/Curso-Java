package aulas.javaCoreOrientacaoObjetos.introducaoMetodos.test;

import aulas.javaCoreOrientacaoObjetos.introducaoMetodos.dominio.Funcionario;

public class funcionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("miyamoto");
        funcionario.setIdade(33);
        funcionario.setSalarios(new double[] { 3000, 1800, 2000 });
        funcionario.imprime();
        funcionario.imprimeMediaSalarial();
    }
}
