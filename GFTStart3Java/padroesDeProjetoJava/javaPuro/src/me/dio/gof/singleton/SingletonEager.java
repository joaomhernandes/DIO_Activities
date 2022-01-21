package me.dio.gof.singleton;

/**
 * Singleton "apressado".
 * 
 * @author Jo�o Maur�cio Hernandes Carrenho
 */

public class SingletonEager {

private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager() {
		super();
	}
	
	public static SingletonEager getInstancia() {
		return instancia;
	}
}