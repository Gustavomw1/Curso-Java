package aulas.estruturasCondicionais;

public class estruturasCondicionaisIfElse {
    public static void main(String[] args) {
        int idade = 15;
        String categoria;

        if (idade < 15) {
            categoria = "Juvena";
        } else if (idade >= 15 && idade < 18) {
            categoria = "Base";
        } else {
            categoria = "Adulto";
        }
        System.out.println(categoria);
    }
}
