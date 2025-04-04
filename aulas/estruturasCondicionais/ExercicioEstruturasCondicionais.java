package aulas.estruturasCondicionais;

public class ExercicioEstruturasCondicionais {
    // Desafio com && (e)
    public static void main(String[] args) {
        int money = 1200;
        String conta = "ativa";

        if (money >= 1200 && conta == "ativa") {
            System.out.println("Você consegue comprar esse produto.");
        } else {
            System.out.println("Você nao pode compra esse produto.");
        }
    }
}
