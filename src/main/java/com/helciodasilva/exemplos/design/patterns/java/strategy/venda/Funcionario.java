package com.helciodasilva.exemplos.design.patterns.java.strategy.venda;

public class Funcionario {

	private String nome;
	
	private double salario;
	
	private Cargo cargo;

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public Cargo getCargo() {
		return cargo;
	}

}