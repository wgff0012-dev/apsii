package exercicio2;

import java.time.LocalDate;

public class Gerente extends FuncionarioCLT {
    private int tamanhoEquipe;
    private double percentualBonus;

    public Gerente(String nome, String matricula, double salarioBase, LocalDate dataAdmissao, double valeTransporte, double valeAlimentacao, int tamanhoEquipe, double percentualBonus) {
        super(nome, matricula, salarioBase, dataAdmissao, valeTransporte, valeAlimentacao);
        this.tamanhoEquipe = tamanhoEquipe;
        this.percentualBonus = percentualBonus;
    }

    // Salário de FuncionarioCLT + (salarioBase * percentualBonus)
    @Override
    public double calcularSalario() {
        double salarioCLT = super.calcularSalario();
        double bonus = salarioCLT * (this.percentualBonus/100);
        double salariocombonus = salarioCLT + bonus;
        return salariocombonus;
        	
    }

    // Desconto de FuncionarioCLT + R$ 100,00 (caso a equipe tenha mais de 10 pessoas)
    @Override
    public double calcularDesconto() {
        double descontoCLT = super.calcularDesconto();
        if (this.tamanhoEquipe > 10) {
            descontoCLT += 100.0;
        }
        return descontoCLT;
    }

    @Override
    public String toString() {
        return super.toString() + 
               "\nGerente" +
               "\nTamanho da Equipe = " + this.tamanhoEquipe + 
               "\nBônus = " + (percentualBonus) + "%";
    }
}










