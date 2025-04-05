package aulas.estruturasDeRepetição;

public class ExercicioEstruturaDeRepetiçãoContinue {
    public static void main(String[] args) {
        double valorCarro = 30000;
        for (int parcela = (int) valorCarro; parcela >= 1; parcela--) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela < 1000) {
                continue;
            }
            System.out.println("parcela " + parcela + " R$ " + valorParcela);
        }
    }

}
