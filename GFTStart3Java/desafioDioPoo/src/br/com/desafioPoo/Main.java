package br.com.desafioPoo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import br.com.desafioPoo.dominio.Curso;
import br.com.desafioPoo.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descrição curso Java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso JS");
		curso2.setDescricao("Descrição curso JS");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria1 = new Mentoria("Mentoria Java","Descrição mentoria Java", LocalDate.now());
		
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria1);
		
	}
	
	
}
