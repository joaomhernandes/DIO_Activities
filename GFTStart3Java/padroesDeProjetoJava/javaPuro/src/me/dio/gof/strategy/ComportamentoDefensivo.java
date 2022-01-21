package me.dio.gof.strategy;

/**
 * Comportamento Defensivo interface implementation
 * 
 * @author João Maurício Hernandes Carrenho
 */

public class ComportamentoDefensivo implements Comportamento{

	@Override
	public void mover() {
		System.out.println("movendo-se defensivamente...");
		
	}
	

}
