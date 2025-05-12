package aulas.javaCoreOrientacaoObjetos.Hheranca.test;

import aulas.javaCoreOrientacaoObjetos.Hheranca.dominio.Endereco;
import aulas.javaCoreOrientacaoObjetos.Hheranca.dominio.Funcionario;
import aulas.javaCoreOrientacaoObjetos.Hheranca.dominio.Pessoa;

public class herancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua Monge");
        endereco.setCep("340782-030");

        Pessoa pessoa = new Pessoa("Takezo");
        pessoa.setCpf("23498750989");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Kojiro");
        funcionario.setCpf("2222222");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);
        System.out.println("----------");
        funcionario.imprime();
    }
}
