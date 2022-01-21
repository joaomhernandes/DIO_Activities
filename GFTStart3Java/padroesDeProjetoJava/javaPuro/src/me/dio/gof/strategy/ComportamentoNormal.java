package me.dio.gof.strategy;

/**
 * Comportamento Normal interface implementation
 * 
 * @author João Maurício Hernandes Carrenho
 */

public class ComportamentoNormal implements Comportamento{

	@Override
	public void mover() {
		System.out.println("movendo-se normalmente...");
		
	}
	

}
