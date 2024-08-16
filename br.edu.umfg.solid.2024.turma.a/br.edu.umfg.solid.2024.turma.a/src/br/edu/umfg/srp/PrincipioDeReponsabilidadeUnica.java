package br.edu.umfg.srp;

import br.edu.umfg.srp.legado.Funcionario;
import br.edu.umfg.srp.legado.TipoFuncionario;
import br.edu.umfg.srp.refatorado.Estagiario;
import br.edu.umfg.srp.refatorado.Vendendor;

public class PrincipioDeReponsabilidadeUnica {
    public static void ExecutarLegado(){
        Funcionario estagiario = new Funcionario(TipoFuncionario.Estagiario, "ROBSON", 600.00);

        Funcionario vendedor = new Funcionario(TipoFuncionario.Vendedor, "PABLO MARÇAL", 2500.00);

        System.out.println(estagiario.getSalario());
        System.out.println(vendedor.getSalario());
    }

    public static void ExecutarRefatorado() {
        Estagiario estagiario= new Estagiario("ROBSON", 600.00);
        Vendendor vendendor = new Vendendor("PABLO MARÇAL", 2500.00);
        System.out.println(estagiario.calcularSalario());
        System.out.println(vendendor.calcularSalario());

    }
}
