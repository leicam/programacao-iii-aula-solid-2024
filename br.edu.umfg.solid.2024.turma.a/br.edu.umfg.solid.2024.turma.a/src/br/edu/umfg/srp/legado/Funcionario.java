package br.edu.umfg.srp.legado;

public class Funcionario {
    private TipoFuncionario tipoFuncionario;
    private String nome;
    private Double salario;

    public Funcionario(TipoFuncionario tipoFuncionario, String nome, Double salario) {
        this.tipoFuncionario = tipoFuncionario;
        this.nome = nome;
        this.salario = salario;
    }

    public String getSalario(){
        if(TipoFuncionario.Vendedor.equals(this.tipoFuncionario)){
            return "NOME: "+ this.nome + " SALÁRIO BASE " + this.salario + " SALÁRIO FINAL: R$ " + (this.salario *1.1);

        }


        return "NOME: "+ this.nome + " SALÁRIO BASE " + this.salario + " SALÁRIO FINAL: R$ " + this.salario;
    }
}
