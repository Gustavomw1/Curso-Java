package aulas;

public class operadores {
    public static void main(String[] args) {
        // + - / *
        int number1 = 10;
        int number2 = 20;
        int result = number1 + number2;
        double result2 = number1 / (double) number2;
        int resto = 21 % 7;

        System.out.println(result);
        System.out.println(result2);
        System.out.println(resto);

        // < > <= >= == !=
        boolean maior = 30 < 90;
        boolean maior2 = 2 >= 90000;

        System.out.println(maior);
        System.out.println(maior2);

        // && (and), ||(or), !(negação)
        int idade = 29;
        float salario = 3500F;
        boolean idadeMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean idadeMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println(idadeMaiorQueTrinta);
        System.out.println(idadeMenorQueTrinta);

    }
}
