package aulas.javaCoreOrientacaoObjetos.dConstrutores.test;

import aulas.javaCoreOrientacaoObjetos.dConstrutores.dominio.Anime;

public class animeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Vagabond", 12, "TV", "Ação", "Production IG");
        anime.imprime();
    }
}
