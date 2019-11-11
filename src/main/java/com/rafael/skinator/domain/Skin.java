package com.rafael.skinator.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Skin implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private Exterior exterior;
	private Type type;
	private StatTrack statTrack;
	private Double price;
	private Double exteriorfloat;
	
	public Skin() {
	}

	public Skin(Integer id, String name, Exterior exterior, Type type, StatTrack statTrack, Double price,
			Double exteriorfloat) {
		super();
		this.id = id;
		this.name = name;
		this.exterior = exterior;
		this.type = type;
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

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Skin other = (Skin) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
