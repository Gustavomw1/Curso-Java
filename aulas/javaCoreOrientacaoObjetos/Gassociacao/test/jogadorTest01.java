package aulas.javaCoreOrientacaoObjetos.Gassociacao.test;

import aulas.javaCoreOrientacaoObjetos.Gassociacao.dominio.Jogador;

public class jogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Ansu fati");
        Jogador jogador2 = new Jogador("Lamine yamanl");
        Jogador jogador3 = new Jogador("Raphinha");
        Jogador[] jogadores = { jogador1, jogador2, jogador3 };
        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }
    }
}
