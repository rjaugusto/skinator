package com.rafael.skinator.skin.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
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

}
