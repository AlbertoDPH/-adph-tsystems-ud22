package com.delpozo.ud22_02.modelo;

public class Video {
	
	/**
	 * Clase que construye videos
	 */
	private int id;
	private String titulo;
	private String director;
	private int cli_id;
	
	/**
	 * Constructor por defecto
	 */
	public Video() {}
	
	/**
	 * Constructor encargado de construir videos
	 * @param id
	 * @param titulo
	 * @param director
	 * @param cli_id
	 */
	public Video(int id, String titulo, String director, int cli_id) {
		this.id = id;
		this.titulo = titulo;
		this.director = director;
		this.cli_id = cli_id;
	}


	// Getters and Setters
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getDirector() {
		return director;
	}


	public void setDirector(String director) {
		this.director = director;
	}
	
	public int getCli_id() {
		return cli_id;
	}

	public void setCli_id(int cli_id) {
		this.cli_id = cli_id;
	}
	
}
