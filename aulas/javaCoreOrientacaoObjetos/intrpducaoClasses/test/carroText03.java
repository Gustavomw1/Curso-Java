package aulas.javaCoreOrientacaoObjetos.intrpducaoClasses.test;

import aulas.javaCoreOrientacaoObjetos.intrpducaoClasses.dominio.Carro;

public class carroText03 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro.nome = "BMW";
        carro.modelo = "M3";
        carro.ano = 2021;

        carro = carro2; // receba

        System.out.println(carro.nome);
        System.out.println(carro.modelo);
        System.out.println(carro.ano);

        System.out.println("------------------------");

        carro2.nome = "Bugatti";
        carro2.modelo = "chiron";
        carro2.ano = 2016;
        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);
    }
}
