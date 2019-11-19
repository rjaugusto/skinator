package com.rafael.skinator.skin.domain;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@Entity
public class Key implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private Double valor;
	private Case box;
	
	public Key(){}
	
	public Key(Integer id, String name, Double valor, Case box) {
		super();
		this.id = id;
		this.name = name;
		this.valor = valor;
		this.box = box;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Case getBox() {
		return box;
	}

	public void setBox(Case box) {
		this.box = box;
	}
}
