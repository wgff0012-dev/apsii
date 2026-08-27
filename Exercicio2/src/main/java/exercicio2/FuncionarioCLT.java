package exercicio2;

import java.time.LocalDate;

public class FuncionarioCLT extends Funcionario {
    private double valeTransporte;
    private double valeAlimentacao;

    public FuncionarioCLT(String nome, String matricula, double salarioBase, LocalDate dataAdmissao, double valeTransporte, double valeAlimentacao) {
        super(nome, matricula, salarioBase, dataAdmissao);
        this.valeTransporte = valeTransporte;
        this.valeAlimentacao = valeAlimentacao;
    }

    //inclui salário-base (via super) + benefícios
    @Override
    public double calcularSalario() {
        return super.calcularSalario() + this.valeTransporte + this.valeAlimentacao;
    }

    //mantém o desconto do pai (via super) + R$ 50,00
    @Override
    public double calcularDesconto() {
        return super.calcularDesconto() + 50.0;
    }

    @Override
    public String toString() {
        return super.toString() + 
               "\nCLT:" +
               "\nVale Transporte = R$ " + this.valeTransporte +
               "\nVale Alimentação = R$ " + this.valeAlimentacao;
    }
}
