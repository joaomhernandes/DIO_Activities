package me.dio.gof.singleton;

/**
 * Singleton "Lazy Holder".
 * 
 * @see <a href="http://stackoverflow.com/a/24018148">Refer�ncia</a>
 * 
 * @author Jo�o Maur�cio Hernandes Carrenho
 */

public class SingletonLazyHolder {

		private static class Holder{
			public static SingletonLazyHolder instancia = new SingletonLazyHolder();
		}
		
		private SingletonLazyHolder() {
			super();
		}
		
		public static SingletonLazyHolder getIntancia() {
			return Holder.instancia;
		}

	}
