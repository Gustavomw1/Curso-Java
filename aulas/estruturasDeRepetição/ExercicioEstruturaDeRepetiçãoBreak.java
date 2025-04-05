package aulas.estruturasDeRepetição;

public class ExercicioEstruturaDeRepetiçãoBreak {
    public static void main(String[] args) {
        double valorCarro = 30000;
        for (int parcela = 1; parcela <= valorCarro; parcela++) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("parcela " + parcela + " R$ " + valorParcela);
        }
    }

}
