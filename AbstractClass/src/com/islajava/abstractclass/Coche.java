package com.islajava.abstractclass;

public class Coche extends Vehiculo {

	private Integer numPuertas;
	private Boolean aireAcondicionado;
	private boolean elevalunas;
	public Integer getNumPuertas() {
		return numPuertas;
	}
	public void setNumPuertas(Integer numPuertas) {
		this.numPuertas = numPuertas;
	}
	public Boolean getAireAcondicionado() {
		return aireAcondicionado;
	}
	public void setAireAcondicionado(Boolean aireAcondicionado) {
		this.aireAcondicionado = aireAcondicionado;
	}
	public boolean isElevalunas() {
		return elevalunas;
	}
	public void setElevalunas(boolean elevalunas) {
		this.elevalunas = elevalunas;
	}
	
	
}
