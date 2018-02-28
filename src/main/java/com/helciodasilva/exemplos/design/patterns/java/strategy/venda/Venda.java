package com.helciodasilva.exemplos.design.patterns.java.strategy.venda;

public class Venda {

	private final Funcionario funcionario;

	private final double valor;

	public Venda(Funcionario funcionario, double valor) {
		this.funcionario = funcionario;
		this.valor = valor;
	}

	public double calculaComissao() {

		double comissao = 0.0;

		Cargo cargo = this.funcionario.getCargo();
		if (cargo.equals(Cargo.ATENDENTE)) {
			comissao = valor * 0.1;
		} else if (cargo.equals(Cargo.VENDEDOR)) {
			comissao = valor * 0.15 + 5;
		} else if (cargo.equals(Cargo.GERENTE)) {
			comissao = valor * 0.20 + 10;
		} else if (cargo.equals(Cargo.AJUDANTE)) {
			comissao = valor * 0.08 + 1;
		} else if (cargo.equals(Cargo.RECEPCIONISTA)) {
			comissao = valor * 0.05;
		} else if (cargo.equals(Cargo.DIRETOR)) {
			comissao = valor * 0.25 + 20;
		}

		return comissao;
	}

}