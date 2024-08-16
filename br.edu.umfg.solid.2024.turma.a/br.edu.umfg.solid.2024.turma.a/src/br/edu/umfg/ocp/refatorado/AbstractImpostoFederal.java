package br.edu.umfg.ocp.refatorado;

public abstract class AbstractImpostoFederal {
    private String descricao;
    private Double aliquota;

    protected AbstractImpostoFederal(String descricao, Double aliquota) {
        this.descricao = descricao;
        this.aliquota = aliquota;
    }

    public Double getAliquota() {
        return aliquota;
    }
}