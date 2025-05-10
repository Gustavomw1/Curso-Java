package aulas.javaCoreOrientacaoObjetos.Gassociacao.test;

import aulas.javaCoreOrientacaoObjetos.Gassociacao.dominio.Jogador;
import aulas.javaCoreOrientacaoObjetos.Gassociacao.dominio.Time;

public class jogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Ansu Fati");
        Jogador jogador2 = new Jogador("Bojan");
        Time time = new Time("Barcelona");
        Jogador[] jogadores = { jogador, jogador2 };

        jogador.setTime(time);
        jogador2.setTime(time);

        time.setJogadores(jogadores);

        System.out.println("--- Jogador ---");
        jogador.imprime();

        System.out.println("--- Time ---");
        time.imprime();
    }
}
