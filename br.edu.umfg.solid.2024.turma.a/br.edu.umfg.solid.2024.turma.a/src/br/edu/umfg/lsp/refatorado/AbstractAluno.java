package br.edu.umfg.lsp.refatorado;

public abstract class AbstractAluno {
    private String ra;
    private String nome;
    private Double notaFinal;

    public AbstractAluno(String ra, String nome, Double notaFinal) {
        this.ra = ra;
        this.nome = nome;
        this.notaFinal = notaFinal;
    }

    public String getRa() {
        return ra;
    }

    public String getNome() {
        return nome;
    }

    public Double getNotaFinal() {
        return notaFinal;
    }
}
