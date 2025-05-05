package aulas.javaCoreOrientacaoObjetos.dConstrutores.test;

import aulas.javaCoreOrientacaoObjetos.dConstrutores.dominio.Anime;

public class animeTest01 {
    public static void main(String[] args) {
        Anime anime1 = new Anime("Vagabond", 12, "TV", "Ação", "Production IG");
        Anime anime2 = new Anime("One Piece", 1000, "TV", "Aventura");

        anime1.imprime();
        System.out.println("-----------------");
        anime2.imprime();
    }
}
