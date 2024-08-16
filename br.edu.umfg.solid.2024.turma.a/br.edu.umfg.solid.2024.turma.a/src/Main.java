import br.edu.umfg.lsp.PrincipioDeSubstituicaoDeLiskov;
import br.edu.umfg.ocp.PrincipioAbertoFechado;
import br.edu.umfg.srp.PrincipioDeReponsabilidadeUnica;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("SRP");
        System.out.println("Legado");
        PrincipioDeReponsabilidadeUnica.ExecutarLegado();
        System.out.println("\n");
        System.out.println("Refatorado");
        PrincipioDeReponsabilidadeUnica.ExecutarRefatorado();
        System.out.println("\n");
        System.out.println("\n");

        System.out.println("OCP");
        System.out.println("Legado");
        PrincipioAbertoFechado.executarLegado();
        System.out.println("Refatorado");
        PrincipioAbertoFechado.executarRefatorado();
        System.out.println("\n");
        System.out.println("\n");

        System.out.println("LSP");
        System.out.println("Legado");
        PrincipioDeSubstituicaoDeLiskov.executarLegado();
        System.out.println("\n");
        System.out.println("Refatorado");
        PrincipioDeSubstituicaoDeLiskov.executarRefatorado();
        System.out.println("\n");
        System.out.println("\n");

        System.out.println("ISP");
        System.out.println("\n");

        System.out.println("DIP");
        System.out.println("\n");
    }

}