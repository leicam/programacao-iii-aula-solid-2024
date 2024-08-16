package br.edu.umfg.srp.refatorado;

public class Estagiario extends AbstractFuncionario{

    public Estagiario(String nome, double salario){
        super(nome, salario);
    }
    @Override
    public String calcularSalario() {
        return "NOME : "+ getNome() + " SALÁRIO BASE: " + getSalario() + " SALÁRIO FINAL: " + getSalario();
    }
}
