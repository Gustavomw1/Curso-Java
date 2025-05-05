package aulas.javaCoreOrientacaoObjetos.Gassociacao.test;

import aulas.javaCoreOrientacaoObjetos.Gassociacao.dominio.Jogador;
import aulas.javaCoreOrientacaoObjetos.Gassociacao.dominio.Time;

public class jogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Ansu fati");
        Time time = new Time("Barcelona");

        jogador1.setTime(time);
        jogador1.imprime();
    }
}
