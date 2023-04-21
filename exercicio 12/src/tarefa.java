import java.time.LocalDate;
public class tarefa {
    private String descricao;
    private LocalDate data;

    public tarefa(String descricao, LocalDate data) {
        this.descricao = descricao;
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDate getData() {
        return data;
    }

    public boolean ocorreEm(int year, int month, int day) {
        return data.equals(LocalDate.of(year, month, day));
    }

    public class TarefaUnica extends tarefa {
        public TarefaUnica(String descricao, LocalDate data) {
            super(descricao, data);
        }
    }

    public class TarefaDiaria extends tarefa {
        public TarefaDiaria(String descricao, LocalDate data) {
            super(descricao, data);
        }

        @Override
        public boolean ocorreEm(int year, int month, int day) {
            return true;
        }
    }

    public class TarefaMensal extends tarefa {
        private int diaDoMes;

        public TarefaMensal(String descricao, LocalDate data, int diaDoMes) {
            super(descricao, data);
            this.diaDoMes = diaDoMes;
        }

        @Override
        public boolean ocorreEm(int year, int month, int day) {
            return day == diaDoMes;
        }
    }

}
