package br.edu.umfg.srp.refatorado;

public class Vendendor extends AbstractFuncionario{

    public Vendendor(String nome, Double salario){
        super(nome, salario);
    }
    @Override
    public String calcularSalario() {
        return "NOME: "+ getNome() + " SALÁRIO BASE: R$ " + getSalario() + " SALÁRIO FINAL: R$ " + (getSalario()*1.1);
    }
}
