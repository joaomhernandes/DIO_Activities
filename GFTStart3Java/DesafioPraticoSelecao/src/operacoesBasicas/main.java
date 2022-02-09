package operacoesBasicas;
import operacoesBasicas.operacoes.Soma;
import operacoesBasicas.operacoes.Subtracao;
import operacoesBasicas.operacoes.Multiplicacao;
import operacoesBasicas.operacoes.Divisao;

public class main {

	

	public static void main(String[] args) {
		Soma soma = new Soma();
		Subtracao sub = new Subtracao();
		Multiplicacao mult = new Multiplicacao();
		Divisao div = new Divisao();
		
		int a = 20;
		int b = 10;
		System.out.println("Operações realizadas para a = 20 e b = 10\n");
		System.out.println("a + b = "+soma.calcula(a,b));
		System.out.println("a - b = "+sub.calcula(a,b));
		System.out.println("a * b = "+mult.calcula(a,b));
		System.out.println("a / b = "+div.calcula(a,b));
		System.out.printf("\n===============================\n");
		
		a = 198;
		b = 99;
		
		System.out.println("\nOperações realizadas para a = 198 e b = 99\n");
		System.out.println("a + b = "+soma.calcula(a,b));
		System.out.println("a - b = "+sub.calcula(a,b));
		System.out.println("a * b = "+mult.calcula(a,b));
		System.out.println("a / b = "+div.calcula(a,b));
		System.out.printf("\n===============================\n");
		
		a = 11549;
		b = 9284;
		
		System.out.println("\nOperações realizadas para a = 11549 e b = 9284\n");
		System.out.println("a + b = "+soma.calcula(a,b));
		System.out.println("a - b = "+sub.calcula(a,b));
		System.out.println("a * b = "+mult.calcula(a,b));
		System.out.println("a / b = "+div.calcula(a,b));
		System.out.printf("\n===============================\n");
		
		a = 99999;
		b = 9;
		
		System.out.println("\nOperações realizadas para a = 99999 e b = 9\n");
		System.out.println("a + b = "+soma.calcula(a,b));
		System.out.println("a - b = "+sub.calcula(a,b));
		System.out.println("a * b = "+mult.calcula(a,b));
		System.out.println("a / b = "+div.calcula(a,b));
		System.out.printf("\n===============================\n");
		
		

	}

}
