package br.edu.umfg.lsp.refatorado;

public class AlunoEadRefatorado extends AbstractAluno{
    private String email;
    private String senha;

    public AlunoEadRefatorado(String ra,
                              String nome,
                              Double notaFinal,
                              String email,
                              String senha) {
        super(ra, nome, notaFinal);
        this.email = email;
        this.senha = senha;
    }
}
