package br.edu.umfg.ocp.refatorado;

import br.edu.umfg.ocp.legado.Produto;

import java.util.ArrayList;

public class VendaRefatorada {
    private TipoEstado tipoEstado;
    private ArrayList<ProdutoRefatorado> produtos
            = new ArrayList<ProdutoRefatorado>();

    public VendaRefatorada(TipoEstado tipoEstado) {
        this.tipoEstado = tipoEstado;
    }

    public void addProduto(ProdutoRefatorado produto){
        this.produtos.add(produto);
    }

    public void removeProduto(ProdutoRefatorado produto){
        this.produtos.remove(produto);
    }

    @Override
    public String toString() {
        final String retorno[] = { "" };
        final Double totalProdutos[] = {0.0};
        final Double totalImpostos[] = {0.0};

        retorno[0] += "ESTADO VENDA: " + this.tipoEstado + "\n";

        this.produtos
                .stream()
                .forEach(x -> {
                    Double valorProduto = x.getValor();
                    Double impostosFederais = x.getValorImpostosFederais();
                    Double impostosEstaduais = x.getValorImpostosEstaduais(this.tipoEstado);

                    retorno[0] += x.getDescricao() + " | " + valorProduto + " | " +
                        impostosFederais + " | " + impostosEstaduais + "\n";
                    totalProdutos[0] += valorProduto;
                    totalImpostos[0] += (impostosFederais + impostosEstaduais);
                });

        retorno[0] += "TOTAL R$: " + totalProdutos[0] + "\n";
        retorno[0] += "TOTAL IMPOSTOS R$: " + totalImpostos[0] + "\n";
        retorno[0] += "TOTAL VENDA R$: " + (totalProdutos[0] + totalImpostos[0]) + "\n";

        return retorno[0];
    }
}









