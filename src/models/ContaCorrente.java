package models;

import java.lang.reflect.Array;
import java.util.Random;

public class ContaCorrente {
	public String titular;
	private double saldo;
	public String cpf;
	public String cartao;
	public String senha;
	public double cheque_especial;
	public double limite_cartao;
	public int numero;
	public String agencia;
	public String[] chave_pix;
	public String[] extrato;
	public double valorEmJuizo;
	
	public ContaCorrente(String titular, String cpf, String senha) {
		this.titular = titular;
		this.cpf = cpf;
		this.senha = senha;
		this.saldo = 0;
		this.cheque_especial = 0;
		this.limite_cartao = 0;
		
		this.agencia = "0001";
		this.numero = (1000000 % new Random().nextInt()) + 1000;
	}
	
	public double getSaldo() {
		return this.saldo;
	}

	public void depositar(double valor) {
		this.saldo += valor;
		
		if(valorEmJuizo > 0) {
			this.saldo -= valorEmJuizo;
		}
	}
	
	public void sacar(double valor) {
		
		if(saldo + cheque_especial <= 0) {
			System.out.println("Você não possui saldo suficiente");
		} else if(saldo <= 0 && cheque_especial > 0) {
			this.saldo = cheque_especial -= valor;
		} else if(saldo > 0){
			this.saldo -= valor;
			System.out.println("Saque realizado com sucesso! Seu saldo é de: R$" + saldo);
		}
	}
	
	public void transferir(String agencia, int conta, double valor) {
		
	}
	
	public void transferirPix(String pix, double valor) {
		
	}
	
	public String[][] getTitular(String nome, String cpf) {
		String[][] valor = {{nome}, {cpf}};
		
		return valor;
	}
}
