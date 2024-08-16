package br.edu.umfg.ocp.refatorado;

public abstract class AbstractImpostoEstadual {
    private String descricao;
    private Double aliquota;

    protected AbstractImpostoEstadual(String descricao, Double aliquota) {
        this.descricao = descricao;
        this.aliquota = aliquota;
    }

    public abstract TipoEstado getTipoEstado();

    public Double getAliquota() {
        return aliquota;
    }
}