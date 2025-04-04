package aulas.estruturasCondicionais;

public class estruturasCondicionaisSwith {
    public static void main(String[] args) {
        // Imprimir o dia da semana considerando 1 como domingo
        byte dia = 2;
        // Char, int, byte, short, enum, String
        switch (dia) {
            case 1:
                System.out.println("domingo");
                break;
            case 2:
                System.out.println("Segunda");
            case 3:
                System.out.println("Terça");
            case 4:
                System.out.println("Quarta");
            case 5:
                System.out.println("Quinta");
            case 6:
                System.out.println(("Sexta"));
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Opção invalida");
                break;
        }

        char sexo = 'M';
        switch (sexo) {
            case 'M':
                System.out.println("Homem");
                break;
            case 'F':
                System.out.println("Mulher");
                break;
            default:
                System.out.println("Invalido");
                break;
        }
    }
}
