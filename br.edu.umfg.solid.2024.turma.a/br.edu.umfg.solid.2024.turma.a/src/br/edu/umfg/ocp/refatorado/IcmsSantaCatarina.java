package br.edu.umfg.ocp.refatorado;

public class IcmsSantaCatarina extends AbstractImpostoEstadual{
    public IcmsSantaCatarina() {
        super("ICMS", 17.00);
    }

    @Override
    public TipoEstado getTipoEstado() {
        return TipoEstado.SantaCatarina;
    }
}