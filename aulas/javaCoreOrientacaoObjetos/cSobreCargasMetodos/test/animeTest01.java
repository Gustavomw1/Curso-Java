package aulas.javaCoreOrientacaoObjetos.cSobreCargasMetodos.test;

import aulas.javaCoreOrientacaoObjetos.cSobreCargasMetodos.dominio.Anime;

public class animeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Vagabond", 12, "TV", "Ação");
        anime.imprime();
    }
}
