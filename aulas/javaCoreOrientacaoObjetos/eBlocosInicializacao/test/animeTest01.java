package aulas.javaCoreOrientacaoObjetos.eBlocosInicializacao.test;

import aulas.javaCoreOrientacaoObjetos.eBlocosInicializacao.dominio.Anime;

public class animeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("One piece");

        for (int episodio : anime.getEpisodios()) {
            System.out.println(episodio + " ");
        }
    }
}
