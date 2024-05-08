package list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    
    private List<Tarefa> tarefasList;

    public ListaTarefa(){
        this.tarefasList = new ArrayList<>();
    }

    public void AdicionarTarefa(String descricao){
        tarefasList.add(new Tarefa(descricao));
    }

    public void RemoverTarefa(String descricao){
        List<Tarefa> tarefasARemover =  new ArrayList<>();
        for(Tarefa t : tarefasList){
            if(t.getDecricao().equalsIgnoreCase(descricao)){
                tarefasARemover.add(t);
            }
        tarefasList.removeAll(tarefasARemover);
        }
    }

    public int QuantidadeDeTarefas(){
        return tarefasList.size(); 
    }

    public void ListarTarefas(){
        for(Tarefa t : tarefasList){
            System.out.println(t.getDecricao()+"\n");
        }
        
    }

    public static void main(String[] args) {
        ListaTarefa listas = new ListaTarefa();

        listas.AdicionarTarefa("trabalhar");
        listas.ListarTarefas();
    }

}
