package br.com.caelum.banco.teste;

import br.com.caelum.banco.agência.Ccorrente;

public class TestaMetodos {
	

	public static void main (String[]args){
		Ccorrente minhaConta = new Ccorrente();
		int total = minhaConta.getnumeroDeContas();
		minhaConta.deposita (1200);
		minhaConta.saca (380);
		
		Ccorrente minhaConta2 = new Ccorrente();
		minhaConta2.deposita (12);
		minhaConta2.saca(430);
		
		System.out.println ("Saldo atual: R$" + minhaConta.getSaldo());
		System.out.println ("Saldo atual: R$"+minhaConta2.getSaldo());
		System.out.println ("Numero de contas:"+minhaConta.getnumeroDeContas());
		
		
	}

}
