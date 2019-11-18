package com.rafael.skinator.skin.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Skin implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private Exterior exterior;
	private Type tipo;
	private StatTrack statTrack;
	private Double price;
	private Double exteriorfloat;
	//private Set<Stiker> stikers = new HashSet<>();	
	
	public Skin() {}

	public Skin(Integer id, String name, Exterior exterior, Type tipo, StatTrack statTrack, Double price,
			Double exteriorfloat) {
		super();
		this.id = id;
		this.name = name;
		this.exterior = exterior;
		this.tipo = tipo;
		this.statTrack = statTrack;
		this.price = price;
		this.exteriorfloat = exteriorfloat;
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

	public Exterior getExterior() {
		return exterior;
	}

	public void setExterior(Exterior exterior) {
		this.exterior = exterior;
	}

	public Type getTipo() {
		return tipo;
	}

	public void setTipo(Type tipo) {
		this.tipo = tipo;
	}

	public StatTrack getStatTrack() {
		return statTrack;
	}

	public void setStatTrack(StatTrack statTrack) {
		this.statTrack = statTrack;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getExteriorfloat() {
		return exteriorfloat;
	}

	public void setExteriorfloat(Double exteriorfloat) {
		this.exteriorfloat = exteriorfloat;
	}

	
	
}
