package aulas.estruturasCondicionais;

public class ExercicioEstruturasCondicionaisSwith {
    public static void main(String[] args) {
        byte dia = 1;
        switch (dia) {
            case 1:
            case 7:
                System.out.println("FDS");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("dia util");
                break;
            default:
                System.out.println("Opção invalida");
                break;
        }
    }
}
