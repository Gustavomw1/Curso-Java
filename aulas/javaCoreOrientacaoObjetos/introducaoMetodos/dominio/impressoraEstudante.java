package aulas.javaCoreOrientacaoObjetos.introducaoMetodos.dominio;

public class impressoraEstudante {
    public void imprime(Estudante estudante) {
        System.out.println("-------------");

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        estudante.nome = "Gohan";
    }
}
