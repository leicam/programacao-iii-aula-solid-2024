package br.edu.umfg.ocp.refatorado;

import java.util.ArrayList;

public class ProdutoRefatorado {
    private String descricao;
    private Double valor;
    private ArrayList<AbstractImpostoEstadual> impostosEstaduais
            = new ArrayList<AbstractImpostoEstadual>();
    private ArrayList<AbstractImpostoFederal> impostosFederais
            = new ArrayList<AbstractImpostoFederal>();

    public ProdutoRefatorado(String descricao, Double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public ProdutoRefatorado(String descricao,
                             Double valor,
                             ArrayList<AbstractImpostoEstadual> impostosEstaduais,
                             ArrayList<AbstractImpostoFederal> impostosFederais) {
        this.descricao = descricao;
        this.valor = valor;
        this.impostosEstaduais.addAll(impostosEstaduais);
        this.impostosFederais.addAll(impostosFederais);
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void addImpostoFederal(AbstractImpostoFederal imposto){
        this.impostosFederais.add(imposto);
    }

    public void removeImpostoFederal(AbstractImpostoFederal imposto){
        this.impostosFederais.remove(imposto);
    }

    public void addImpostoEstadual(AbstractImpostoEstadual imposto){
        this.impostosEstaduais.add(imposto);
    }

    public void removeImpostoEstadual(AbstractImpostoEstadual imposto){
        this.impostosEstaduais.remove(imposto);
    }

    public Double getValorImpostosFederais(){
        final Double totalImpostos[] = {0.0};

        this.impostosFederais
                .stream()
                .forEach(x -> {totalImpostos[0] += (this.valor / 100)
                                * x.getAliquota();});

        return totalImpostos[0];
    }

    public Double getValorImpostosEstaduais(TipoEstado tipoEstado) {
        final Double totalImpostosFinal[] = {0.0};

        // forma legada
        /*Double totalImpostos = 0.0;

        for (Integer i = 0; i < this.impostosEstaduais.size(); i++){
            if (tipoEstado.equals(this.impostosEstaduais.get(i).getTipoEstado()))
                totalImpostos += ((this.valor / 100)
                        * this.impostosEstaduais.get(i).getAliquota());
        }

        totalImpostos = 0.0;

        for (AbstractImpostoEstadual imposto : this.impostosEstaduais){
            if (tipoEstado.equals(imposto.getTipoEstado())){
                totalImpostos += ((this.valor / 100) * imposto.getAliquota());
            }
        }*/

        this.impostosEstaduais
                .stream()
                .filter(x -> tipoEstado.equals(x.getTipoEstado()))
                .forEach(y -> { totalImpostosFinal[0] +=
                        ((this.valor/100) * y.getAliquota());});

        return totalImpostosFinal[0];
    }
}
