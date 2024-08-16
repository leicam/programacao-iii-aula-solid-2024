package br.edu.umfg.ocp.refatorado;

public class IcmsParana extends AbstractImpostoEstadual{
    public IcmsParana() {
        super("ICMS", 19.00);
    }

    @Override
    public TipoEstado getTipoEstado() {
        return TipoEstado.Parana;
    }
}
