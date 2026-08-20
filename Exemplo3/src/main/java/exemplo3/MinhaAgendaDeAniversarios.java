package exemplo3;

import java.util.ArrayList;

public class MinhaAgendaDeAniversarios{

    private ArrayList<Aniversariante> aniversariantes;
    public MinhaAgendaDeAniversarios() {
        this.aniversariantes = new ArrayList<>();
    }

    public void adicionarAniversariante(String nome, int dia, int mes) {
        DataAniversario data = new DataAniversario(dia, mes);
        Aniversariante novoAniversariante = new Aniversariante(nome, data);
        this.aniversariantes.add(novoAniversariante);
    }

    public ArrayList<String> obterAniversariantesDoDia(int dia, int mes) {
        ArrayList<String> nomesDoDia = new ArrayList<>();

        for (Aniversariante a : this.aniversariantes) {
            DataAniversario data = a.getDataAniversario();
            if (data.getDia() == dia && data.getMes() == mes) {
                nomesDoDia.add(a.getNome());
            }
        }
        return nomesDoDia;
    }

    public void removerAniversariante(String nome) {
        this.aniversariantes.removeIf(a -> a.getNome().equalsIgnoreCase(nome));
    }
}