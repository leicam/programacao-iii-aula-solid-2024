package br.edu.umfg.ocp.legado;

import java.util.ArrayList;

public class Venda {
    private TipoDeVenda tipoDeVenda;
    private ArrayList<Produto> produtos
            = new ArrayList<Produto>();

    public Venda(TipoDeVenda tipoDeVenda){
        this.tipoDeVenda = tipoDeVenda;
    }

    public void addProduto(Produto produto){
        this.produtos.add(produto);
    }

    public void removeProduto(Produto produto){
        this.produtos.remove(produto);
    }

    @Override
    public String toString() {
        String result
                = "TIPO DE VENDA: " +
                this.tipoDeVenda +
                "\n";
        Double totalVenda = 0.0;

        /*for (int i = 0; i <= this.produtos.size(); i++){
            this.produtos.get(i).getDescricao();
        }*/

        for (Produto produto : this.produtos){
            totalVenda += produto.getValor();
            result += produto.getDescricao() +
                    " | " + produto.getValor() +
                    "\n";
        }

        result += "TOTAL VENDA: R$" + totalVenda + "\n";
        result += calcularImpostos(totalVenda);
        
        return result;
    }

    private String calcularImpostos(Double totalVenda) {
        totalVenda += totalVenda * 0.165; //PIS
        totalVenda += totalVenda * 0.765; //COFINS

        if (TipoDeVenda.Parana.equals(this.tipoDeVenda)){
            totalVenda += totalVenda * 0.19;
        } else if (TipoDeVenda.SaoPaulo.equals(this.tipoDeVenda)){
            totalVenda += totalVenda * 0.18;
        } else if (TipoDeVenda.SantaCatarina.equals(this.tipoDeVenda)){
            totalVenda += totalVenda * 0.17;
        }

        return "TOTAL VENDA COM IMPOSTOS: R$" + totalVenda;
    }
}
