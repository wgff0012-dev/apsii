package exercicio2;

import java.time.LocalDate;

public class Estagiario extends Funcionario {
    private double valorBolsaAuxilio;
    private int cargaHorariaSemanal;

    public Estagiario(String nome, String matricula, double salarioBase, LocalDate dataAdmissao, double valorBolsaAuxilio, int cargaHorariaSemanal) {
        super(nome, matricula, salarioBase, dataAdmissao);
        this.valorBolsaAuxilio = valorBolsaAuxilio;
        this.cargaHorariaSemanal = cargaHorariaSemanal;
    }

    // Sobrescrita do salário: para o estagiário, o salário é igual ao valor da bolsa-auxílio
    @Override
    public double calcularSalario() {
        return this.valorBolsaAuxilio;
    }

    // Sobrescrita do desconto: estagiários não possuem desconto (R$ 0,00)
    @Override
    public double calcularDesconto() {
        return 0.0;
    }

    @Override
    public String toString() {
        return super.toString() + 
               "\nEstagiário" + 
               "\nBolsa Auxílio = R$ " + this.valorBolsaAuxilio + 
               "\nCarga Horária = " + this.cargaHorariaSemanal + "h/semana";
    }
}
