import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class Collection {
    private List<tarefa> tarefas;

    public Collection() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(tarefa Tarefa) {
        tarefas.add(Tarefa);
    }

    public void modificarTarefa(int indice, tarefa Tarefa) {
        tarefas.set(indice, Tarefa);
    }

    public void removerTarefa(int indice) {
        tarefas.remove(indice);
    }

    public List<tarefa> gettarefas() {
        return tarefas;
    }

    public List<tarefa> listartarefas(LocalDate data) {
        List<tarefa> tarefasNaData = new ArrayList<>();
        for (tarefa Tarefa : tarefas) {
            if (Tarefa.ocorreEm(data.getYear(), data.getMonthValue(), data.getDayOfMonth())) {
                tarefasNaData.add(Tarefa);
            }
        }
        return tarefasNaData;
    }
}
