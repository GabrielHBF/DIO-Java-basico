import java.util.Set;
import java.util.HashSet;
import java.util.Set;

public class ConjuntoDeConvidado {
    private Set<Convidado> ConvidadosSet;

    public ConjuntoDeConvidado() {
        this.ConvidadosSet = new HashSet<>();
    }

    public void AdicionarConvidado(String nome, int numeroDeConvite, int idade) {
        this.ConvidadosSet.add(new Convidado(nome, numeroDeConvite, idade));
    }

    public void RemoverConvidado(int numeroDeConvite) {
        Convidado convidadoRemover = null;
        for (Convidado c : ConvidadosSet) {
            if (c.getNumeroDeConvite() == numeroDeConvite) {
                convidadoRemover = c;
                break;
            }
        }
        if (convidadoRemover != null) {
            this.ConvidadosSet.remove(convidadoRemover);
        } else {
            System.out.println("Não existe um convite com esse número");
        }
    }

    public int contarConvidados() {
        return this.ConvidadosSet.size();
    }

    public void exibirConvidados() {
        for (Convidado convidado : ConvidadosSet) {
            System.out.println(convidado);
        }
    }

    public static void main(String[] args){
        ConjuntoDeConvidado conjunto = new ConjuntoDeConvidado();
        conjunto.AdicionarConvidado("Alice", 1, 25);
        conjunto.AdicionarConvidado("Bob", 2, 30);

        System.out.println("Número de convidados: " + conjunto.contarConvidados());
        conjunto.exibirConvidados();

        conjunto.RemoverConvidado(1);

        System.out.println("Número de convidados após remoção: " + conjunto.contarConvidados());
        conjunto.exibirConvidados();
    }
}
