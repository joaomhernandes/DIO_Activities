package me.dio.gof.strategy;

/**
 * Comportamento Normal interface implementation
 * 
 * @author Jo�o Maur�cio Hernandes Carrenho
 */

public class ComportamentoNormal implements Comportamento{

	@Override
	public void mover() {
		System.out.println("movendo-se normalmente...");
		
	}
	

}
