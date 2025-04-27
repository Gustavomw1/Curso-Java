package aulas.javaCoreOrientacaoObjetos.introducaoMetodos.test;

import aulas.javaCoreOrientacaoObjetos.introducaoMetodos.dominio.Calculadora;

public class calculadoraTest05 {
    public static void main(String... args) {
        Calculadora calculadora = new Calculadora();
        int[] numero = { 1, 2, 3, 4, 5 };
        calculadora.somaArray(numero);
        calculadora.somaVarArgs(1, 2, 3, 4, 5, 6, 7);
    }
}
