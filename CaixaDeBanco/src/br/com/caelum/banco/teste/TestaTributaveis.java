package br.com.caelum.banco.teste;

import br.com.caelum.banco.agência.Ccorrente;
import br.com.caelum.banco.agência.Tributavel;

public class TestaTributaveis {
	public static void main (String[]args){
	
		Ccorrente cc = new Ccorrente();

		cc.deposita (1200);
		cc.saca(230);
	

	}

}
