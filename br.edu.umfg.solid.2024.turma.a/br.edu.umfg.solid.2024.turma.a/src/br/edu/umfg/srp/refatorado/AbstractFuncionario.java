package br.edu.umfg.srp.refatorado;

public abstract class  AbstractFuncionario {
    private String nome;
    private Double salario;

    protected AbstractFuncionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public abstract String calcularSalario();

    protected String getNome(){
        return this.nome;
    }

    protected Double getSalario(){
        return this.salario;
    }
}
