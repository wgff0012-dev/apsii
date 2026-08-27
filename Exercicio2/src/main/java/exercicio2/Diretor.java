package exercicio2;

import java.time.LocalDate;

public class Diretor extends Gerente{
	private double participacaoLucros;
	
    public Diretor(String nome, String matricula, double salarioBase, LocalDate dataAdmissao, double valeTransporte, double valeAlimentacao, int tamanhoEquipe, double percentualBonus, double participacaoLucros) {
        super(nome, matricula, salarioBase, dataAdmissao, valeTransporte, valeAlimentacao, tamanhoEquipe, percentualBonus);
        this.participacaoLucros = participacaoLucros;
    }
    
    // Salário do Gerente + o lucro
    @Override
    public double calcularSalario() {
        return super.calcularSalario() + this.participacaoLucros;
    }
    
    
    //sem mudança no Desconto
    @Override
    public double calcularDesconto() {
        return super.calcularDesconto();
    }
    
    @Override
    public String toString() {
        return super.toString() + 
               "\nDiretor" +
               "\nparticipacaoLucros = " + this.participacaoLucros;
    }

}
