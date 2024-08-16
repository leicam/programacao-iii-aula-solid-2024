package br.edu.umfg.lsp;

import br.edu.umfg.lsp.legado.AlunoEad;
import br.edu.umfg.lsp.legado.AlunoPresencial;
import br.edu.umfg.lsp.refatorado.AbstractAluno;
import br.edu.umfg.lsp.refatorado.AlunoEadRefatorado;
import br.edu.umfg.lsp.refatorado.AlunoPresencialRefatorado;

public class PrincipioDeSubstituicaoDeLiskov {
    public static void executarLegado(){
        AlunoPresencial alunoPresencial
                = new AlunoPresencial("001", "TESTE 1", 8.7);
        AlunoEad alunoEad
                = new AlunoEad("0002", "TESTE 2",
                9.3, "teste2@email.com", "123Mudar@");

        System.out.println("RA | NOME | NOTA FINAL");
        System.out.println(alunoPresencial.getRa() + " | " +
                alunoPresencial.getNome() + " | " +
                alunoPresencial.getNotaFinal());

        System.out.println(alunoEad.getRa() + " | " +
                alunoEad.getNome() + " | " +
                alunoEad.getNotaFinal());
    }

    public static void executarRefatorado(){
        AlunoPresencialRefatorado alunoPresencialRefatorado
                = new AlunoPresencialRefatorado("0001",
                "TESTE 1",
                8.7);
        AlunoEadRefatorado alunoEadRefatorado
                = new AlunoEadRefatorado("0002",
                "TESTE 2",
                9.3,
                "teste2@email.com",
                "123Mudar@");

        System.out.println("RA | NOME | NOTA FINAL");
        imprimir(alunoPresencialRefatorado);
        imprimir(alunoEadRefatorado);
    }

    private static void imprimir(AbstractAluno aluno){
        System.out.println(aluno.getRa() + " | " +
                aluno.getNome() + " | " +
                aluno.getNotaFinal());
    }
}