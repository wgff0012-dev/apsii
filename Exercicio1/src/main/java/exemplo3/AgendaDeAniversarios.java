package exemplo3;

import java.util.ArrayList;

public class AgendaDeAniversarios {

    public static void main(String[] args) {
    	
        MinhaAgendaDeAniversarios agenda = new MinhaAgendaDeAniversarios();
        agenda.adicionarAniversariante("Maria", 20, 8);
        agenda.adicionarAniversariante("João", 20, 8);
        agenda.adicionarAniversariante("Lucas", 15, 10);


        System.out.println("Aniversariantes do dia 20/08");
        ArrayList<String> doDia = agenda.obterAniversariantesDoDia(20, 8);
        for (String nome : doDia) {
            System.out.println("- " + nome);
        }
        doDia.clear();

        System.out.println("\nRemovendo Maria");
        agenda.removerAniversariante("Maria");

        System.out.println("\nAniversariantes do dia 20/08 após remoção");
        doDia = agenda.obterAniversariantesDoDia(20, 8);
        for (String nome : doDia) {
            System.out.println("- " + nome);
        }
    }
}