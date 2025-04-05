package aulas.estruturasDeRepetição;

public class ExercicioEstruturaDeRepetição {
    public static void main(String[] args) {
        // Imprimir os números pares de 0 a 1000
        for (int i = 0; i <= 1000; i++) {
            if (i % 2 == 0) {
                System.out.print(i + ", ");
            }
        }
    }
}
