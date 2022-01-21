package me.dio.gof.strategy;

/**
 * Comportamento Agressivo interface implementation
 * 
 * @author João Maurício Hernandes Carrenho
 */


public class ComportamentoAgressivo implements Comportamento{

	@Override
	public void mover() {
		System.out.println("movendo-se agressicamente...");
		
	}
	

}
