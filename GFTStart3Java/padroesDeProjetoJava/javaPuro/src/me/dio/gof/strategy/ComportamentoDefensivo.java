package me.dio.gof.strategy;

/**
 * Comportamento Defensivo interface implementation
 * 
 * @author Jo�o Maur�cio Hernandes Carrenho
 */

public class ComportamentoDefensivo implements Comportamento{

	@Override
	public void mover() {
		System.out.println("movendo-se defensivamente...");
		
	}
	

}
