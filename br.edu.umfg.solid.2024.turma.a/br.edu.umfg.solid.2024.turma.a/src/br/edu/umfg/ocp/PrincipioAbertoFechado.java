package br.edu.umfg.ocp;

import br.edu.umfg.ocp.legado.Produto;
import br.edu.umfg.ocp.legado.TipoDeVenda;
import br.edu.umfg.ocp.legado.Venda;
import br.edu.umfg.ocp.refatorado.*;

public class PrincipioAbertoFechado {
    public static void executarLegado(){
        Produto cocaCola =
                new Produto("COCA COLA 350 ML",
                        7.50);
        Produto batataFrita =
                new Produto ("BATATA FRITA 400 GR",
                        29.00);

        Venda venda
                = new Venda(TipoDeVenda.Parana);

        venda.addProduto(cocaCola);
        venda.addProduto(batataFrita);
        venda.removeProduto(cocaCola);
        venda.addProduto(cocaCola);
        venda.addProduto(cocaCola);

        System.out.println(venda.toString());
    }

    public static void executarRefatorado(){
        IcmsParana icmsParana = new IcmsParana();
        IcmsSantaCatarina icmsSantaCatarina = new IcmsSantaCatarina();
        Pis pis = new Pis();
        IcmsSaoPaulo icmsSaoPaulo = new IcmsSaoPaulo();

        ProdutoRefatorado cocaCola =
                new ProdutoRefatorado("COCA COLA 350 ML",
                        7.50);
        cocaCola.addImpostoEstadual(icmsParana);
        cocaCola.addImpostoEstadual(icmsSantaCatarina);
        cocaCola.addImpostoFederal(pis);
        cocaCola.addImpostoEstadual(icmsSaoPaulo);

        ProdutoRefatorado batataFrita =
                new ProdutoRefatorado("BATATA FRITA 400 GR",
                        25.90);
        batataFrita.addImpostoEstadual(icmsParana);
        batataFrita.addImpostoEstadual(icmsSantaCatarina);
        batataFrita.addImpostoFederal(pis);

        VendaRefatorada venda = new VendaRefatorada(TipoEstado.Parana);
        venda.addProduto(cocaCola);
        venda.addProduto(batataFrita);

        System.out.println(venda.toString());

        //System.out.println(batataFrita.getValorImpostosEstaduais(TipoEstado.SantaCatarina));
        //System.out.println(batataFrita.getValorImpostosEstaduais(TipoEstado.Parana));
        //System.out.println(batataFrita.getValorImpostosEstaduais(TipoEstado.SaoPaulo));
    }
}