package br.edu.umfg.ocp.legado;

public class Produto {
    private String descricao;
    private Double valor;

    public Produto(String descricao, Double valor){
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public Double getValor(){
        return this.valor;
    }
}
