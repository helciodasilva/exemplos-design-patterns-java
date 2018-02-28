package com.helciodasilva.exemplos.design.patterns.java.strategy.venda;

public class Main {

	public static void main(String[] args) {

		Funcionario atendente = new Funcionario();
		atendente.setNome("Maria da Silva");
		atendente.setSalario(1200.00);
		atendente.setCargo(Cargo.ATENDENTE);

		Venda novaVenda = new Venda(atendente, 200.0);

		System.out.println("valor da comiss�o: " + novaVenda.calculaComissao());

	}

}