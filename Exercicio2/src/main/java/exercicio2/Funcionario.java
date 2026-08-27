package exercicio2;

import java.time.LocalDate;

public class Funcionario {
    private String nome;
    private String matricula;
    private double salarioBase;
    private LocalDate dataAdmissao;

    public Funcionario(String nome, String matricula, double salarioBase, LocalDate dataAdmissao) {
        this.nome = nome;
        this.matricula = matricula;
        this.salarioBase = salarioBase;
        this.dataAdmissao = dataAdmissao;
    }

    // Retorna o salário-base
    public double calcularSalario() {
        return this.salarioBase;
    }

    // Calcula 8% do salário-base
    public double calcularDesconto() {
        return this.salarioBase * 0.08;
    }
    
    @Override
    public String toString() {
        return "Funcionario" +
                "\nNome= " + this.nome + 
                "\nMatrícula= " + this.matricula + 
                "\nSalário Base=R$ " + String.format("%.2f", calcularSalario()) +
                "\nData de Admissão= " + this.dataAdmissao +
                "\nSalário Líquido=R$ " + String.format("%.2f", calcularSalario() - calcularDesconto());
    }
}
