package com.spring.rubrica.entity;

import java.sql.Date;

public class Contatto {
	private String nome, cognome, numero;
	private String gruppoAppartenenza = "default";
	private Date dataNascita;
	private boolean preferito;

	public Contatto() {}

	public Contatto(String nome, String cognome, String numero, String gruppoAppartenenza, Date dataNascita,
			boolean preferito) {
		this.nome = nome;
		this.cognome = cognome;
		this.numero = numero;
		this.gruppoAppartenenza = gruppoAppartenenza;
		this.dataNascita = dataNascita;
		this.preferito = preferito;
	}

	public String getNome() {return nome;}

	public void setNome(String nome) {this.nome = nome;}

	public String getCognome() {return cognome;}

	public void setCognome(String cognome) {this.cognome = cognome;}

	public String getNumero() {return numero;}

	public void setNumero(String numero) {this.numero = numero;}

	public String getGruppoAppartenenza() {return gruppoAppartenenza;}

	public void setGruppoAppartenenza(String gruppoAppartenenza) {this.gruppoAppartenenza = gruppoAppartenenza;}

	public Date getDataNascita() {return dataNascita;}

	public void setDataNascita(Date dataNascita) {this.dataNascita = dataNascita;}

	public boolean isPreferito() {return preferito;}

	public void setPreferito(boolean preferito) {this.preferito = preferito;}

}