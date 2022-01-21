package me.dio.gof.strategy;

/**
 * Robô Interface Context
 * 
 * @author João Maurício Hernandes Carrenho
 */


public class Robo {
	private Comportamento comportamento;
	
	public void setComportamento (Comportamento comportamento) {
		this.comportamento = comportamento;
	}
	
	public void mover() {
		comportamento.mover();
	}
}
