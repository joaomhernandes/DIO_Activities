package desafioPraticoGFT.rendaFuncionario.model;

import java.util.Date;

public class Funcionario {
	protected String nome;
	protected String matricula;
	protected double salario;
	protected Date dataAdimissao;
	protected String CPF;
	public Funcionario(String nome, String matricula, double salario, Date dataAdimissao, String cPF) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.salario = salario;
		this.dataAdimissao = dataAdimissao;
		CPF = cPF;
	}


	public void receberAumento(double aumento) {
		this.salario += aumento ;
	}
	
	public double calcularGanhoBrutoAnual() {
		return (this.salario*12);
	}
	
	public double calculaImposto() {
		return (this.salario > 2500.00 ?(this.salario - 2500)*0.175*12 : 0);
	}
	public double calculaGanhoLiquidoMensal() {
		if(this.salario > 2500.00) {
			return (this.salario-((this.salario-2500)*0.175)-this.salario*0.11);
		}else {
			return(this.salario-this.salario*0.11);
		}
	}
	
	public double calculaGanhoLiquidoAnual() {
		return calculaGanhoLiquidoMensal()*12;
	}


	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", matricula=" + matricula + ", salario=" + salario + ", dataAdimissao="
				+ dataAdimissao + ", CPF=" + CPF + ", calcularGanhoBrutoAnual()=" + calcularGanhoBrutoAnual() + "]";
	}
	
	
}
