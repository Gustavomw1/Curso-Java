package aulas.javaCoreOrientacaoObjetos.fModificadorEstatico.domain;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 250;

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    } // Utilizado para poder usar esse encurtador -- Carro c1 = new Carro("BMW",
      // 280);

    public void imprime() {
        System.out.println("-------------------");
        System.out.println("nome " + this.nome);
        System.out.println("velociade maxima " + this.velocidadeMaxima);
        System.out.println("velocidade limite " + Carro.velocidadeLimite);
    }

    public static void setVelocidadeLimite(double velocidadeLimite) {
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public static double getVelocidadeLimite() {
        return Carro.velocidadeLimite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
}
