package br.edu.umfg.ocp.refatorado;

public class IcmsSaoPaulo extends AbstractImpostoEstadual{
    public IcmsSaoPaulo() {
        super("ICMS", 16.00);
    }

    @Override
    public TipoEstado getTipoEstado() {
        return TipoEstado.SaoPaulo;
    }
}
