package aulas.javaCoreOrientacaoObjetos.fModificadorEstatico.test;

import aulas.javaCoreOrientacaoObjetos.fModificadorEstatico.domain.Carro;

public class carroTest01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("mercedes", 275);
        Carro c3 = new Carro("audi", 290);

        Carro.velocidadeLimite = 180;

        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
