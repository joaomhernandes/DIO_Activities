package desafioPraticoGFT.rendaFuncionario;

import java.text.SimpleDateFormat;
import java.util.Date;

import desafioPraticoGFT.rendaFuncionario.model.Funcionario;

public class Main {

	public static void main(String[] args) {
		SimpleDateFormat formatter= new SimpleDateFormat("dd-MM-yyyy");
		Date date = new Date(System.currentTimeMillis());
		
		System.out.println(date);
		
		Funcionario funcionario = new Funcionario("João", "1111", 5000.00, date , "111.222.333-44");
		
		funcionario.receberAumento(1000.00);
		System.out.println("O valor do imposto anual e: "+ funcionario.calculaImposto());
		System.out.println("O valor do ganho liquido mensal e: "+funcionario.calculaGanhoLiquidoMensal());
		System.out.println("O valor do ganho liquido anual e: "+funcionario.calculaGanhoLiquidoAnual());
		
		System.out.println(funcionario);

	}

}
