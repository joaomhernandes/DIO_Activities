package me.dio.gof.singleton;

/**
 * Singleton "apressado".
 * 
 * @author João Maurício Hernandes Carrenho
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