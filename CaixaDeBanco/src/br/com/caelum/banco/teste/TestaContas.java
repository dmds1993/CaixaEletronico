package br.com.caelum.banco.teste;

import br.com.caelum.banco.agência.Ccorrente;
import br.com.caelum.banco.agência.ContaPoupanca;

public class TestaContas {
	public static void main (String[]args){
		Ccorrente c1 = new Ccorrente();
		Ccorrente  c = new Ccorrente();
		ContaPoupanca cp = new ContaPoupanca();
		c1.setTitular ("Daniel");
		cp.setTitular("Michelle");
		c1.deposita(1000);
		cp.deposita (999.90);
		c.deposita (1000);
		c1.saca (0);
		
		System.out.println(c1);
		System.out.println (cp);
		System.out.println(c1.equals(cp));
	
		
		
	}

}
