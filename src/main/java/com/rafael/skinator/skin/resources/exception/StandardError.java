package com.rafael.skinator.skin.resources.exception;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode(of="id")
public class StandardError implements Serializable{

	private static final long serialVersionUID = 1L;
	private Integer status;
	private String msg;
	private LocalDateTime instante;
	
	public StandardError(Integer status, String msg, LocalDateTime instante) {
		super();
		this.status = status;
		this.msg = msg;
		this.instante = instante;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public LocalDateTime getInstante() {
		return instante;
	}

	public void setInstante(LocalDateTime instante) {
		this.instante = instante;
	}
	
	
	
	
 
}
