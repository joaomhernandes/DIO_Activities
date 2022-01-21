package me.dio.gof.strategy;

/**
 * Rob� Interface Context
 * 
 * @author Jo�o Maur�cio Hernandes Carrenho
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
