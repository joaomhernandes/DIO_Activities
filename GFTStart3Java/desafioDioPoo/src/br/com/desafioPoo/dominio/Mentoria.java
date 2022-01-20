package br.com.desafioPoo.dominio;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Mentoria {
	String titulo;
	String descricao;
	LocalDate data;
	
	public Mentoria() {
		super();
	}
		
	public Mentoria(String titulo, String descricao, LocalDate data) {
		super();
		this.titulo = titulo;
		this.descricao = descricao;
		this.data = data;
	}

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	@Override
	public String toString() {
		return "Mentoria [titulo="+ titulo 
				+ ", descricao="+ descricao 
				+ ", data=" + data.format(formatter) + "]";
	}
	
																
		

	
}
