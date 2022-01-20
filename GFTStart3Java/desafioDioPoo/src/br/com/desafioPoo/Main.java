package br.com.desafioPoo;

import java.time.LocalDate;

import br.com.desafioPoo.dominio.Bootcamp;
import br.com.desafioPoo.dominio.Curso;
import br.com.desafioPoo.dominio.Dev;
import br.com.desafioPoo.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descri��o curso Java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso JS");
		curso2.setDescricao("Descri��o curso JS");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria = new Mentoria("Mentoria Java","Descri��o mentoria Java", LocalDate.now());

		Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descri��o Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conte�dos Inscritos Camila:" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conte�dos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conte�dos Conclu�dos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Jo�o Maur�cio");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conte�dos Inscritos Jo�o Maur�cio: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conte�dos Inscritos Jo�o Maur�cio:" + devJoao.getConteudosInscritos());
        System.out.println("Conte�dos Concluidos Jo�o Maur�cio:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());
		
	}
	
	
}
