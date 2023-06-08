package principal;

import models.ContaCorrente;

public class Principal {

	public static void main(String[] args) {

			ContaCorrente conta = new ContaCorrente("Marcos", "123", "123");
			
			System.out.println(conta.getSaldo());
			
			conta.depositar(1000);
			
			System.out.println(conta.getSaldo());
			
			conta.depositar(1000000);
			
			System.out.println(conta.getSaldo());

	}

}
