package aulas.estruturasDeRepetição;

public class estruturaDeRepetição {
    public static void main(String[] args) {
        // while
        int count = 0;

        while (count < 10) {
            System.out.println(count++);
        }

        // do while
        int conta = 0;

        do {
            System.out.println("Dentro do do-while " + conta++);
        } while (conta < 10);

        // For
        for (int i = 0; i < 10; i++) {
            System.out.println("For " + i);
        }
    }
}
